/*
Model ice cream as if the class were to be part of the control system at the dairy that makes the ice cream.
 */
package ExClassModeling;

public class IceCreamProduction {

    /*fields*/
    private String flavorName;
    private static double containerSize; //standard icecream tub size
    private String[] ingrediants;
    private double[] ingrediantAmounts;
    private static double[] ingrediantTotalQuantities; //factory reserves
    private static final int FLAVOR_QUOTA = 0; //quota of containers produced based on demand

    /*ctors*/
    public IceCreamProduction() {
        //default
    }

    public IceCreamProduction(String flavorName) {
        this.flavorName = flavorName;
    }

    /*get/set*/
    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public static double getContainerSize() {
        return containerSize;
    }

    public static void setContainerSize(double containerSize) {
        IceCreamProduction.containerSize = containerSize;
    }

    public String[] getIngrediants() {
        return ingrediants;
    }

    public void setIngrediants(String[] ingrediants) {
        this.ingrediants = ingrediants;
    }

    public double[] getIngrediantAmounts() {
        return ingrediantAmounts;
    }

    public void setIngrediantAmounts(double[] ingrediantAmounts) {
        this.ingrediantAmounts = ingrediantAmounts;
    }

    public static double[] getIngrediantTotalQuantities() {
        return ingrediantTotalQuantities;
    }

    public static void setIngrediantTotalQuantities(double[] ingrediantTotalQuantities) {
        IceCreamProduction.ingrediantTotalQuantities = ingrediantTotalQuantities;
    }

    /*behaviors*/
    //fill ingrediants and ingrediantAmounts array from flavorName
    //store new flavor data, such as a name and the ingrediants and ingrediantAmounts arrays
    //calculate the number of containers that can be made based on ingrediantTotalQuantities
}
