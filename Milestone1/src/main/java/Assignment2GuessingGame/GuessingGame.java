/** Guessing Game
 * gen rand num 1-100
 * let user guess number
 * respond w too high low or correct
 * after correct, inform num of guesses
 */
package Assignment2GuessingGame;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean guessing = true;
        int attempts = 0;
        int numToGuess = (int) (Math.random() * 100 + 1);

        System.out.println("Selecting a number from 1-100...");
        System.out.println(numToGuess);
        System.out.println("Enter guess:");

        while (guessing) {
            attempts++;
            int userGuess = input.nextInt();

            if (userGuess > numToGuess) {
                System.out.println("Too high...");
            } else if (userGuess < numToGuess) {
                System.out.println("Too low...");
            } else {
                System.out.println("Correct!");
                break;
            }
        }

        System.out.println("User attempts: " + attempts);
    }

}
