package VehicleCodeAlong;

public class Car extends Vehicle {

    /*fields*/
    private double currentSpeed;
    private double accel;

    /*ctor*/

    public Car(double accel, String name, String color, double maxSpeed) {
        super(name, color, maxSpeed);
        this.accel = accel;
    }
    
    
    public Car(String name, String color, double maxSpeed, boolean isMoving, String brand, int modelYear, int numOfWheel, boolean hasInterior, double accel) {
        super(name, color, maxSpeed, isMoving, brand, modelYear, numOfWheel, hasInterior);
        this.accel=accel;
    }

    /*getter/setters*/
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    /*behaviors*/
 /*
    @Override
    public void move() {
        super.move();
        double accel = 10;
        setCurrentSpeed(this.currentSpeed+accel);
    }
     */
    
    @Override
    public void gas() {
        super.gas();
        setCurrentSpeed(this.currentSpeed + this.accel);
        
        System.out.println("Your " + getName() + " is moving at " + getCurrentSpeed() + "MPH");
    }

    @Override
    public void brake() {
        super.brake();
        setCurrentSpeed(this.currentSpeed - this.accel);
        
        System.out.println("Your " + getName() + " is moving at " + getCurrentSpeed() + "MPH");
    }

}
