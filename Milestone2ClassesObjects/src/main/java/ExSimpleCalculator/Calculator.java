/*
Basic arithmetic calculator
 */
package ExSimpleCalculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean calculating = true;

        System.out.println("Welcome to the console based calculator!");
        System.out.println("Select Operation:");

        while (calculating) {
            Calculations c = new Calculations();

            System.out.println("1 | Addition");
            System.out.println("2 | Subtraction");
            System.out.println("3 | Multiplication");
            System.out.println("4 | Division");
            System.out.println("5 | Exit");
            int choice = input.nextInt();

            if (choice > 0 && choice < 6) {
                calculating = c.calculate(choice);
            } else {
                throw new IllegalArgumentException("Invalid input. Exiting.");
            }

            System.out.println("-------");
        }
    }

}
