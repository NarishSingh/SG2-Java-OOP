/**
 * ask for age
 * calc heart rate range for excersise:
 * max = 220-age
 * target = 50-85% of max
 */
package EPP3Scanner;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int userAge = input.nextInt();

        int maxHR = 220 - userAge;
        System.out.println("Your maximum heart rate should be: " + maxHR);

        double activeHRmin = 0.5 * maxHR;
        double activeHRmax = 0.85 * maxHR;
        System.out.println("Your target active HR should be " + activeHRmin + "-" + activeHRmax + " BPM");
    }

}
