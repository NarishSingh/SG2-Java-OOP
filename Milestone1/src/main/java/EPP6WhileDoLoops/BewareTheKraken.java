package EPP6WhileDoLoops;

import java.util.Random;
import java.util.Scanner;

public class BewareTheKraken {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        
        int depthDivedInFt = 0;
        String fish1="Bass";
        String fish2="Mackarel";
        String fish3="Clownfish";
        
        
        System.out.println("We're going diving!");
        System.out.println("Lets go!!! *SPLASH*");

        //36200 = max depth
        //if we change the condition to true, nothing practically changes, as loop is broken by kraken or user, just like before
        while (depthDivedInFt < 36200) {
            System.out.println("So far, we've dove " + depthDivedInFt + " ft");

            //fish encounters
            int fishChooser=rand.nextInt(4);
            switch (fishChooser) {
                case 1:{
                    System.out.println("You encountered a wild " + fish1);
                    break;
                }
                case 2:{
                    System.out.println("You encountered a wild " + fish2);
                    break;
                }
                case 3:{
                    System.out.println("You encountered a wild " + fish3);
                    break;
                }
                default:{
                    //no encounter
                }
            }
            
            //kraken encounter
            if (depthDivedInFt >= 20000) {
                System.out.println("Uhhh, I think I see the Kraken...");
                System.out.println("LETS GET THE **** OUT OF HERE!");
                break;
            }
            
            depthDivedInFt += 1000;
            
            //prompt to go deeper
            System.out.print("Should we surface or go deeper? (y - surface /n - keep diving): ");
            String shouldSurface=input.nextLine();
            if (shouldSurface.equals("y")) {
                break;
            }
        }
        
        System.out.println();
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }

}
