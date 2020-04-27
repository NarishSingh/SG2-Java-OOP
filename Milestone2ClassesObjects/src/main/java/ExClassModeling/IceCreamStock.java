/*
Model ice cream as if the class were to be part of the stocking system at a grocery store.
 */
package ExClassModeling;

public class IceCreamStock {

    /*fields*/
    private static final int TOTAL_STOCK = 0; //store capacity for items
    private String brandName;
    private String flavor;
    private static int totalContainers; //stock of a certain brand and flavor
    private double containerSize;
    private int itemID;
    private double cost;

    /*ctors*/
    public IceCreamStock() {
        //default
    }

    public IceCreamStock(String brandName, String flavor, double containerSize, double cost) {
        this.brandName = brandName;
        this.flavor = flavor;
        this.containerSize = containerSize;
        this.cost = cost;
    }

    /*get/set*/
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public static int getTotalContainers() {
        return totalContainers;
    }

    public static void setTotalContainers(int totalContainers) {
        IceCreamStock.totalContainers = totalContainers;
    }

    public double getContainerSize() {
        return containerSize;
    }

    public void setContainerSize(double containerSize) {
        this.containerSize = containerSize;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    /*behaviors*/
    //Calculate the total profit for the containers of a flavor
    //calculate the price to restock
    //generate an ID number for a container to track it
}
