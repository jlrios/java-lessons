package basic.loops.exercise1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tableNumber;

        System.out.println("Multiplication table");

        System.out.print("Enter the number of the multiplication table you want to multiply: ");
        tableNumber = scanner.nextInt();

        for (int n = 1; n <= 10; n++) {
            System.out.println(tableNumber + " * " + n + " = " + (tableNumber * n));
        }
    }
}
