/*
Dog Genetics
Author: Narish Singh
Date Created: 4/20/20
Last Modified: 4/21/20
 */
package SummativeAssessment;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    /**
     * randomize 5 percentages and write to an array
     *
     * @return {int[]} int array where all elements sum up to 100
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
     * randomize 5 breed names and write to an array
     *
     * @return {String[]} String array of dog breeds
     */
    public static String[] breedMixName() {
        Random randChooser = new Random();
        String[] breedName = new String[5];

        for (int i = 0; i < breedName.length; i++) {
            int nameChoice = randChooser.nextInt(10);

            switch (nameChoice) {
                case 0: {
                    breedName[i] = "St. Bernard";
                    break;
                }
                case 1: {
                    breedName[i] = "Chihuahua";
                    break;
                }
                case 2: {
                    breedName[i] = "Pug";
                    break;
                }
                case 3: {
                    breedName[i] = "Cur";
                    break;
                }
                case 4: {
                    breedName[i] = "Doberman";
                    break;
                }
                case 5: {
                    breedName[i] = "Siberian Husky";
                    break;
                }
                case 6: {
                    breedName[i] = "Corgi";
                    break;
                }
                case 7: {
                    breedName[i] = "Golden Retriever";
                    break;
                }
                case 8: {
                    breedName[i] = "Poodle";
                    break;
                }
                case 9: {
                    breedName[i] = "Dalmatian";
                    break;
                }
                default: {
                    break;
                }
            }
        }

        return breedName;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int BREED_LIMIT = 5;

        System.out.print("What is your pup's name?: ");
        String dogName = input.nextLine();

        System.out.println("Calculating breed mixture percentages...");

        System.out.println("Your genetics test for " + dogName + " is in!!!");

        int[] dogBreedPercents = breedMixNum();
        String[] dogBreedNames = breedMixName();

        for (int i = 0; i < BREED_LIMIT; i++) {
            System.out.println(dogBreedPercents[i] + "%" + " " + dogBreedNames[i]);
        }
    }
}
