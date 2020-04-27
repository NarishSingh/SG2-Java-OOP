/*
Refactor Factorizer Program
 */
package ExRefactor.Factorizer;

import java.util.Scanner;

public class FactorizerMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integer that you would like factored: ");
        int factor = input.nextInt();
        Factors f=new Factors(factor);

        System.out.println("Factors for " + factor + ":");

        f.factorOperations();
    }

}
