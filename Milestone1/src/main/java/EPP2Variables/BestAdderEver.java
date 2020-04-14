/**
 * Store 3 different inputs
 * add together and store to new variable
 * display math expression
 */
package EPP2Variables;

import java.util.Scanner;

public class BestAdderEver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum;

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        sum = num1 + num2 + num3;
        
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
    }

}
