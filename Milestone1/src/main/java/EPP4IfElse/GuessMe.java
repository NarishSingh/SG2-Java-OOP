/**
 * Have computer choose number
 * ask for a number
 * print same number + high/low/equal feedback
 * provide answer
 */
package EPP4IfElse;

import java.util.Random;
import java.util.Scanner;

public class GuessMe {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("For an integer between 0 and 10, guess my number: ");
        int compNum = rand.nextInt(10) + 1;
        int userGuess = input.nextInt();

        if (userGuess > compNum) {
            System.out.println(userGuess + " is too high! You lose!!! My number was " + compNum);
        } else if (userGuess < compNum) {
            System.out.println(userGuess + " is too low! You lose!!! My number was " + compNum);
        } else {
            System.out.println(userGuess + " is right! You win!!!");
        }

    }

}
