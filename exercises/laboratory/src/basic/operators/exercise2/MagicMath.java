package basic.operators.exercise2;

import java.util.Scanner;

public class MagicMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int myNumber = 0;
        int magicNumber = 0;
        final int fixedAdding = 17;
        final int fixedDivider = 6;

        System.out.println("\nMagic with Math");

        System.out.print("\nEnter an integer number: ");
        myNumber = scanner.nextInt();

        magicNumber = myNumber * myNumber;
        magicNumber = magicNumber + myNumber;
        magicNumber = magicNumber / myNumber;
        magicNumber = magicNumber + fixedAdding;
        magicNumber = magicNumber - myNumber;
        magicNumber = magicNumber / fixedDivider;

        System.out.println("Magic number: " + magicNumber + "\n");
        System.out.println("Try with another number ;)");

        scanner.close();
    }
}