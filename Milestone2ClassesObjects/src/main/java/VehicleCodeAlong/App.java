/*
5/5/20
In-Class assignment
-make a class and extend to a couple child classes
-make a interface and implement
 */
package VehicleCodeAlong;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Generic Car", "White", 50);
        v.gas();
        
        //cars
//        Car toyotaCamry = new Car("Camry", "Red", 125, false, "Toyota", 1998, 4, true, 15);
        Car toyotaCamry = new Car(15, "Camry", "Blue", 150);
        Car ferrariEnzo = new Car(60, "Enzo", "Red", 240);
        
        //planes
        Plane bob=new Plane(500, "Bob", "Blue", 1000);
        Plane airbus=new Plane(600, "Airbus", "Purple", 3000);
        Plane boeing=new Plane(700, "Boeing", "Red", 5000);

        //drive
        toyotaCamry.gas();
        toyotaCamry.gas();
        toyotaCamry.gas();
        toyotaCamry.brake();
        
        ferrariEnzo.gas();
        ferrariEnzo.gas();
        ferrariEnzo.gas();
        ferrariEnzo.gas();
        ferrariEnzo.gas();
        ferrariEnzo.brake();
        
        bob.takeoff();
        bob.land();
        
        //HashMap
        Map<Integer, Plane> planeHangar=new HashMap<>();
        
        //put obj's to HashMap
        planeHangar.put(0, bob);
        planeHangar.put(1, airbus);
        planeHangar.put(2, boeing);
        
        //keySet
        Set<Integer> planeKeys=planeHangar.keySet(); //keyset
        ArrayList<Plane> hangarRecord=new ArrayList<>(); //plane records
        
        for (Integer pk : planeKeys) {
            hangarRecord.add(planeHangar.get(pk)); //added plane records to List
        }
        
        //Make into a Strings
        ArrayList<String> hangarRecString=new ArrayList<>();
        
        for (Plane plane : hangarRecord) {
            String aPlane = PlaneRecord.saveRecord(plane);
            
            hangarRecString.add(aPlane);
        }
        
        System.out.println("");
        for (String planeString : hangarRecString) {
            System.out.println(planeString);
        }
    }

}
