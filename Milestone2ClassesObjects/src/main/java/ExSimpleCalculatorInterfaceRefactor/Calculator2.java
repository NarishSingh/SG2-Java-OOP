/*
Basic arithmetic calculator
 */
package ExSimpleCalculatorInterfaceRefactor;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        boolean calculating = true;
        UserIOImpl io=new UserIOImpl();

        System.out.println("Welcome to the console based calculator!");
        System.out.println("Select Operation:");

        while (calculating) {
            Calculations2 c = new Calculations2();

            System.out.println("1 | Addition");
            System.out.println("2 | Subtraction");
            System.out.println("3 | Multiplication");
            System.out.println("4 | Division");
            System.out.println("5 | Exit");
//            int choice = input.nextInt();
            int choice=io.readInt("Enter choice", 1, 5);
            calculating = c.calculate(choice);

            /*
            if (choice > 0 && choice < 6) {
                calculating = c.calculate(choice);
            } else {
                throw new IllegalArgumentException("Invalid input. Exiting.");
            }
            */

            System.out.println("-------");
        }
    }

}
