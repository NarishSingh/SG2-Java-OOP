package VehicleCodeAlong;

public class Vehicle {

    /*fields*/
    private String brand;
    private int modelYear;
    protected String name;
    protected String color;
    protected double maxSpeed;
    protected boolean isMoving;
    private int numOfWheel;
    private boolean hasInterior;
    
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

    public Vehicle(String name, String color, double maxSpeed, boolean isMoving, String brand, int modelYear, int numOfWheel, boolean hasInterior) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.isMoving = isMoving;
        this.brand = brand;
        this.modelYear = modelYear;
        this.numOfWheel = numOfWheel;
        this.hasInterior = hasInterior;
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

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
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

    public int getNumOfWheel() {
        return numOfWheel;
    }

    public void setNumOfWheel(int numOfWheel) {
        this.numOfWheel = numOfWheel;
    }

    public boolean isHasInterior() {
        return hasInterior;
    }

    public void setHasInterior(boolean hasInterior) {
        this.hasInterior = hasInterior;
    }

    /*methods*/
    public void gas(){
        setIsMoving(true);
    }
    
    public void brake(){
        setIsMoving(false);
    }
}
