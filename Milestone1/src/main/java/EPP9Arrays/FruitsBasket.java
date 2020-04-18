/**
 * get counts for fruits inside of array
 */
package EPP9Arrays;

public class FruitsBasket {

    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;
        int totalFruit = fruitBasket.length;

        for (int i = 0; i < fruitBasket.length; i++) {
            switch (fruitBasket[i]) {
                case "Apple": {
                    numApples++;
                    break;
                }
                case "Orange": {
                    numOranges++;
                    break;
                }
                default: {
                    numOtherFruit++;
                    break;
                }
            }
        }
        
        System.out.println("Total # of Fruit in Basket: " + totalFruit);
        System.out.println("Number of Apples: " + numApples);
        System.out.println("Number of Oranges: " + numOranges);
        System.out.println("Number of Other Fruit: " + numOtherFruit);
    }

}
