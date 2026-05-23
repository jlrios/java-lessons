package basic.io.lesson4;

import java.util.Scanner;

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
