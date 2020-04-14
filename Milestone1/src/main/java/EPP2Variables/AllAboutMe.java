/** Choose variables for:
 * your name
 * your favorite food
 * how many pets you have
 * whether you live in a dorm, an apartment, a house, or something else
 * whether or not you learned to whistle
 * print to console in a meaningful sentence
 */
package EPP2Variables;

public class AllAboutMe {

    public static void main(String[] args) {
        String name = "Narish Singh";
        String faveFood = "Chicken Curry";
        int numOfPets=0;
        String residence="House";
        boolean canWhistle=false;
        
        System.out.println("My name is " + name);
        System.out.println("I have " + numOfPets + " pets");
        System.out.println("I live in a " + residence);
        System.out.println("When asked if I can whistle, I will tell you: " + canWhistle);
    }
    
}
