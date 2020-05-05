package RPGInventoryCodeAlong;

public class Potion extends Item {

    /*ctor*/
    public Potion(double cost, double weight) {
        super(cost, weight); //calls the superclass's ctor
    }

    /*behaviors*/
    public void drink() {
        System.out.println("The hero sipped the potion.");
    }
}
