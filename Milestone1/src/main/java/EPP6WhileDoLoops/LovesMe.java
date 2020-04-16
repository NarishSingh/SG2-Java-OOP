/**
 * pull 34 petals off a rose, alternating statements
 */
package EPP6WhileDoLoops;

public class LovesMe {

    public static void main(String[] args) {
        int petalCounter = 34;

        System.out.println("I have a daisy...let's see if she loves me...");

        do {
            if (petalCounter % 2 == 0) {
                System.out.println("She loves me!");
                petalCounter--;
            } else {
                System.out.println("She loves me NOT");
                petalCounter--;
            }
        } while (petalCounter >= 0);
        
        //A do while loop has a slight benefit in the case that somehow petalCounter >=0, it will at least pick one petal
    }

}
