package EPP6WhileDoLoops;

import java.util.Scanner;

public class RollerCoaster {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String keepRiding = "y";
        int loopsLooped = 0;

        System.out.println("Welcome to the roller coaster of doom.");
        System.out.println("Hit n to exit, or face your doom");

        while (keepRiding.equals("y")) { //if changed to n, while loop never triggers
//        while (!keepRiding.equals("n")) { //checks if not no
            System.out.println("WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!");
            System.out.print("Want to keep going? (y/n) :");
            keepRiding = input.nextLine();
            loopsLooped++;
        }

        System.out.println("Wow, that was full of doom");
        System.out.println("We looped that doom loop " + loopsLooped + " times!!");
    }

}
