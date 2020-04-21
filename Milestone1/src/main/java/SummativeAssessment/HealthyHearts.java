/*
Healthy Heart
Author: Narish Singh
Date Created: 4/20/20
Last Modified: 4/20/20
 */
package SummativeAssessment;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int HR_CAP = 220;

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age > 110 || age < 0) {
            throw new IllegalArgumentException("Impossible age inputted.");
        }

        int hrMax = HR_CAP - age;
        System.out.println("Maximum heartrate should be " + hrMax + "BPM");

        double targetHRmin = 0.5 * hrMax;
        double targetHRmax = 0.85 * hrMax;
        System.out.println("Target heartrate zone should be " + targetHRmin + "-" + targetHRmax + "BPM");
    }
}
