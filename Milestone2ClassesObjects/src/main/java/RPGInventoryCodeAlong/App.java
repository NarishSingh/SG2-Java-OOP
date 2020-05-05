/*
5/5/20
Item like in an RPG management system
 */
package RPGInventoryCodeAlong;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Item i1 = new Item(); //d.ctor
        Item i2 = new Item(15.0, 2.0); //paramatized ctor

        i2.setWeight(50.0);

        Potion p1 = new Potion(30.0, 1.0); //uses's the item p.ctor
        p1.drink();

        //polymorphism
        Item p2 = new Potion(30.0, 2.0);
//        p2.drink(); //bc it is Item, can't access the child class behaviors
        ((Potion) p2).drink(); //Using a cast to now access the child methods

        //using var weak typing
        var theClass = p2.getClass();
        System.out.println("theClass = " + theClass);

        //inventory
        Item[] inventory = {i1, i2, p1, p2};
        double totalWeight = 0.0;
        for (int i = 0; i < inventory.length; i++) {
            totalWeight += inventory[i].getWeight();
        }
        System.out.println(totalWeight);

        //healing potions, child of potion which is child of item
        HealingPotion p3 = new HealingPotion(50.0, 3.0);
        p3.drink(); //uses the override

        //shopkeeper
        NPC potionShop = new ShopKeeper();
        potionShop.talk();
        potionShop.showInventory();

        //Map
        Map<Integer, Item> itemInventory = new HashMap<>();

        //some id's
        Item i3 = new Item(15.0, 1.0);
        i3.setId(0);
        Item i4 = new Item(15.0, 1.0);
        i4.setId(1);
        Item i5 = new Item(15.0, 1.0);
        i5.setId(2);

//        itemInventory.put(0, new Item(15.0, 1.0));
        itemInventory.put(i3.id, i3);
        itemInventory.put(i4.id, i4);
        itemInventory.put(i5.id, i5);

        Set keys = itemInventory.keySet();
        
        ArrayList<Item> itemList=new ArrayList();
        for (Object key : keys) {
            itemList.add(itemInventory.get(key));
        }
    }

}
