/* Take user name and age 
 * convert age to years, months, days, hours, seconds, and milliseconds
 */
package Assignment1;

import java.util.Scanner;

public class UserNameAge {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //inputs
        System.out.println("Please enter your name:");
        String name = input.nextLine();

        System.out.println("Please enter your age:");
        int ageYrs = input.nextInt();
        
        //conversions
        int ageMonth = ageYrs * 12;
        int ageDays = ageYrs * 365;
        int ageHrs = ageDays * 24;
        int ageMin = ageHrs * 60;
        int ageSec = ageMin * 60;
        int ageMs = ageSec * 1000;
        
        System.out.println("Name: " + name);
        System.out.println("Age in years: " + ageYrs);
        System.out.println("Age in months: " + ageMonth);
        System.out.println("Age in days: " + ageDays);
        System.out.println("Age in hours: " + ageHrs);
        System.out.println("Age in minutes: " + ageMin);
        System.out.println("Age in seconds: " + ageSec);
        System.out.println("Age in milliseconds: " + ageMs);
    }

}
