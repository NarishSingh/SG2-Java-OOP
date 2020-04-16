package EPP5Random;

import java.util.Random;

public class Opinionator {

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("I don't know what animal is my favorite");
        System.out.println("Rand to the rescue!");

        int choice = rand.nextInt(6); //5 changed to 6, as nextInt is exclusive of upper bound

        System.out.println("RNG has chosen: " + choice);

        switch (choice) {
            case 0: {
                System.out.println("Llamas are the best!");
                break;
            }
            case 1: {
                System.out.println("Dodos are the best!");
                break;
            }
            case 2: {
                System.out.println("Woolly mammoths are DEFINITELY the best!");
                break;
            }
            case 3: {
                System.out.println("Sharks are the greatest, they have their own week!");
                break;
            }
            case 4: {
                System.out.println("Cockatoos are just so awesomme!");
                break;
            }
            case 5: {
                System.out.println("Have you ever met a naked mole-rat? They're GREAT!");
                break;
            }
            default: {
                System.out.println("How did you get this number???");
                break;
            }
        }

        System.out.println("Thanks Random, maybe YOU'RE the best!");
    }

}
