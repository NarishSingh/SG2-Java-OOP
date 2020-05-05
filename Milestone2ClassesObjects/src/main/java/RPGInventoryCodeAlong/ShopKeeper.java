/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPGInventoryCodeAlong;

public class ShopKeeper implements NPC {

    @Override
    public void talk() {
        System.out.println("Do you want to trade?");
    }

    @Override
    public Item[] showInventory() {
        Item[] shopList = {new HealingPotion(15.0, 2.0), new HealingPotion(20.0, 2.0)};
        return shopList;
    }

}
