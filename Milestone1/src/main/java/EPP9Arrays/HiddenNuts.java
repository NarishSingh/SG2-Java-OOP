package EPP9Arrays;

import java.util.Random;

public class HiddenNuts {

    public static void main(String[] args) {
        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        //find the nut for the squirrel
        for (int i = 0; i < hidingSpots.length; i++) {
            if ("Nut".equals(hidingSpots[i])) {
                System.out.println("Hey Squirrel! Your nut is at spot #" + i + " you nitwit!");
                break;
            }
        }
    }
}
