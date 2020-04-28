package ExRefactor.RockPaperScissors;

import java.util.Random;

public class RPS {

    /*fields*/
    private int playerWins;
    private int compWins;
    private int ties;

    /*ctors*/
    public RPS() {
        this.playerWins = 0;
        this.compWins = 0;
        this.ties = 0;
    }

    /*getter/setters*/
    public int getPlayerWins() {
        return playerWins;
    }

    public void setPlayerWins(int playerWins) {
        this.playerWins = playerWins;
    }

    public int getCompWins() {
        return compWins;
    }

    public void setCompWins(int compWins) {
        this.compWins = compWins;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    /*behaviors*/
    /**
     * Use a random int to decide comp move
     *
     * @return {String} Rock, Paper, Scissors
     */
    public String compMove() {
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
    public String playerMove(int choice) {
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
     * evaluate the round - print outcome and add to respective win/tie tally
     *
     * @param move     {int} converted to string using playerMove(int choice),
     *                 then compared to compMove()
     * @param compMove {String} comp's random move
     */
    public void evaluateRound(int move, String compMove) {
        boolean userWon = playerMove(move).equals("Rock") && compMove.equals("Scissors")
                || playerMove(move).equals("Paper") && compMove.equals("Rock")
                || playerMove(move).equals("Scissors") && compMove.equals("Paper");

        if (userWon) {
            System.out.println("Player's " + playerMove(move) + " beats Computer's " + compMove + " - Player Wins!");
            this.playerWins++;
        } else if (playerMove(move).equals(compMove)) {
            System.out.println("Tie!!!");
            this.ties++;
        } else {
            System.out.println("Computer's " + compMove + " beats Player's " + playerMove(move) + " - Computer Wins!");
            this.compWins++;
        }
    }

    /**
     * Use win stats to determine game winner, with easter egg if more ties than
     * either side's score
     */
    public void declareWinner() {
        if (getPlayerWins() > getCompWins()) {
            System.out.println("!!!PLAYER WINS THE GAME!!!");
        } else if (getPlayerWins() < getCompWins()) {
            System.out.println("Comp wins the game...better luck next time!");
        } else {
            System.out.println("Player and Comp are tied after rounds.");
        }

        if (getTies() > getPlayerWins() && getTies() > getCompWins()) {
            System.out.println("A hard battle...");
        }
    }
}
