# Multithread Messaging System

This project demonstrates a multithreaded messaging system implemented in Java. It includes a `Messenger` thread that produces messages and a `Subscriber` thread that consumes messages using a shared `MessageQueue`.

## Features

- **Messenger Thread**: Produces 20 unique messages and adds them to the shared `MessageQueue`. It sleeps for a random time between 0 and 1 second after each message insertion.
- **Subscriber Thread**: Consumes messages from the `MessageQueue`. If the queue is empty, it prints a message indicating there are no messages to read.
- **MessageQueue**: A synchronized shared resource that stores messages in a thread-safe manner.
- **Util Class**: Provides a utility method for generating the current timestamp for logging purposes.
- **Multithreading Management**: Uses `ExecutorService` to manage threads, ensuring proper termination and execution.

## Classes

### `Messenger`
- Produces 20 messages with unique identifiers.
- Sleeps for a random time (0-1 seconds) after adding each message.
- Prints each inserted message along with its timestamp.

### `Subscriber`
- Reads messages from the `MessageQueue` and prints them with a timestamp.
- If no messages are available, it prints a "no message" indicator.
- Sleeps for a random time (0-1 seconds) between read attempts.

### `MessageQueue`
- A thread-safe queue for storing messages.
- Provides methods for adding and retrieving messages (`addMessage` and `getMessage`).

### `Util`
- Contains a static method `getCurrentTime()` to generate the current timestamp in `yyyy-MM-dd HH:mm:ss.SSS` format.

### `MessageTest`
- Tests the messaging system by creating and executing the `Messenger` and `Subscriber` threads.
- Runs the test twice using a fixed thread pool (`ExecutorService`) to manage threads.
