#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main(int argc, char *argv[]) {
    if (argc != 2) {
        fprintf(stderr, "Usage: %s <filename>\n", argv[0]);
        return 1;
    }

    int fd = open(argv[1], O_RDONLY);
    if (fd == -1) {
        perror("Error opening file");
        return 1;
    }

    char buffer;
    int charCount = 0;

    while (read(fd, &buffer, 1) > 0) {
        charCount++;
    }

    if (charCount == -1) {
        perror("Error reading from file");
        close(fd);
        return 1;
    }

    close(fd);

    printf("Number of characters in %s: %d\n", argv[1], charCount);

    return 0;
}
