/**
 * ask user pieces of trivia, but mix up answers
 */
package EPP3Scanner;

import java.util.Scanner;

public class AllTheTrivia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1) How many ml are in a l?");
        int userAns1 = input.nextInt();

        System.out.println("2) How many planets are in the solar system?");
        int userAns2 = input.nextInt();
        System.out.println("3) What year is it?");
        int userAns3 = input.nextInt();

        System.out.println("Wait..." + userAns2 + "ml are in a liter???");
        System.out.println("Who told you " + userAns3 + " planets are in the solar system? Did you count pluto?");
        System.out.println("Lay off the drugs, it is NOT year " + userAns1);

    }

}
