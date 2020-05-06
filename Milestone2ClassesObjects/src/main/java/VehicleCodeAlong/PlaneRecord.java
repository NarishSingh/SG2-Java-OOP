
/*
Handle io stream for recordkeeping
 */
package VehicleCodeAlong;

public class PlaneRecord {

    private static final String DELIMITER = "::";

    //marshalling
    public static String saveRecord(Plane p) {
        String planeString = "";

        //cast everything to String
        planeString += p.getName() + DELIMITER;
        planeString += p.getColor() + DELIMITER;
        planeString += Double.toString(p.getMaxSpeed()) + DELIMITER;
        planeString += Double.toString(p.getAccel());
//        planeString += p.getMaxSpeed() + DELIMITER;
//        planeString += p.getAccel();

        return planeString;
    }

    //unmarshalling
    public static Plane unloadRecord(String planeString) {
        String[] planeData = planeString.split(DELIMITER);

        //parse
        Plane plane = new Plane(Double.parseDouble(planeData[3]), planeData[0], planeData[1], Double.parseDouble(planeData[2]));

        return plane;
    }
}
