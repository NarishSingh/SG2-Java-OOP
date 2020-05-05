package VehicleCodeAlong;

public class Plane extends Vehicle {
    
    /*fields*/
    private boolean isFlying;
    private double currentSpeed;
    private double accel;

    /*ctor*/
    public Plane(double accel, String name, String color, double maxSpeed) {
        super(name, color, maxSpeed);
        this.isFlying = false;
        this.accel = accel;
    }

    /*getters/setters*/
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
        this.setIsFlying(true);
        System.out.println("The plane " + getName() + " has taken off!");
    }
    
    public void land(){
        super.brake();
        this.setIsFlying(false);
        System.out.println("The plane " + getName() + " has landed!");
    }
    
}
