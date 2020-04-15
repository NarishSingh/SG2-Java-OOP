/**
 * ask for name
 * ask for birth year
 * display message about a movie
 */
package EPP4IfElse;

import java.util.Scanner;

public class YourLifeInMovies {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("What's your name? : ");
//        String userName = input.nextLine();

        System.out.print("Ok " + ", what year were you born in?: ");
        int userYear = input.nextInt();

        if (userYear < 2005 && userYear>1995) {
            System.out.println("Pixar's \"UP\" is over a decade old!");
        } else if (userYear <= 1995 && userYear>1985) {
            System.out.println("The first \"Harry Potter\" film came out over 15 yrs ago!");
        } else if (userYear <= 1985 && userYear>1975) {
            System.out.println("Space Jam came out not last decade, but the one before THAT");
        } else if (userYear == 1980) {
            System.out.println("Pixar's \"UP\" is over a decade old!");
            System.out.println("The first \"Harry Potter\" film came out over 15 yrs ago!");
            System.out.println("Space Jam came out not last decade, but the one before THAT");
        } else if (userYear <= 1975 && userYear>1965) {
            System.out.println("The original Jurassic Park was released closer to the 1st moon landing than today's date");
        } else if (userYear <= 1965 && userYear>1995) {
            System.out.println("The MASH TV series has been around for 50 yrs!");
        } else {
            System.out.println("You are either a vampire or from the future");
        }
    }

}
