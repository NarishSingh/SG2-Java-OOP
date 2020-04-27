/*
Model a car as if the class were to be part of an inventory system for a car dealership.
 */
package ExClassModeling;

public class CarInventory {

    /*fields*/
    private int carID;
    private String model;
    private int modelYear;
    private String color;
    private double cost;
    private String[] carParts;
    private static final int MAX_HOLD = 0; //max capacity of dealership

    /*ctors*/
    public CarInventory() {
        //default
    }

    public CarInventory(String model, int modelYear) {
        this.model = model;
        this.modelYear = modelYear;
    }

    public CarInventory(int carID, String model, int modelYear, String color, double cost) {
        this.carID = carID;
        this.model = model;
        this.modelYear = modelYear;
        this.color = color;
        this.cost = cost;
    }

    /*get/set*/
    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String[] getCarParts() {
        return carParts;
    }

    public void setCarParts(String[] carParts) {
        this.carParts = carParts;
    }

    /*behaviors*/
    //randomize a new ID for incoming car
    //fill in carParts array from model name
    //calculate total cost of parts for vehicle
}
