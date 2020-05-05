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
