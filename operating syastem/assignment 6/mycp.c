#include <stdio.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/stat.h>
#include <sys/types.h>

int main() {
    char buf;
    int fd_one, fd_two;

    fd_one = open("mohan.txt", O_RDONLY);

    if (fd_one == -1) {
        perror("Error opening first_file");
        return 1;
    }

    // O_WRONLY | O_CREAT | O_TRUNC ensures that the file is created if it does not exist,
    // and it's truncated to zero length if it already exists
    fd_two = open("second_file", O_WRONLY | O_CREAT | O_TRUNC, S_IRUSR | S_IWUSR | S_IRGRP | S_IROTH);

    if (fd_two == -1) {
        perror("Error opening/creating second_file");
        close(fd_one);
        return 1;
    }

    while (read(fd_one, &buf, 1) > 0) {
        if (write(fd_two, &buf, 1) != 1) {
            perror("Error writing to second_file");
            close(fd_one);
            close(fd_two);
            return 1;
        }
    }

    if (read(fd_one, &buf, 1) == -1) {
        perror("Error reading from first_file");
        close(fd_one);
        close(fd_two);
        return 1;
    }

    printf("Successful copy\n");

    close(fd_one);
    close(fd_two);

    return 0;
}
