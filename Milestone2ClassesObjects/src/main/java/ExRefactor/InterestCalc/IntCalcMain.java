/*
Refactored version of the interest calculator
 */
package ExRefactor.InterestCalc;

import java.util.Scanner;

public class IntCalcMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial investment: $");
        double principle = input.nextDouble();
        System.out.print("Enter annual interest rate in % form: ");
        double interest = input.nextDouble();
        System.out.print("Enter number of years for principle growth: ");
        int growthPeriod = input.nextInt();
        Interest acc = new Interest(principle, interest, growthPeriod);

        for (int i = 0; i < acc.getTerm(); i++) {
            System.out.println("Year " + (i + 1) + ":");
            System.out.printf("Year Start = $%.2f", acc.getInvestment());
            System.out.printf("\nAnnual Interest Earned: $%.2f", acc.calcYearlyIntr());
            System.out.printf("\nInterest Earned per quarter: $%.2f", acc.calcQuarterlyIntr());
            System.out.printf("\nInterest Earned per month: $%.2f", acc.calcMonthlyIntr());
            System.out.printf("\nApproximate Interest Earned per daily: $%.5f", acc.calcDailyIntr());

            System.out.printf("\nYear End Total = $%.2f", acc.yearEndPrinciple());
            System.out.println("\n---");
        }
    }

}
