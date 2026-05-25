package basic.operators.exercise1;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Basic arithmetic operations");
        System.out.println("[+][-][*][/]");

        System.out.print("\nInput first number: ");
        number1 = scanner.nextInt();

        System.out.print("Input second number: ");
        number2 = scanner.nextInt();

        System.out.println("\n\tAddition of " + number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println("\tSubtraction " + number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println("\tMultiplication of " + number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println("\tDivision of " + number1 + " / " + number2 + " = " + (number1 / number2));

        scanner.close();
    }
}