/**
 * ask at least 3 multiple choice q's
 * after all answered --> score and display final count
 * display an appropriate congratulations
 *
 */
package EPP4IfElse;

import java.util.Scanner;

public class TriviaNight {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rightAns = 0;

        System.out.println("Who created the Java programming language?");
        System.out.println("1 - Apple/Macintosh");
        System.out.println("2 - Microsoft");
        System.out.println("3 - Sun Microsystems"); //a
        System.out.println("4 - Samsung");
        int ans1 = input.nextInt();
        if (ans1 == 3) {
            rightAns++;
        }

        System.out.println("What is the current OS version for Windows");
        System.out.println("1 - Me");
        System.out.println("2 - 95");
        System.out.println("3 - 7");
        System.out.println("4 - 10"); //a
        int ans2 = input.nextInt();
        if (ans2 == 4) {
            rightAns++;
        }

        System.out.println("True or false: Apple and Microsoft were founded  in the same year");
        System.out.println("1 - True");
        System.out.println("2 - False"); //a
        int ans3 = input.nextInt();
        if (ans3==2) {
            rightAns++;
        }
        
        System.out.println("You got " + rightAns + " answers right!");
        
        switch(rightAns){
            case 0:{
                System.out.println("So sad...Let me play you a song on the world's smallest violin");
                break;
            }
            case 1:{
                System.out.println("You tried, go home");
                break;
            }
            case 2:{
                System.out.println("Ok, almost there");
                break;
            }
            case 3:{
                System.out.println("Perfect score");
                break;
            }
            default:{
                System.out.println("How did you screw this up");
                break;
            }
        }
    }

}
