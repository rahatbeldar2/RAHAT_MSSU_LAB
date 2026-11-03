# pipes.py
import os

read_fd, write_fd = os.pipe()

pid = os.fork()

if pid > 0:

    os.close(read_fd)

    message = "Hello from Parent!"
    os.write(write_fd, message.encode())

    os.close(write_fd)

else:
    os.close(write_fd)

    message = os.read(read_fd, 100).decode()
    print("Child received:", message)

    os.close(read_fd)