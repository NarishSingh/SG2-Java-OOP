/**
 * find the nut for the squirrel
 * Giving a null pointer exception...need to figure out why
 */
package EPP9Arrays;

import java.util.Random;

public class HiddenNuts {

    public static void main(String[] args) {
        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        // Nut finding code should go here! 
        for (int i = 0; i < hidingSpots.length; i++) {
            if (hidingSpots[i].equals("Nut")) {
                System.out.println("Hey Squirrel! Your nut is at spot #" + i + " you nitwit!");
                break;
            }
        }
    }
}
