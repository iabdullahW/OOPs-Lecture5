# Java Constructors Example

## Description

This project demonstrates the use of constructors in Java. The `constUse` class has two types of constructors:

1. **Default Constructor**: Prints a message when an object is created without passing any arguments.
2. **Parameterized Constructor**: Accepts an integer value and calculates the sum of numbers from 1 to that integer. The result is then printed to the console.

The `Lecture5` class contains the `main` method, which creates objects of the `constUse` class to show how these constructors work.

## Code Overview

- **Class: `constUse`**
  - `constUse()`: Default constructor that prints a default message.
  - `constUse(int i)`: Parameterized constructor that takes an integer and calls the `sumValue` method to calculate the sum from 1 to `i`.
  - `int sumValue(int i)`: Method that computes the sum of integers from 1 to `i` and returns the result.

- **Class: `Lecture5`**
  - Contains the `main` method, where objects of `constUse` are instantiated to demonstrate both constructors.

## Usage

To run this program:
1. Compile the Java classes using:
    ```bash
    javac constUse.java Lecture5.java
    ```
2. Run the main class:
    ```bash
    java Lecture5
    ```

## Output

The output of the program will be:
