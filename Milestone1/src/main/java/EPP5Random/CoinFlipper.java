/**
 * simulate a random coin toss, but without using nextInt()
 */
package EPP5Random;

import java.util.Random;

public class CoinFlipper {

    public static void main(String[] args) {
        Random rand = new Random();
        String coinFace;
        
        boolean coinBool=rand.nextBoolean();
        
        //2 sides, 2 bool values
        if (coinBool==true) {
            coinFace="Heads";
        } else {
            coinFace="Tails";
        }
        
        System.out.println("Ready, set, flip!");
        System.out.println("You got " + coinFace);
    }
    
}
