#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <string.h>
#include <fcntl.h>
#include <signal.h>

#define MAX_ARGS 64
#define MAX_INPUT 1024

void execute_command(char *args[], int background, char *output_file) {
    pid_t pid = fork();
    if (pid < 0) {
        perror("fork");
        exit(EXIT_FAILURE);
    } else if (pid == 0) { // Child process
        // Redirect output if output file is specified
        if (output_file != NULL) {
            int fd = open(output_file, O_WRONLY | O_CREAT | O_TRUNC, 0644);
            if (fd < 0) {
                perror("open");
                exit(EXIT_FAILURE);
            }
            dup2(fd, STDOUT_FILENO);
            close(fd);
        }
        
        execvp(args[0], args);
        perror("execvp");
        exit(EXIT_FAILURE);
    } else { // Parent process
        if (!background)
            waitpid(pid, NULL, 0);
        else
            printf("[%d] %d\n", getpid(), pid);
    }
}


void execute_piped_commands(char *command1[], char *command2[]) {
    int pipefd[2];
    if (pipe(pipefd) == -1) {
        perror("pipe");
        exit(EXIT_FAILURE);
    }

    pid_t pid1 = fork();
    if (pid1 < 0) {
        perror("fork");
        exit(EXIT_FAILURE);
    } else if (pid1 == 0) { // Child process 1
        close(pipefd[0]); // Close unused read end
        dup2(pipefd[1], STDOUT_FILENO); // Redirect stdout to pipe
        close(pipefd[1]); // Close write end
        execvp(command1[0], command1);
        perror("execvp");
        exit(EXIT_FAILURE);
    }

    pid_t pid2 = fork();
    if (pid2 < 0) {
        perror("fork");
        exit(EXIT_FAILURE);
    } else if (pid2 == 0) { // Child process 2
        close(pipefd[1]); // Close unused write end
        dup2(pipefd[0], STDIN_FILENO); // Redirect stdin to pipe
        close(pipefd[0]); // Close read end
        execvp(command2[0], command2);
        perror("execvp");
        exit(EXIT_FAILURE);
    }

    close(pipefd[0]);
    close(pipefd[1]);

    waitpid(pid1, NULL, 0);
    waitpid(pid2, NULL, 0);
}

void signal_handler(int signum) {
    if (signum == SIGINT) {
        // Handle SIGINT (CTRL-C) - Do nothing
    } else if (signum == SIGQUIT) {
        // Handle SIGQUIT (CTRL-\) - Do nothing
    }
}

int main() {
    signal(SIGINT, signal_handler);
    signal(SIGQUIT, signal_handler);

    char input[MAX_INPUT];
    char *args[MAX_ARGS];
    int background;
    char *output_file; // Added variable for output file

    while (1) {
        background = 0;
        output_file = NULL; // Initialize output file to NULL

        printf("myShell@Mohan:~$ ");
        fflush(stdout);

        if (fgets(input, sizeof(input), stdin) == NULL) {
            printf("\n");
            break;
        }

        // Remove trailing newline
        input[strcspn(input, "\n")] = 0;

        // Tokenize input
        char *token = strtok(input, " ");
        int i = 0;
        while (token != NULL) {
            if (strcmp(token, "&") == 0) {
                background = 1;
            } else if (strcmp(token, ">") == 0) {
                token = strtok(NULL, " "); // Get next token which is the output file name
                output_file = token; // Set output file
            } else if (strcmp(token, "|") == 0) {
                break;
            } else {
                args[i++] = token;
            }
            token = strtok(NULL, " ");
        }
        args[i] = NULL;

        if (i == 0) // Empty input
            continue;

        if (strcmp(args[0], "exit") == 0) {
            break;
        } else if (strcmp(args[0], "cd") == 0) {
            if (args[1] != NULL) {
                if (chdir(args[1]) != 0) {
                    perror("cd");
                }
            } else {
                printf("Usage: cd <directory>\n");
            }
        } else {
            if (background && (strcmp(args[i-1], "&") == 0)) {
                args[i-1] = NULL;
            }

            int pipe_index = -1;
            for (int j = 0; j < i; j++) {
                if (strcmp(args[j], "|") == 0) {
                    pipe_index = j;
                    args[j] = NULL; // Null-terminate before the pipe
                    break;
                }
            }

            if (pipe_index != -1) {
                char *command1[pipe_index + 1];
                char *command2[i - pipe_index];
                memcpy(command1, args, (pipe_index) * sizeof(char *));
                memcpy(command2, args + pipe_index + 1, (i - pipe_index - 1) * sizeof(char *));
                command1[pipe_index] = NULL;
                command2[i - pipe_index - 1] = NULL;
                execute_piped_commands(command1, command2);
            } else {
                execute_command(args, background, output_file); // Pass output_file argument
            }
        }
    }

    return 0;
}

