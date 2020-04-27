/*
Lucky Sevens Refactored
 */
package ExRefactor.LuckySevens;

import java.util.Scanner;

public class LuckySevensMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Buy-In Amount: $");
        double playerBuyIn = input.nextDouble();
        LSGame player1 = new LSGame(playerBuyIn);

        System.out.println("Rolling...");

        while (player1.getBank() > 0) {
            int roundRoll = player1.roll();
            player1.evaluateRoll(roundRoll);
            player1.trackPeak();
//            System.out.println("#" + player1.getRollCt() + " | " + roundRoll + " - $" + player1.getBank()); //debug
        }

        System.out.println("You went broke after " + player1.getRollCt() + " rolls...");
        System.out.println("Your highest earning was at roll " + player1.getPeakRoll() + ", you had $" + player1.getPeakPot());
    }
}
