/**
 * sort the array for the perfect fruit salad
 * Best kind of fruit salad will have:
 *
 * As many berries as possible
 * <=3 apple types
 * <=2 orange types
 * no tomatos
 * <=12 fruit kinds total
 */
package EPP9Arrays;

public class FruitSalad {

    public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple",
            "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple",
            "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple", "Raspberry",
            "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple",
            "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        final int FRUIT_SALAD_LIMIT = 12;
        String[] fruitSalad = new String[FRUIT_SALAD_LIMIT];
//        String[] fruitSalad = new String[fruit.length]; //debug only
        int appleCount = 0;
        int orangeCount = 0;
        int fruitTypeCount = 0;
        int arraySlots = 0;

        for (int i = 0; i < fruit.length; i++) {
            if (fruitTypeCount == FRUIT_SALAD_LIMIT) {
                break;
            } else if (fruit[i].contains("Apple") && appleCount < 3) {
                fruitSalad[arraySlots] = fruit[i];
                appleCount++;
                fruitTypeCount++;
                arraySlots++;
            } else if (fruit[i].contains("Orange") && orangeCount < 2) {
                fruitSalad[arraySlots] = fruit[i];
                orangeCount++;
                fruitTypeCount++;
                arraySlots++;
            } else if (fruit[i].contains("berry")) {
                fruitSalad[arraySlots] = fruit[i];
                fruitTypeCount++;
                arraySlots++;
            }
        }

        System.out.println("Our fruit salad mix: ");
        for (int i = 0; i < fruitSalad.length; i++) {
            if (fruitSalad[i] == null) {
                break;
            } else {
                System.out.print(fruitSalad[i] + ", ");
            }
        }
    }

}
