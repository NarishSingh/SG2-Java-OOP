/**
 * Help a child pick food to eat
 * Here are the rules:
 * If the food has any spinach in it or a funny name, print out: "There's no way he'll eat that!"
 * If the food has been fried more than 2 times, but less than 4, and it's covered in chocolate, print out: "Oh, it's like a deep-fried Snickers. That'll be a hit!"
 * If it's been fried twice and is covered in cheese, print out: "Mmm. Yeah, he'll each fried cheesy doodles."
 * If it is broccoli, has more than 6 pats of butter on top, and is covered in cheese, print out: "As long as the green is hidden by cheddar, it'll happen!"
 * But otherwise, if it is broccoli, print out: "Oh, green stuff like that might as well go in the bin."
 */
package EPP4IfElse;

import java.util.Scanner;

public class PickyEater {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.print("How many times has it been fried? (#): ");
        int fried = input2.nextInt();

        System.out.print("Does it have any spinach in it? (y/n): ");
        String hasSpinach = input.nextLine();

        System.out.print("Is it covered in cheese? (y/n): ");
        String gotsCheese = input.nextLine();

        System.out.print("How many times was butter applied? (#): ");
        int butter = input2.nextInt();

        System.out.print("Is it covered in chocolate? (y/n): ");
        String chocCovered = input.nextLine();

        System.out.print("Does it have a funny name (y/n): ");
        String funnyName = input.nextLine();

        System.out.print("Is it broccoli? (y/n): ");
        String isBrocc = input.nextLine();

        if (hasSpinach.equals("y") || funnyName.equals("y")) {
            System.out.println("The child won't eat it!");
        }
        
        if(fried>2 && fried<4 && chocCovered.equals("y")){
            System.out.println("Is it a deep-fried snickers? The child will eat it");
        }
        
        if (fried==2 && gotsCheese.equals("y")) {
            System.out.println("The child likes fried cheese doodles");
        }
        
        if (isBrocc.equals("y")) {
            if (butter > 6 && gotsCheese.equals("y")) {
                System.out.println("As long as the green is covered in cheese, it works.");
            } else {
                System.out.println("Its futile, throw it out");
            }
        }
    }

}
