/*
Model a car as if the class were to be part of a video game.
*/
package ClassModeling;

public class CarGame {
    /*fields*/
    private String modelName;
    private int modelID;
    private String color;
    private double cost;
    private double currentSpeed;
    private double maxSpeed;
    private double currentAccel;
    private double maxAccel;
    private double handlingRating;
    private String[] playerModifications;
    private boolean purchased;
    
    /*ctors*/
    public CarGame() {
        //default
    }
    
    public CarGame(String modelName, int modelID, double cost) {
        this.modelName = modelName;
        this.modelID = modelID;
        this.cost = cost;
    }
    
    /*get/set*/
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelID() {
        return modelID;
    }

    public void setModelID(int modelID) {
        this.modelID = modelID;
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

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getCurrentAccel() {
        return currentAccel;
    }

    public void setCurrentAccel(double currentAccel) {
        this.currentAccel = currentAccel;
    }

    public double getMaxAccel() {
        return maxAccel;
    }

    public void setMaxAccel(double maxAccel) {
        this.maxAccel = maxAccel;
    }

    public double getHandlingRating() {
        return handlingRating;
    }

    public void setHandlingRating(double handlingRating) {
        this.handlingRating = handlingRating;
    }

    public String[] getPlayerModifications() {
        return playerModifications;
    }

    public void setPlayerModifications(String[] playerModifications) {
        this.playerModifications = playerModifications;
    }
    
    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

    /*behaviors*/
    //allow players to add modifications to playerModifications array
    //allow players to change color
    //methods for collision detection
    
}
