/**
 * Write a program that displays menu
 * 3 diff foods w prices using variables
 */
package EPP2Variables;

/**
 *
 * @author naris
 */
public class MenuOfChampions {

    public static void main(String[] args) {
        String restaurantName="Long Burger Joint";
        //menu
        String item1name = "Long Burger";
        double item1price = 5.76;
        String item2name = "Float Fries";
        double item2price = 2.96;
        String item3name = "Boolean Chicken Sandwich";
        double item3price = 4.83;
        
        System.out.println("Welcome to the " + restaurantName);
        System.out.println("Today's menu sucks. It includes:");
        System.out.println("1 | " + item1name + " - $" + item1price);
        System.out.println("2 | " + item2name + " - $" + item2price);
        System.out.println("3 | " + item3name + " - $" + item3price);
    }
    
}
