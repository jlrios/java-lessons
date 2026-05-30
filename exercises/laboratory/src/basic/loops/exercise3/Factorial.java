package basic.loops.exercise3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int factorial;

        System.out.println("Factorial Calculator");

        System.out.print("Enter a non-negative integer: ");
        number = scanner.nextInt();

        factorial = number;

        for (int i = number; i >= 2; i--) {
            factorial = factorial * (i - 1);
        }

        System.out.println("Factorial of " + number + " = " + factorial);
    }
}
