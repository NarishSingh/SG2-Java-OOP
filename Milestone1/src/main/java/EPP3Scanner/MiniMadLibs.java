/**
 * Mad Libs Game
 */
package EPP3Scanner;

import java.util.Scanner;

public class MiniMadLibs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter the following word types:");
        System.out.print("Noun: ");
        String ML1 = input.nextLine();
        System.out.print("Adjective: ");
        String ML2 = input.nextLine();
        System.out.print("Noun: ");
        String ML3 = input.nextLine();
        System.out.print("Number: ");
        double ML4 = input2.nextDouble(); //new scanner
        System.out.print("Adjective: ");
        String ML5 = input.nextLine();
        System.out.print("Plural Noun: ");
        String ML6 = input.nextLine();
        System.out.print("Plural Noun: ");
        String ML7 = input.nextLine();
        System.out.print("Plural Noun: ");
        String ML8 = input.nextLine();
        System.out.print("Present Tense Verb: ");
        String ML9 = input.nextLine();
        System.out.print("Past Tense of Previous Verb: ");
        String ML10 = input.nextLine();

        System.out.print(ML1 + ": the " + ML2 + " frontier. These are the voyages of the starship " + ML3
                + ". Its " + ML4 + "-year mission: to explore strange " + ML5 + " " + ML6 + ", to seek out "
                + ML5 + " " + ML7 + " and " + ML5 + " " + ML8 + " to boldly " + ML9 + " where no one has "
                + ML10 + " before.");
    }

}
