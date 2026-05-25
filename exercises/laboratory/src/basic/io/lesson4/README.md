# Basic Java - Lesson 4
## Basic use of `Scanner`, `String` and int` variable declarations, use of the `+` operator for string concatenation.

## Objective
Learn how to use the `Scanner` class to read basic user input, including text (`String`) and integer (`int`) values.
Use of the `+` operator for string concatenation.
## Instructions

1. Create a new Java file named `BasicInput.java`

2. Inside the class, define the `main` method.

3. Import the `Scanner` class:
   ```java
   import java.util.Scanner;
   ```

4. Create and instantiate a `Scanner` object named `scanner` as follows:
   ```java
   Scanner scanner = new Scanner(System.in);
   ```

5. Declare a `String` variable named `userName`:
   ```java
   String userName;
   ```

6. Declare an integer variable named `myAge`:
   ```java
   int myAge;
   ```

7. Use `System.out.println` to display welcome and prompt messages for the user.

8. Use `System.out.println` and the `+` operator to concatenate and display strings, as shown in the following example:
   ```java
   System.out.println("You’re " + myAge + " years old — it’s always a good age to learn programming.");
   ```

9. Close the `Scanner` object:
   ```java
   scanner.close();
   ```

10. Save the file and compile it using the Java compiler:
    ```bash
    javac BasicInput.java
    ```

11. Run the program using:
    ```bash
    java BasicInput
    ```

---

## Expected Outcome

By the end of this activity, you should be able to:

- Understand the basic use of the `Scanner` class for user input
- Create `String` and `int` variables
- Use the `+` operator to concatenate strings and variables

---

## Example Output

```text
User name: Joseph
Your age: 26

Hello!
Nice to meet you, Joseph.
Welcome to the amazing world of Java!

You’re 26 years old — it’s always a good age to learn programming.
```