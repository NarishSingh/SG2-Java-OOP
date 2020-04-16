/**
 * simulate a lazy teen
 * tell them repeatedly to clean their room --> increases 10% chance of cleaning room
 * After 7 --> grounded
 */
package EPP6WhileDoLoops;

import java.util.Random;

public class LazyTeenager {

    public static void main(String[] args) {
        Random rand = new Random();
        String cleanCmd = "Clean your room!!!";
        int cmdCt = 1;
        boolean willClean = false;
        double cleanLikelihood = 0.0;

        do {
            System.out.println(cleanCmd + "(x" + cmdCt + ")");

            cleanLikelihood += 0.1;
            double cleanDecision = rand.nextDouble();
//            System.out.println(cleanDecision);
            if (cleanDecision <= cleanLikelihood) {
                System.out.println("*The child decides to clean their room*");
                break;
            }

            cmdCt++;

            if (cmdCt > 7) {
                System.out.println("That's it, you are grounded! NO MORE VIDEO GAMES");
                break;
            }
        } while (willClean == false);
    }
}
