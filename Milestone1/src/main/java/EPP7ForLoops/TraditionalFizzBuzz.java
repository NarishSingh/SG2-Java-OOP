/**
 * ask for a number
 * use a for loop to count up from zero to num
 * replace every multiple of 3 w fizz
 * replace every multiple of 5 w buzz
 * 3 & 5 == fizzbuzz
 * track every substitution
 * end with "tradition!"
 */
package EPP7ForLoops;

import java.util.Scanner;

public class TraditionalFizzBuzz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Give us a positive number for us to count up to: ");
        int userNum = input.nextInt();
        if (userNum < 0) {
            throw new IllegalArgumentException("Cannot count up to a negative number.");
        }

        for (int i = 0; i < userNum; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("TRADITION!");
    }
}
