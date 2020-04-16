package EPP7ForLoops;

import java.util.Scanner;

public class TwoForsAndTenYearsAgo {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter starting year to go backward 10 years from: ");
        int year = userInput.nextInt();

        //range = 0-10
        //this is clearer to me, as the initialization and termination of the loop is clearly given
        //while the yr itself gets printed to console
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " years ago = " + (year - i));
        }

        //range = the year enterred to 10 years prior 
        System.out.println("\nI have another algorithm...");

        for (int i = year; i >= year - 20; i--) {
            System.out.println((year - i) + " years ago = " + i);
        }
    }

}
