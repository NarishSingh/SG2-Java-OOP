package ExRefactor.Factorizer;

public class Factors {

    /*fields*/
    private int factor;

    /*ctors*/
    public Factors() {
        //default ctor
    }

    public Factors(int factor) {
        this.factor = factor;
    }

    /*get method*/
    public int getFactor() {
        return factor;
    }

    //no need for setter, no operation will ever set the factor to something different
    
    /*behaviors*/
    /**
     * Find and print all factors for a whole number print whether its prime
     * and/or perfect number
     */
    public void factorOperations() {
        int factorCt = 0;
        int sumOfFactors = 0;
        int numToFactor = getFactor();

        //factor
        for (int i = 1; i <= numToFactor; i++) {
            if (numToFactor % i == 0) {
                System.out.print(i + " ");
                factorCt++;
                sumOfFactors += i;
            }
        }

        System.out.println("\n" + numToFactor + " has " + factorCt + " factors");

        //prime? - 1 and itself = exactly 2 factors
        if (factorCt == 2) {
            System.out.println(numToFactor + " is a prime Number!");
        } else {
            System.out.println(numToFactor + " is a not prime Number...");
        }

        //perfect? sum of factors exclusive of final factor that == itself
        int perfectNumCalc = sumOfFactors - numToFactor;
        if (perfectNumCalc == numToFactor) {
            System.out.println(numToFactor + " is a perfect number!");
        } else {
            System.out.println(numToFactor + " is a not perfect number...");
        }
    }
}
