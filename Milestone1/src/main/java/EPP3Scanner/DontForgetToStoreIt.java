/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EPP3Scanner;

import java.util.Scanner;

public class DontForgetToStoreIt {

    public static void main(String[] args) {
        int meaningOfLife = 42;
        double pi = 3.14159;
        String cheese, color;

        Scanner input = new Scanner(System.in);

        System.out.println("Give me pi to at least 5 decimal places");
        double userResponse1 = Double.parseDouble(input.nextLine());
//        double userResponse1 = input.nextDouble();

        System.out.println("What is the meaning of life, the universe & everything?");
        int userResponse2 = Integer.parseInt(input.nextLine());

        System.out.println("What is your favorite kind of cheese?");
        cheese = input.nextLine();

        System.out.println("Do you like the color red or blue more?");
        color = input.nextLine();

        System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
        System.out.println("The circumference of life is " + (2 * pi * meaningOfLife));
    }

}
