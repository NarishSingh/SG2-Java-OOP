/*
-Model a house as if the class were to be part of a 3-D design system.
 */
package ClassModeling;

public class House3Dblueprint {

    /*fields - all non-static as they refer to particular building blueprints*/
    private String houseType;
    private int numOfFloors;
    private int numOfWindows;
    private int yardWidth;
    private int yardHeight;
    private int buildingWidth;
    private int buildingHeight;
    private boolean hasBasement;
    private boolean hasAttic;
    private double cost;

    /*ctors*/
    public House3Dblueprint() {
        //default
    }

    public House3Dblueprint(String houseType) {
        this.houseType = houseType;
    }

    public House3Dblueprint(String houseType, int numOfFloors, int buildingWidth, int buildingHeight) {
        this.houseType = houseType;
        this.numOfFloors = numOfFloors;
        this.buildingWidth = buildingWidth;
        this.buildingHeight = buildingHeight;
    }

    public House3Dblueprint(String houseType, double cost) {
        this.houseType = houseType;
        this.cost = cost;
    }

    public House3Dblueprint(String houseType, int numOfFloors, int numOfWindows, int yardWidth, int yardHeight, int buildingWidth, int buildingHeight, boolean hasBasement, boolean hasAttic, double cost) {
        this.houseType = houseType;
        this.numOfFloors = numOfFloors;
        this.numOfWindows = numOfWindows;
        this.yardWidth = yardWidth;
        this.yardHeight = yardHeight;
        this.buildingWidth = buildingWidth;
        this.buildingHeight = buildingHeight;
        this.hasBasement = hasBasement;
        this.hasAttic = hasAttic;
        this.cost = cost;
    }

    /*get/set*/
    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    public int getNumOfWindows() {
        return numOfWindows;
    }

    public void setNumOfWindows(int numOfWindows) {
        this.numOfWindows = numOfWindows;
    }

    public int getYardWidth() {
        return yardWidth;
    }

    public void setYardWidth(int yardWidth) {
        this.yardWidth = yardWidth;
    }

    public int getYardHeight() {
        return yardHeight;
    }

    public void setYardHeight(int yardHeight) {
        this.yardHeight = yardHeight;
    }

    public int getBuildingWidth() {
        return buildingWidth;
    }

    public void setBuildingWidth(int buildingWidth) {
        this.buildingWidth = buildingWidth;
    }

    public int getBuildingHeight() {
        return buildingHeight;
    }

    public void setBuildingHeight(int buildingHeight) {
        this.buildingHeight = buildingHeight;
    }

    public boolean isHasBasement() {
        return hasBasement;
    }

    public void setHasBasement(boolean hasBasement) {
        this.hasBasement = hasBasement;
    }

    public boolean isHasAttic() {
        return hasAttic;
    }

    public void setHasAttic(boolean hasAttic) {
        this.hasAttic = hasAttic;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    /*methods*/
    //method to calculate cost to house
    //method to calculate square feet of yard
    //method to calculate square feet of house
    //method to calculate cost of materials
}
