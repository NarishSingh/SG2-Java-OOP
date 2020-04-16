package EPP5Random;

import java.util.Random;
import java.util.Scanner;

public class HighRoller {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("How many sides does the dice have?: ");
        int diceSides = input.nextInt();

        int roll = rand.nextInt(diceSides + 1) + 1;
        System.out.println("Rolling: " + roll);

        if (roll == 1) {
            System.out.println("You rolled a critical failure...");
        }

        if (roll == diceSides) {
            System.out.println("Rolled a critical! Nice!");
        }
    }

}
