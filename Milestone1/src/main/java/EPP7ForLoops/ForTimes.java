/**
 * Take an integer
 * display times tables up to 15
 */
package EPP7ForLoops;

import java.util.Scanner;

public class ForTimes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Which times tables to display?: ");
        int times = input.nextInt();

        for (int i = 0; i < 15; i++) {
            System.out.println((i + 1) + " * " + times + " = " + ((i + 1) * times));
        }
    }

}
