/**
 * update ForTimes such that it works like a quiz
 * one point added for correct user responses
 * incorrect responses will get no points, display correct answer
 * if >50%, tell them to study more
 * if <90% congrats
 */
package EPP7ForLoops;

import java.util.Scanner;

public class ForTimesFor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double points = 0;
        final int QUIZ_LENGTH = 15;

        System.out.print("Which times tables to drill?: ");
        int times = input.nextInt();

        for (int i = 0; i < QUIZ_LENGTH; i++) {
            System.out.print((i + 1) + " * " + times + " = ");
            int userAnswer = input.nextInt();
            int correctAns = (i + 1) * times;

            if (userAnswer == correctAns) {
                System.out.println("Correct!");
                points++;
            } else {
                System.out.println("Incorrect...the answer is " + correctAns);
            }
        }

        double pointsPercent = (points/QUIZ_LENGTH)*100;
        System.out.println("You scored " + points + " out of 15 - " + pointsPercent + "%");

        if (pointsPercent < 50) {
            System.out.println("You need to study more...");
        } else if (pointsPercent > 90) {
            System.out.println("Great work!");
        } else {
            System.out.println("Good work, better luck next time!");
        }
    }

}
