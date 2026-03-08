package edu.programming.java.basics.assignment02;

import java.util.Scanner;

public class PersonalGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What´s your name: ");
        String myName = scanner.nextLine();
        System.out.println("Nice to meet you " + myName);
    }
}
