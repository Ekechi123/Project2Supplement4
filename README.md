# Project 2 Supplement 4: Random Hexadecimal Generator

## Project Description
This Java project generates a random hexadecimal string in the format:
`xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx`. It includes a method to generate
the hexadecimal string, a test class to ensure the output is correct, and
documentation to explain the implementation.

## Features
- Generates random hexadecimal strings in the format `xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx`.
- Includes a test to check if the string length is correct (36 characters including dashes).
- Verifies that the string matches the expected format using regex.

## Technologies Used
- Java (JDK 8+)
- No external libraries are required for this project.

## Installation Instructions
1. Clone the repository:
    ```
    git clone https://github.com/Ekechi123/Project2Supplement4.git
    ```

2. Navigate to the project directory:
    ```
    cd Project2Supplement4
    ```

3. Compile the Java files:
    ```
    javac Project2Supplement4.java Project2Supplement4Test.java
    ```

4. Run the main method to see the generated hexadecimal string:
    ```
    java Project2Supplement4
    ```

## Testing
The project includes a test class `Project2Supplement4Test.java`, which verifies:
- The generated string has the correct length (36 characters).
- The string matches the format `xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx`.

You can run the tests by executing the `Project2Supplement4Test.java` class.

## Usage
When you run the program, it will generate and print a random hexadecimal string formatted as `xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx`.

