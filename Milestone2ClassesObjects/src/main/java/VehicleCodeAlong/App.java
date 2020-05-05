/*
5/5/20
In-Class assignment
-make a class and extend to a couple child classes
-make a interface and implement
 */
package VehicleCodeAlong;

public class App {
    
    public static void main(String[] args) {
        Car toyotaCarmy=new Car("Camry", "Red", 125, false, "Toyota", 1998, 4, true, 15);
//        Car ferrariEnzo=new Car("Enzo", "Red", 225, false, "Ferrari", 2005, 4, true);
        Car ferrariEnzo=new Car(60, "Enzo", "Red", 240);
        
        toyotaCarmy.gas();
        ferrariEnzo.gas();
    }

}
