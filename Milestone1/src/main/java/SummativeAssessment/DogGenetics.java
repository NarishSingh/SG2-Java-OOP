/*
Dog Genetics
Author: Narish Singh
Date Created: 4/20/20
Last Modified: 4/20/20
 */
package SummativeAssessment;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    /**
     * randomize 5 percentages and write to array
     *
     * @return {int[]} int array where elements sum up to 100
     */
    public static int[] breedMixNum() {
        Random rand = new Random();
        int[] breedPercents = new int[5];
        int percentLeft = 100;

        for (int i = 0; i < breedPercents.length; i++) {
            if (percentLeft <= 0) {
                breedPercents[i] = 0;
            } else {
                int mix = rand.nextInt(percentLeft) + 1;
                breedPercents[i] = mix;
                percentLeft -= mix;
            }
        }

        return breedPercents;
    }

    /**
     * randomize 5 breed names and write to array
     *
     * @return {String[]} String array of dog breed names
     */
    public static String[] breedMixNames() {
        Random rand2 = new Random();
        String[] breedNames = new String[5];

        for (int i = 0; i < breedNames.length; i++) {
            int nameChoice = rand2.nextInt(10);

            switch (nameChoice) {
                case 0: {
                    breedNames[i] = "St. Bernard";
                    break;
                }
                case 1: {
                    breedNames[i] = "Chihuahua";
                    break;
                }
                case 2: {
                    breedNames[i] = "Pug";
                    break;
                }
                case 3: {
                    breedNames[i] = "Cur";
                    break;
                }
                case 4: {
                    breedNames[i] = "Doberman";
                    break;
                }
                case 5: {
                    breedNames[i] = "Siberian Husky";
                    break;
                }
                case 6: {
                    breedNames[i] = "Corgi";
                    break;
                }
                case 7: {
                    breedNames[i] = "Golden Retriever";
                    break;
                }
                case 8: {
                    breedNames[i] = "Poodle";
                    break;
                }
                case 9: {
                    breedNames[i] = "Dalmatian";
                    break;
                }
                default: {
                    breedNames[i] = "***"; //dummy case, debug only
                    break;
                }
            }
        }

        return breedNames;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int BREED_LIMIT = 5;

        System.out.print("What is your pup's name?: ");
        String dogName = input.nextLine();

        System.out.println("Calculating breed mixture percentages...");

        System.out.println("Your genetics test for " + dogName + " is in!!!");

        int[] dogBreedPercents = breedMixNum();
        String[] dogBreedNames = breedMixNames();

        for (int i = 0; i < BREED_LIMIT; i++) {
            System.out.println(dogBreedPercents[i] + "%" + " " + dogBreedNames[i]);
        }
    }
}
