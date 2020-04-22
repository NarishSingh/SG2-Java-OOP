/*
Dog Genetics
Author: Narish Singh
Date Created: 4/20/20
Last Modified: 4/22/20
 */
package SummativeAssessment;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    final static int BREED_LIMIT = 5;

    /**
     * Process an array such that if any element contains 0, split the value of
     * its neighbor i-1 down give half to each such that no element is 0
     *
     * @param hasZeroes
     */
    public static void verifyArray(int[] hasZeroes) {
        for (int i = hasZeroes.length - 1; i > 0; i--) {
            if (hasZeroes[i] == 0 && hasZeroes[i - 1] != 0) {
                int split = hasZeroes[i - 1] / 2;
                hasZeroes[i - 1] /= 2;
                hasZeroes[i] = split;
            }
        }
    }

    /**
     * randomize 5 percentages and write to an array, with all percentages >0
     *
     * @return {int[]} int array where all elements sum up to 100
     */
    public static int[] breedMixNum() {
        Random rand = new Random();
        int[] breedPercents = new int[BREED_LIMIT];
        int sumOfPercents = 0;

        int percentLeft = 101; //so random can generate 0-100 for percent

        for (int i = 0; i < breedPercents.length; i++) {
            int mix = rand.nextInt(percentLeft);
            breedPercents[i] = mix;
            percentLeft -= mix;

            sumOfPercents += mix;
        }

        //if doesn't add up to 100, dump remaining percent into 0 containing or last element
        if (sumOfPercents != 100) {
            percentLeft--; //so it doesn't sum to 101

            for (int i = 0; i < breedPercents.length; i++) {
                if (breedPercents[i] == 0) {
                    breedPercents[i] = percentLeft;
                    percentLeft = 0;
                }
            }

            breedPercents[breedPercents.length - 1] += percentLeft;
        }

        verifyArray(breedPercents);

        return breedPercents;
    }

    /**
     * randomize 5 breed names and write to an array, won't return the same
     * breed name twice
     *
     * @return {String[]} String array of dog breeds without repeats
     */
    public static String[] breedMixName() {
        Random randChooser = new Random();
        final int breedSelection = 11; //double the limit + extra cases to sandbag
        boolean[] breedNameUsed = new boolean[breedSelection]; //all initialize false
        String[] breedName = new String[BREED_LIMIT];

        for (int i = 0; i < breedName.length; i++) {
            int nameChoice = randChooser.nextInt(breedSelection);

            //if name unused, write to breedName
            //otherwise fall through and use next case
            switch (nameChoice) {
                case 0: {
                    if (!breedNameUsed[0]) {
                        breedName[i] = "St. Bernard";
                        breedNameUsed[0] = true;
                        break;
                    } else {
                        //do nothin and fall through 
                    }
                }
                case 1: {
                    if (!breedNameUsed[1]) {
                        breedName[i] = "Chihuahua";
                        breedNameUsed[1] = true;
                        break;
                    } else {
                    }
                }
                case 2: {
                    if (!breedNameUsed[2]) {
                        breedName[i] = "Pug";
                        breedNameUsed[2] = true;
                        break;
                    } else {
                    }
                }
                case 3: {
                    if (!breedNameUsed[3]) {
                        breedName[i] = "Cur";
                        breedNameUsed[3] = true;
                        break;
                    } else {
                    }
                }
                case 4: {
                    if (!breedNameUsed[4]) {
                        breedName[i] = "Doberman";
                        breedNameUsed[4] = true;
                        break;
                    } else {
                    }
                }
                case 5: {
                    if (!breedNameUsed[5]) {
                        breedName[i] = "Siberian Husky";
                        breedNameUsed[5] = true;
                        break;
                    } else {
                    }
                }
                case 6: {
                    if (!breedNameUsed[6]) {
                        breedName[i] = "Corgi";
                        breedNameUsed[6] = true;
                        break;
                    } else {
                    }
                }
                case 7: {
                    if (!breedNameUsed[7]) {
                        breedName[i] = "Golden Retriever";
                        breedNameUsed[7] = true;
                        break;
                    } else {
                    }
                }
                case 8: {
                    if (!breedNameUsed[8]) {
                        breedName[i] = "Poodle";
                        breedNameUsed[8] = true;
                        break;
                    } else {
                    }
                }
                case 9: {
                    if (!breedNameUsed[9]) {
                        breedName[i] = "Dalmatian";
                        breedNameUsed[9] = true;
                        break;
                    } else {
                    }
                }
                case 10: {
                    if (!breedNameUsed[10]) {
                        breedName[i] = "German Shepherd";
                        breedNameUsed[10] = true;
                        break;
                    } else {
                        breedName[i] = "Bulldog"; //no more fall through
                        break;
                    }
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
