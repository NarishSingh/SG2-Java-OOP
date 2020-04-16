/**
 * write a while loop that counts down to 0, no negatives
 * print rows of 10's then newline
 * throw error if negative
 */
package EPP6WhileDoLoops;

import java.util.Scanner;

public class StayPositive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }

        int counter = 0;
        System.out.print("Enter starting value: ");
        int j = input.nextInt();
        if (j < 0) {
            throw new IllegalArgumentException("Not a positive number");
        }

        while (j >= 0) {
            if (counter%10==0) {
                System.out.print("\n" + j + " ");
                counter++;
                j--;
            } else {
                System.out.print(j + " ");
                counter++;
                j--;
            }

        }
    }

}
