/*
5/5/20
In-Class assignment
-make a class and extend to a couple child classes
-make a interface and implement
 */
package VehicleCodeAlong;

public class App {

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Generic Car", "White", 50);
        v.gas();

//        Car toyotaCamry = new Car("Camry", "Red", 125, false, "Toyota", 1998, 4, true, 15);
        Car toyotaCamry = new Car(15, "Camry", "Blue", 150);
        Car ferrariEnzo = new Car(60, "Enzo", "Red", 240);
        
        Plane bob=new Plane(500, "Bob", "Blue", 1000);

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
    }

}
