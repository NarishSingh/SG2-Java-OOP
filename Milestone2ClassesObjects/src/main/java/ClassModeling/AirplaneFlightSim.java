/*
Model an airplane as if the class were to be part of a flight simulator.
*/
package ClassModeling;

public class AirplaneFlightSim {
    /*fields*/
    private String model;
    private double fuelTank;
    private double maxSpeed;
    private double currentSpeed;
    private static final double MAX_REGULATION_SPEED=0; //legally allowed, not dependent on model
    private double maxAccel;
    private double currentAccel;
    private double currentFlightHeight;
    private static final double MAX_SAFE_HEIGHT=0; //max flight height for safety, not depedent on model
    
    /*ctors*/
    public AirplaneFlightSim() {
        //default
    }

    public AirplaneFlightSim(String model, double maxSpeed, double maxAccel) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxAccel = maxAccel;
    }
    
    /*get/set*/
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(double fuelTank) {
        this.fuelTank = fuelTank;
    }
    
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getMaxAccel() {
        return maxAccel;
    }

    public void setMaxAccel(double maxAccel) {
        this.maxAccel = maxAccel;
    }

    public double getCurrentAccel() {
        return currentAccel;
    }

    public void setCurrentAccel(double currentAccel) {
        this.currentAccel = currentAccel;
    }

    public double getCurrentFlightHeight() {
        return currentFlightHeight;
    }

    public void setCurrentFlightHeight(double currentFlightHeight) {
        this.currentFlightHeight = currentFlightHeight;
    }

    /*behaviors*/
    //calculate how fast plane will reach destination at current acceleration and speed
    //calculate how long before plane runs out of fuel
    //calculate difference between current speed and max allowed speed
    //calculate difference between current height and max allowed height
    
}
