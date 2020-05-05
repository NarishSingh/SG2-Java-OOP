/*
Superclass
 */
package VehicleCodeAlong;

public class Vehicle implements Move {

    /*fields - protected so it can be inherited*/
    protected String brand;
    protected int modelYear;
    protected String name;
    protected String color;
    protected double maxSpeed;
    protected boolean isMoving;

    /*ctor*/
    public Vehicle() {
        //d.ctor
    }

    public Vehicle(String name, String color, double maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Vehicle(String name, String color, double maxSpeed, boolean isMoving) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.isMoving = isMoving;
    }

    public Vehicle(String name, String color, double maxSpeed, boolean isMoving, String brand, int modelYear) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.isMoving = isMoving;
        this.brand = brand;
        this.modelYear = modelYear;
    }

    /*getter/setter*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isIsMoving() {
        return isMoving;
    }

    public void setIsMoving(boolean isMoving) {
        this.isMoving = isMoving;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    /*methods*/
    @Override
    public void gas() {
        setIsMoving(true);
    }

    @Override
    public void brake() {
        setIsMoving(false);
    }
}
