/*
Rock, Paper, Scissors
Author: Narish Singh
Date Created: 4/20/20
Last Modified: 4/29/20
 */
package SummativeAssessment;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    /*Global Vars*/
    public static int playerWins;
    public static int compWins;
    public static int ties;

    /*Methods*/
    /**
     * Use a random int to decide comp move
     *
     * @return {String} Rock, Paper, Scissors
     */
    public static String compMove() {
        Random rand = new Random();

        int compPlay = rand.nextInt(3);

        switch (compPlay) {
            case 0: {
                return "Rock";
            }
            case 1: {
                return "Paper";
            }
            case 2: {
                return "Scissors";
            }
            default: {
                return "!!!"; //dummy case, debug only
            }
        }
    }

    /**
     * Convert player input to a string
     *
     * @param choice {int} 1-3 based on user input
     * @return {String} Rock, Paper, Scissors respectively
     * @throws IllegalArgumentException on invalid move
     */
    public static String playerMove(int choice) {
        switch (choice) {
            case 1: {
                return "Rock";
            }
            case 2: {
                return "Paper";
            }
            case 3: {
                return "Scissors";
            }
            default: {
                throw new IllegalArgumentException("Invalid move. Terminating game...");
            }
        }
    }

    /**
     * evaluate the round by comparing the player and comp moves as Strings -
     * print outcome and add 1 to respective win or tie count
     *
     * @param move     {int} converted to string using playerMove(int choice)
     * @param compMove {String} comp's random move
     */
    public static void evaluateRound(int move, String compMove) {
        String playerMove=playerMove(move);
        boolean userWon = playerMove.equals("Rock") && compMove.equals("Scissors")
                || playerMove.equals("Paper") && compMove.equals("Rock")
                || playerMove.equals("Scissors") && compMove.equals("Paper");

        if (userWon) {
            System.out.println("Player's " + playerMove + " beats Computer's " + compMove + " - Player Wins!");
            playerWins++;
        } else if (playerMove.equals(compMove)) {
            System.out.println("Tie!!!");
            ties++;
        } else {
            System.out.println("Computer's " + compMove + " beats Player's " + playerMove + " - Computer Wins!");
            compWins++;
        }
    }

    /**
     * Use win stats to determine game winner, with easter egg if more ties than
     * either side's score
     */
    public static void declareWinner() {
        if (playerWins > compWins) {
            System.out.println("!!!PLAYER WINS THE GAME!!!");
        } else if (playerWins < compWins) {
            System.out.println("Comp wins the game...better luck next time!");
        } else {
            System.out.println("Player and Comp are tied after rounds.");
        }

        if (ties > playerWins && ties > compWins) {
            System.out.println("A hard battle...");
        }
    }

    public static void main(String[] args) {
        Scanner playInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        boolean playing = false;

        System.out.println("Welcome to Rock, Paper, Scissors!!!");

        do {
            playerWins = 0;
            compWins = 0;
            ties = 0;

            System.out.print("Enter number of rounds (1-10): ");
            int rounds = playInput.nextInt();
            if (rounds > 10 || rounds < 1) {
                throw new IllegalArgumentException("Invalid round count. Terminating game...");
            }

            /*GAMEPLAY LOOP*/
            for (int i = 0; i < rounds; i++) {
                System.out.println("Round " + (i + 1));
                System.out.println("1 - Rock");
                System.out.println("2 - Paper");
                System.out.println("3 - Scissor");

                System.out.print("Player move: ");
                int play = playInput.nextInt();
                String compPlay = compMove();
                evaluateRound(play, compPlay);

                System.out.println("-------");
            }

            System.out.println("Player Wins: " + playerWins + " | Computer Wins: " + compWins + " | Ties: " + ties);
            declareWinner();

            System.out.print("Play again? (y/n): ");
            String playAgain = stringInput.nextLine();
            if (playAgain.equals("y")) {
                System.out.println("*******");
                playing = true;
            } else {
                System.out.println("Thanks for playing!!!");
                playing = false;
            }
        } while (playing);
    }
}
