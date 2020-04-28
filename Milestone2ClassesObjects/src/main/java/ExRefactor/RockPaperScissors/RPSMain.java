/*
Rock Paper Scissors Game refactored
*/
package ExRefactor.RockPaperScissors;

import java.util.Scanner;

public class RPSMain {

    public static void main(String[] args) {
        Scanner playInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        boolean playing = false;

        System.out.println("Welcome to Rock, Paper, Scissors!!!");

        do {
            RPS game=new RPS();

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
                String compPlay = game.compMove();
                game.evaluateRound(play, compPlay);

                System.out.println("-------");
            }

            System.out.println("Player Wins: " + game.getPlayerWins() + " | Computer Wins: " 
                    + game.getCompWins() + " | Ties: " + game.getTies());
            game.declareWinner();

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
