package EPP4IfElse;

public class SpaceRustlers {

    public static void main(String[] args) {
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if (aliens > spaceships) {
            System.out.println("Vrroom, vroom! Let's get going!");
        } else {
            System.out.println("There aren't enough green guys to drive these ships!");
        }

        if (cows == spaceships) {
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships) {
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else if (aliens > cows) {
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        } else if (cows >= aliens) {
            System.out.println("Oh no! The herds got restless and took over! Looks like we're hamburger now!!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        //removing the else statement will not do anything if the variables are unedited
        //however, if we change the ships to a number 100, then we will miss the output in the else statement
    }
}