/**
 * randomize petal count between 13-89
 */
package EPP6WhileDoLoops;

import java.util.Random;

public class MaybeItLovesMe {

    public static void main(String[] args) {
        Random rand = new Random();
        double petalCounter = Math.floor(rand.nextDouble() * (89 - 13) + 13);

        System.out.println(petalCounter);
        System.out.println("I have a daisy...let's see if she loves me...");

        do {
            if (petalCounter % 2 == 0) {
                System.out.println("She loves me!");
                
                if (petalCounter==0) {
                    System.out.println("She DOES love me!");
                    break;
                }
                
                petalCounter--;
            } else {
                System.out.println("She loves me NOT");
                
                if (petalCounter==0) {
                    System.out.println("Ouch");
                    break;
                }
                
                petalCounter--;
            }
        } while (petalCounter >= 0);
    }

}
