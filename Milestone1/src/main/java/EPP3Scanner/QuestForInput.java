package EPP3Scanner;

import java.util.Scanner;

public class QuestForInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        String quest;
        double VofSwallow;

        System.out.println("What is your name?");
        name = input.nextLine();

        System.out.println("What is your quest?");
        quest = input.nextLine();

        System.out.println("What is the airspeed velocity of an unladen swallow?");
        VofSwallow = Double.parseDouble(input.nextLine());
//        VofSwallow=input.nextDouble();
        System.out.println("How do you know " + VofSwallow + " is correct, " + name + "?");
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds and instead go " + quest + ".");

    }

}
