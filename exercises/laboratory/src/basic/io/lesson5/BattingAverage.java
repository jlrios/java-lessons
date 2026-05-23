package basic.io.lesson5;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hits;
        int turns; // Official turns
        double battingAverage;

        System.out.println("\nBatting Average");
        System.out.println("----------------");

        System.out.print("Hits: ");
        hits = scanner.nextInt();

        System.out.print("At-bats: ");
        turns = scanner.nextInt();

        battingAverage = (double) hits/turns;

        System.out.printf("Batting average: %.3f%n", battingAverage);

        scanner.close();
    }
}
