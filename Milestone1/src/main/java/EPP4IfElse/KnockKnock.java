package EPP4IfElse;

import java.util.Scanner;

public class KnockKnock {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Knock knock! Guess who!!!");
        String nameGuess = input.nextLine();

        //use .equals() to compare strings
        if (nameGuess.equals("Marty McFly")) {
//        if (nameGuess=="Marty McFly") {
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".....from the future");
        } else {
            System.out.println("Dude, do I look like a " + nameGuess);
        }
    }

}
