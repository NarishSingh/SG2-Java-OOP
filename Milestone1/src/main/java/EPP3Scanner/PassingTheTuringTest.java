/**
 * ask for user name
 * display name and tell them your ai's name
 * repeat for color, food, number
 * say goodbye
 */
package EPP3Scanner;

import java.util.Scanner;

public class PassingTheTuringTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aiName = "Ramsingh Sharma";
        String aiColor = "Red";
        String aiFood = "Mangoes";
        double aiNum = 3789.32569741235;

        System.out.println("Hi! What's your name?");
        String username = input.nextLine();
        System.out.println("Hi " + username + ", my name is " + aiName);
        System.out.println("What is your favorite color?");
        String userColor = input.nextLine();
        System.out.println("I like " + userColor + " too! My favorite is " + aiColor);
        System.out.println("What is your favorite food?");
        String userFood = input.nextLine();
        System.out.println("I haven't tried " + userFood + " before...I like " + aiFood);
        System.out.println("What's your favorite number?");
        double userNum = input.nextDouble();
        System.out.println(userNum + " is cool! My favorite number is " + aiNum);
        System.out.println("Ok, nice to meet you! Good-bye");
    }

}
