/**
 * Guessing game +
 * keep guessing until they get it
 * print unique statement if right on first try
 */
package EPP6WhileDoLoops;

import java.util.Random;
import java.util.Scanner;

public class GuessMeFinally {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        boolean guessing = true;

        System.out.println("For an integer between -100 and 100, guess my number: ");
        double compNum = Math.floor(rand.nextDouble() * (100 - (-100)) + (-100));
        int guessCt = 0;
        
        while (guessing) {
            int userGuess = input.nextInt();

            if (userGuess > compNum) {
                System.out.println(userGuess + " is too high!");
            } else if (userGuess < compNum) {
                System.out.println(userGuess + " is too low!");
            } else if (userGuess == compNum && guessCt == 0) {
                System.out.println("Wow! Are you Psychic? You got it on the first try!");
                break;
            } else {
                System.out.println(userGuess + " is right! You win!!!");
                break;
            }
            
            guessCt++;
        }
    }
}
