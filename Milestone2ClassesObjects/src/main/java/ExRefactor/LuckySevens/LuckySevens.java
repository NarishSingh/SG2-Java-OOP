/**
 * Make a Lucky Sevens sim
 * Take an initial bet
 * Every round, a pair of dice are rolled
 * if ==7 +$4
 * if !=7 -$1
 * Roll until player pot is empty
 */
package ExRefactor.LuckySevens;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {

    /**
     * Roll 2 6-sided dice and return sum
     *
     * @return {int} 2-12
     */
    public static int roll() {
        Random dice = new Random();

        int dice1 = dice.nextInt(6) + 1;
        int dice2 = dice.nextInt(6) + 1;

        return dice1 + dice2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rollCt = 0;
        final double WIN = 4.0;
        final double LOSS = 1.0;
        int peakRoll = 0;
        double peakPot = 0;

        System.out.print("Enter Buy-In Amount: $");
        double pot = input.nextDouble();

        System.out.println("Rolling...");

        while (pot > 0) {
            int roundRoll = roll();
            switch (roundRoll) {
                case 7: {
                    pot += WIN;
                    rollCt++;
                    break;
                }
                default: {
                    pot -= LOSS;
                    rollCt++;
                    break;
                }
            }

//            System.out.println("#" + rollCt + "| " + roundRoll + "  - $" + pot); //debug
            if (pot > peakPot) {
                peakPot = pot;
                peakRoll = rollCt;
            }
        }

        System.out.println("You went broke after " + rollCt + " rolls...");
        System.out.println("Your highest earning was at roll " + peakRoll + ", you had $" + peakPot);
    }

}
