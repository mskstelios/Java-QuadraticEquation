# Java-QuadraticSolver

A simple Java program that solves quadratic equations of the form:

\[ ax^2 + bx + c = 0 \]

The program uses the **discriminant** method to find the roots of the equation, providing solutions based on the value of the discriminant. It will calculate real and distinct, real and equal, or complex roots, and display the results in a user-friendly, formatted output.

## Features

- **Solves Quadratic Equations**: The program solves equations of the form \( ax^2 + bx + c = 0 \).
- **Discriminant Logic**: The program computes the discriminant (\( D = b^2 - 4ac \)) to determine the nature of the roots.
  - If \( D > 0 \): Two distinct real roots.
  - If \( D = 0 \): One real root (repeated).
  - If \( D < 0 \): Two complex roots.
- **Formatted Output**: The results are displayed with formatted output, including the values of the roots or complex solutions.
- **User Input**: The program prompts the user to input the coefficients of the quadratic equation.

## Requirements

- **Java 8 or later** (for running the program)
- **IDE**: IntelliJ IDEA, Eclipse, or any Java-compatible IDE.

## Installation

### 1. Clone the Repository

Clone the repository to your local machine:

```bash
git clone https://github.com/mskstelios/Java-QuadraticSolver.git
