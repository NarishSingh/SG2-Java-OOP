/**
 * Ask for a integer to factor
 * print this number
 * print each factor for the number sans the number itself
 * print total number of factors
 * print if its perfect - where all the factors of the number, excluding the
 * number itself, add up to that number.
 * print if its prime - has only itself and 1 as factors.
 */
package Ex1Factorizer;

import java.util.Scanner;

public class Factorizer {

    /**
     * Find and print all factors for a whole number
     * print whether its prime and/or perfect number
     *
     * @param numToFactor {int}
     */
    public static void factorOperations(int numToFactor) {
        int factorCt = 0;
        int sumOfFactors = 0;

        //factor
        for (int i = 1; i <= numToFactor; i++) {
            if (numToFactor % i == 0) {
                System.out.print(i + " ");
                factorCt++;
                sumOfFactors += i;
            }
        }

        System.out.println("\n" + numToFactor + " has " + factorCt + " factors");
        
        //prime? - 1 and itself = exactly 2 factors
        if (factorCt == 2) {
            System.out.println(numToFactor + " is a prime Number!");
        } else {
            System.out.println(numToFactor + " is a not prime Number...");
        }

        //perfect? sum of factors exclusive of final factor that == itself
        int perfectNumCalc = sumOfFactors - numToFactor;
        if (perfectNumCalc == numToFactor) {
            System.out.println(numToFactor + " is a perfect number!");
        } else {
            System.out.println(numToFactor + " is a not perfect number...");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integer that you would like factored: ");
        int factor = input.nextInt();

        System.out.println("Factors for " + factor + ":");

        factorOperations(factor);
    }

}
