/**
 * write method that returns random color --> at least 5
 * write method that returns random animal --> at least 5
 * write method that returns random int from range
 */
package EPP8Methods;

import java.util.Random;

public class BarelyControlledChaos {

    /**
     * randColor() - Return a random color
     *
     * @return {String} one of 6 colors
     */
    public static String randColor() {
        Random colorRand = new Random();

        switch (colorRand.nextInt(5)) {
            case 0: {
                return "Blue";
            }
            case 1: {
                return "Red";
            }
            case 2: {
                return "Purple";
            }
            case 3: {
                return "Orange";
            }
            case 4: {
                return "Green";
            }
            default: {
                return "Default";
            }
        }
    }

    /**
     * randAnimal() - Return random animal
     *
     * @return {String} one of 6 animals
     */
    public static String randAnimal() {
        Random aniRand = new Random();

        switch (aniRand.nextInt(5)) {
            case 0: {
                return "Kookaburra";
            }
            case 1: {
                return "Trout";
            }
            case 2: {
                return "Stallion";
            }
            case 3: {
                return "Ant";
            }
            case 4: {
                return "Siberian Husky";
            }
            default: {
                return "Default";
            }
        }
    }

    /**
     * randNumInRange(min, max) - Return a random number within the range
     * specified by arguments
     *
     * @param min - minimum of desired range
     * @param max - maximum of desired range
     * @return {int} Random number within the range
     * @throws IllegalArgumentException if maximum lower than minimum
     */
    public static int randNumInRange(int min, int max) {
        Random numRand = new Random();

        if (max < min) {
            throw new IllegalArgumentException("Max cannot be less than minimum");
        }

        return numRand.nextInt(max - min) + min;
    }

    public static void main(String[] args) {
        String color = randColor();
        String animal = randAnimal();
        String colorAgain = randColor();
        int weight = randNumInRange(5, 200);
        int distance = randNumInRange(10, 20);
        int number = randNumInRange(10000, 20000);
        int time = randNumInRange(2, 6);

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb" + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }
}
