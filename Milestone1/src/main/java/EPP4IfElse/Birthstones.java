/**
 * Ask user for birth month as a number
 * error message if number is invalid
 */
package EPP4IfElse;

import java.util.Scanner;

public class Birthstones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number corresponding to a birth month (1-12): ");
        int birthmonth = input.nextInt();

        switch (birthmonth) {
            case 1: {
                System.out.println(birthmonth + " - Janurary: Garnet");
                break;
            }
            case 2: {
                System.out.println(birthmonth + " - February: Amethyst");
                break;
            }
            case 3: {
                System.out.println(birthmonth + " - March: Aquamarine");
                break;
            }
            case 4: {
                System.out.println(birthmonth + " - April: Diamond");
                break;
            }
            case 5: {
                System.out.println(birthmonth + " - May: Emerald");
                break;
            }
            case 6: {
                System.out.println(birthmonth + " - June: Pearl");
                break;
            }
            case 7: {
                System.out.println(birthmonth + " - July: Ruby");
                break;
            }
            case 8: {
                System.out.println(birthmonth + " - August: Peridot");
                break;
            }
            case 9: {
                System.out.println(birthmonth + " - September: Sapphire");
                break;
            }
            case 10: {
                System.out.println(birthmonth + " - October: Opal");
                break;
            }
            case 11: {
                System.out.println(birthmonth + " - November: Topaz");
                break;
            }
            case 12: {
                System.out.println(birthmonth + " - December: Turquoise");
                break;
            }
            default: {
                System.out.println(birthmonth + " - Invalid birth month!");
            }
        }
    }

}
