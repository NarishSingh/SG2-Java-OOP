/*
Model an airplane as if the class were to be part of an air traffic control system.
 */
package ExClassModeling;

public class AirplaneAirTraffic {

    /*fields*/
    private int flightIDnumber;
    private double longitude;
    private double latitude;
    private double currentHeight;
    private double speed;
    private String takeoff;
    private String destination;
    private double routeTime;
    private double destinationLong;
    private double destinationLat;
    private static int totalPlanesOnRoute; //total number of planes in a given area not depedent on airplane object
    private static double milesApart; //to maintain plane spacing
    private static int passengersOnRoute;

    /*ctors*/
    public AirplaneAirTraffic() {
        //default
    }

    public AirplaneAirTraffic(int flightIDnumber) {
        this.flightIDnumber = flightIDnumber;
    }

    public AirplaneAirTraffic(int flightIDnumber, String takeoff, String destination) {
        this.flightIDnumber = flightIDnumber;
        this.takeoff = takeoff;
        this.destination = destination;
    }

    /*get/set*/
    public int getFlightIDnumber() {
        return flightIDnumber;
    }

    public void setFlightIDnumber(int flightIDnumber) {
        this.flightIDnumber = flightIDnumber;
    }

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

    public double getCurrentHeight() {
        return currentHeight;
    }

    public void setCurrentHeight(double currentHeight) {
        this.currentHeight = currentHeight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getTakeoff() {
        return takeoff;
    }

    public void setTakeoff(String takeoff) {
        this.takeoff = takeoff;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getRouteTime() {
        return routeTime;
    }

    public void setRouteTime(double routeTime) {
        this.routeTime = routeTime;
    }

    public double getDestinationLong() {
        return destinationLong;
    }

    public void setDestinationLong(double destinationLong) {
        this.destinationLong = destinationLong;
    }

    public double getDestinationLat() {
        return destinationLat;
    }

    public void setDestinationLat(double destinationLat) {
        this.destinationLat = destinationLat;
    }

    public static int getTotalPlanesOnRoute() {
        return totalPlanesOnRoute;
    }

    public static void setTotalPlanesOnRoute(int totalPlanesOnRoute) {
        AirplaneAirTraffic.totalPlanesOnRoute = totalPlanesOnRoute;
    }

    public static double getMilesApart() {
        return milesApart;
    }

    public static void setMilesApart(double milesApart) {
        AirplaneAirTraffic.milesApart = milesApart;
    }

    public static int getPassengersOnRoute() {
        return passengersOnRoute;
    }

    public static void setPassengersOnRoute(int passengersOnRoute) {
        AirplaneAirTraffic.passengersOnRoute = passengersOnRoute;
    }

    /*behaviors*/
    //calculate amount of fuel needed
    //calculate optimal fly height given weather conditions
    //calculate optimal speed for flights to keep planes spaced out
    //calculate number of planes needed to service passengers
}
