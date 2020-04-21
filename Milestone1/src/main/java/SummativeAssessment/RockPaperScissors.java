/*
Rock, Paper, Scissors
Author: Narish Singh
Date Created: 4/20/20
Last Modified: 4/20/20
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
     */
    public static String playerMove(int choice) {
        if (choice < 1 || choice > 3) {
            throw new IllegalArgumentException("Invalid move. Terminating game...");
        }

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
                return "@@@"; //dummy case, debug only
            }
        }
    }

    /**
     * evaluate the round - print outcome and add to respective win/tie tally
     *
     * @param move     {int} converted to string using playerMove(int choice),
     *                 then compared to compMove()
     * @param compMove {String} comp's random move
     */
    public static void evaluateRound(int move, String compMove) {
        if (playerMove(move).equals(compMove)) {
            System.out.println("Tie!!!");
            ties++;
        } else if (playerMove(move).equals("Rock") && compMove.equals("Paper")) {
            System.out.println("Comp's Paper covers Rock - Computer Wins!");
            compWins++;
        } else if (playerMove(move).equals("Paper") && compMove.equals("Scissors")) {
            System.out.println("Comp's Scissors cuts Paper - Computer Wins!");
            compWins++;
        } else if (playerMove(move).equals("Scissors") && compMove.equals("Rock")) {
            System.out.println("Comp's Rock crushes Scissors - Computer Wins!");
            compWins++;
        } else if (playerMove(move).equals("Rock") && compMove.equals("Scissors")) {
            System.out.println("Player's Rock crushes Scissors - Player Wins!");
            playerWins++;
        } else if (playerMove(move).equals("Paper") && compMove.equals("Rock")) {
            System.out.println("Player's Paper covers Rock - Player Wins!");
            playerWins++;
        } else if (playerMove(move).equals("Scissors") && compMove.equals("Paper")) {
            System.out.println("Player's Scissors cuts Paper - Player Wins!");
            playerWins++;
        } else {
            System.out.println("###"); //dummy case, debug only
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
//            playing = playAgain.equals("y");
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
