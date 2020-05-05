package VehicleCodeAlong;

public class Plane extends Vehicle {
    
    /*fields*/
    private boolean isFlying;
    private double currentSpeed;
    private double accel;

    /*ctor*/
    public Plane(boolean isFlying, double currentSpeed, double accel, String name, String color, double maxSpeed) {
        super(name, color, maxSpeed);
        this.isFlying = isFlying;
        this.currentSpeed = currentSpeed;
        this.accel = accel;
    }

    /*g/s*/
    public boolean isIsFlying() {
        return isFlying;
    }

    public void setIsFlying(boolean isFlying) {
        this.isFlying = isFlying;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getAccel() {
        return accel;
    }

    public void setAccel(double accel) {
        this.accel = accel;
    }
    
    
    /*behaviors*/
    public void takeoff(){
        super.gas();
        System.out.println("The plane " + getName() + " has taken off!");
    }
    
    public void land(){
        super.brake();
        System.out.println("The plane " + getName() + " has landed!");
    }
    
}
