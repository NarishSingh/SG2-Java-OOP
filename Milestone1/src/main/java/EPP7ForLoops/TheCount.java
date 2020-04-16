/**
 * prompt user for start, end, and increment
 */
package EPP7ForLoops;

import java.util.Scanner;

public class TheCount {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int counter=0;
        
        System.out.println("The Count of Sesame Street says:");
        System.out.println("***I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU!***");
        System.out.print("Start at: ");
        int start=input.nextInt();
        System.out.print("Stop at: ");
        int stop=input.nextInt();
        System.out.print("Count by: ");
        int incr=input.nextInt();
        
        for (int i = start; i <= stop; i+=incr){
            System.out.print(i + " ");
            counter++;
            
            if (counter%3==0) {
                System.out.print(" - ah ah ah!\n");
            }
        }
    }
    
}
