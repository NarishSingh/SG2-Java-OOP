/**
 * 4/20/20
 * prompt user for positive int
 * take the digits in input and sum them up
 * return sum of digits
 */
package ClassPracticeSumDigits;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sumOfDigits = 0;

        System.out.print("Enter a positive integer: ");
        int userNum = input.nextInt();
        if (userNum < 0) {
            throw new IllegalArgumentException("Cannot process negative integer, will return 0.");
        }

        int userInput = userNum; //store for printing later

        //algorithm: use %10 to return digit 
        //then use /10 to chop off the rightmost digit
        while (userNum > 0) {
            int digit = userNum % 10;
            sumOfDigits += digit;
            userNum /= 10;
        }

        System.out.println("Sum of digits in " + userInput + " = " + sumOfDigits);
    }

}
