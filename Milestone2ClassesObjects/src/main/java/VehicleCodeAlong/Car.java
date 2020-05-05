package VehicleCodeAlong;

public class Car extends Vehicle {

    /*fields*/
    private double currentSpeed;
    private final double accel = 10;

    /*ctor*/
    public Car(String name, String color, double maxSpeed, boolean isMoving, String brand, String modelYear, int numOfWheel, boolean hasInterior) {
        super(name, color, maxSpeed, isMoving, brand, modelYear, numOfWheel, hasInterior);
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
    public void gas() {
        super.move();
        setCurrentSpeed(this.currentSpeed + this.accel);
    }

    public void brake() {
        super.stopMoving();
        setCurrentSpeed(this.currentSpeed - this.accel);
    }

}
