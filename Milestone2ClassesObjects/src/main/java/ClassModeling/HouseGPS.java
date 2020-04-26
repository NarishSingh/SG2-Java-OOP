/*
-Model a house as if were to be part of a GPS mapping system.
 */
package ClassModeling;

public class HouseGPS {

    /*fields - all non-static as they are tied points of interest/address objects*/
    private double longitude;
    private double latitude;
    private int street;
    private int avenue;
    private int houseNumber;
    private String neighborhood;
    private String borough;
    private String city;
    private String state;

    /*ctors*/
    public HouseGPS() {
        //default
    }

    public HouseGPS(int longitude, int latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public HouseGPS(int street, int avenue, int houseNumber) {
        this.street = street;
        this.avenue = avenue;
        this.houseNumber = houseNumber;
    }

    public HouseGPS(int longitude, int latitude, int street, int avenue, int houseNumber, String neighborhood, String borough, String city, String state) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.street = street;
        this.avenue = avenue;
        this.houseNumber = houseNumber;
        this.neighborhood = neighborhood;
        this.borough = borough;
        this.city = city;
        this.state = state;
    }

    /*get/set*/
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getStreet() {
        return street;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    public int getAvenue() {
        return avenue;
    }

    public void setAvenue(int avenue) {
        this.avenue = avenue;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /*behaviors*/
    //method to return current location
    //method to lookup a house address
    //method to find a route between current location and an address
    //methods to track movement in real time as we go to house
}
