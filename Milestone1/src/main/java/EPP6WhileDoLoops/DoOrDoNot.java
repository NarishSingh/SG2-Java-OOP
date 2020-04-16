package EPP6WhileDoLoops;

import java.util.Scanner;

public class DoOrDoNot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it to em? (y/n): ");
        boolean doItToEm;

        if (input.next().equals("y")) {
            doItToEm = true; //you already know what goin on
        } else {
            doItToEm = false;
        }

        boolean didItToEm = false;

        /*
        //since do while executes at least once, we will access the else-if statement on "n" entry
        do {
            didItToEm = true;
            break;
        } while (doItToEm);
        */
        
        //this while loop will allow us to access the "else" output, as it doesn't execute on "n" at all
        while (doItToEm) {            
            didItToEm = true;
            break;
        }
        
        if (doItToEm && didItToEm) { //if y entered, this executes
            System.out.println("You know I had to do it to em");
        } else if (!doItToEm && didItToEm) { //if n entered, this will execute
            System.out.println("I know you said not to...but you know I had to do it to em");
        } else {
            System.out.println("It wasn't me");
        }
    }

}
