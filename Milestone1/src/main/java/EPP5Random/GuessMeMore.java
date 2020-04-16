/**
 * Improve GuessMe
 * Make the number chosen, a random number between -100 and 100
 * If the user gets it wrong, give them another chance at guessing.
 */
package EPP5Random;

import java.util.Random;
import java.util.Scanner;

public class GuessMeMore {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        boolean guessing = true;

        System.out.println("For an integer between -100 and 100, guess my number: ");
        double compNum = Math.floor(rand.nextDouble() * (100 - (-100)) + (-100));

        while (guessing) {
            int userGuess = input.nextInt();

            if (userGuess > compNum) {
                System.out.println(userGuess + " is too high!");
            } else if (userGuess < compNum) {
                System.out.println(userGuess + " is too low!");
            } else {
                System.out.println(userGuess + " is right! You win!!!");
                break;
            }
        }
    }

}
