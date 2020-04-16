package EPP6WhileDoLoops;

public class WaitAWhile {

    public static void main(String[] args) {
        int currentTime = 5; //if currentTime>bedTime the loop won't run
        int bedTime = 10; //when changed from 10 to 11, the loop runs an extra time

        while (currentTime < bedTime) {
            System.out.println("It's only " + currentTime + " o'clock!");
            System.out.println("I think I'll stay up....");
            currentTime++; //if commented out, we have a infinite loop
        }

        System.out.println("Lord have mercy. It's " + currentTime + " o'clock.");
        System.out.println("Time for bed ...");
    }

}
