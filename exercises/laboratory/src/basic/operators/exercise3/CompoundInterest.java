package basic.operators.exercise3;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double futureTotal;      // Formula letter A
        double principalAmount;  // Formula letter P
        double annualRate;       // Formula letter r
        double timesCompounded;  // Formula letter n
        double timeInvested;     // Formula letter t

        System.out.println("Calculate Compound Interest");

        System.out.print("Invest (P): ");
        principalAmount = scanner.nextFloat();

        System.out.println("Time investment (t): ");
        timeInvested = scanner.nextFloat();

        System.out.println("Annual rate (r): ");
        annualRate = scanner.nextFloat();

        System.out.println("Times compounded (n): ");
        timesCompounded = scanner.nextFloat();

        // 1. Calculate the interest per period
        // Divide the annual rate by the compounding frequency
        double interestPeriod = annualRate / timesCompounded;

        // 2. Determine the total number of compounding periods
        // Multiply the compounding frequency by the years
        double compoundingPeriods =  timesCompounded * timeInvested;

        // 3. Calculate the total (A)
        double totalBalance = principalAmount * Math.pow((1 + interestPeriod), compoundingPeriods);

        System.out.println("Total balance: " + totalBalance);

        // 4. Calculate the interest earned (A)
        // Subtract your initial principal form the final total balance
        System.out.println("Interest earned: " + (totalBalance - principalAmount));
    }
}
