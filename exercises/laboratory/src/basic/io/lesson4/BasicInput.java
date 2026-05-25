package basic.io.lesson4;

import java.util.Scanner;

/**
 * Basic use of Scanner for user input, along with String and int variable declarations, and use of the + operator for string concatenation.
 *
 * @author JLRD
 * 23/05/26
 */
public class BasicInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName;
        int myAge;

        System.out.print("User name: ");
        userName = scanner.nextLine();

        System.out.print("Your age: ");
        myAge = scanner.nextInt();

        System.out.println("Hello:");
        System.out.print("Nice to meet you ");
        System.out.print(userName);
        System.out.println("\nWelcome to amazing world of Java!");
        System.out.print("You’re " + myAge + " years old — it’s always a good age to learn programming");

        scanner.close();
    }
}
