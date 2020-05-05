package RPGInventoryCodeAlong;

public class HealingPotion extends Potion {

    /*ctor*/
    public HealingPotion(double cost, double weight) {
        super(cost, weight);
    }

    /*behaviors*/
    @Override
    public void drink() {
        System.out.println("The hero healed 10 HP.");
    }
}
