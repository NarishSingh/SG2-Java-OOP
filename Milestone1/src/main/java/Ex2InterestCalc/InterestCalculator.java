/**
 * make a calculator that takes input of initial principle, yrs of investment, interest rate
 * for every year, print initial investment at yr start, interest earned, total principle by yr end
 * new total every quarter: CurrentBalance * (1 + (QuarterlyInterestRate / 100))
 *
 * challenge: change program so user can choose for yearly, quarterly, monthly, daily interest
 */
package Ex2InterestCalc;

import java.util.Scanner;

public class InterestCalculator {

    /**
     * calculate yearly interest
     *
     * @param investment {double} principle
     * @param annual     {double} annual interest rate
     * @return {double} interest earned per year
     */
    public static double calcYearlyIntr(double investment, double annual) {
        double annualRate = annual / 100;
        return investment * annualRate;
    }

    /**
     * calculate quarterly interest
     *
     * @param investment {double} principle
     * @param annual     {double} annual interest rate, will be converted to
     *                   quarterly rate
     * @return {double} interest earned per quarter
     */
    public static double calcQuarterlyIntr(double investment, double annual) {
        double quarterlyRate = (annual / 4) / 100;

        return investment * quarterlyRate;
    }

    /**
     * calculate monthly interest
     *
     * @param investment {double} principle
     * @param annual     {double} annual interest rate, will be converted to
     *                   monthly rate
     * @return {double} interest earned per month
     */
    public static double calcMonthlyIntr(double investment, double annual) {
        double monthlyRate = (annual / 12) / 100;

        return investment * monthlyRate;
    }

    /**
     * calculate daily interest
     *
     * @param investment {double} principle
     * @param annual     {double} annual interest rate, will be converted to
     *                   daily rate
     * @return {double} interest earned per daily
     */
    public static double calcDailyIntr(double investment, double annual) {
        double dailyRate = (annual / 365) / 100;

        return investment * dailyRate;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial investment: $");
        double principle = input.nextDouble();
        System.out.print("Enter number of years for principle growth: ");
        int growthPeriod = input.nextInt();
        System.out.print("Enter annual interest rate in % form: ");
        double interest = input.nextDouble();

        System.out.println("");

        for (int i = 0; i < growthPeriod; i++) {
            System.out.println("Year " + (i + 1) + ":");
            System.out.printf("Year Start = $%.2f", principle);

            double intrEarned = calcYearlyIntr(principle, interest);
            System.out.printf("\nAnnual Interest Earned: $%.2f", intrEarned);

            double quarterIntr = calcQuarterlyIntr(principle, interest);
            System.out.printf("\nInterest Earned per quarter: $%.2f", quarterIntr);

            double monthlyIntr = calcMonthlyIntr(principle, interest);
            System.out.printf("\nInterest Earned per month: $%.2f", monthlyIntr);

            double dailyIntr = calcDailyIntr(principle, interest);
            System.out.printf("\nApproximate Interest Earned per daily: $%.5f", dailyIntr);

            principle += intrEarned;
            System.out.printf("\nYear End Total = $%.2f", principle);
            System.out.println("\n---");
        }
    }

}
