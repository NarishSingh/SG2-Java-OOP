/*
Code Along
4/27/20
 */
package PersonCodeAlong;

public class PersonMain {

    public static void main(String[] args) {
        //address is also an object, so need to call that ctor
//        Person p1 = new Person("Stewie", 2, new Address("123 Spooner", "Quahog", "54321")); //synamic way

        String name = "Stewie";
        int age = 2;
        Address stewieHome = new Address("123 Spooner", "Quahog", "54321");

        Person p1 = new Person(name, age, stewieHome);

//        System.out.println(stewieHome.getStreet() + " " + stewieHome.getCity() + " " + stewieHome.getZip());
        System.out.println(stewieHome.toString());
        System.out.println(p1.toString());
        
        //employee
        String empName="John Doe";
        int empAge=30;
        Address empHome = new Address("123st", "Brooklyn", "54321");
        double empSalary=65000.23;
        
        Employee emp1=new Employee(empSalary, empName, empAge, empHome);
        System.out.println(emp1.toString());
        
        //contractor
        String contName="Jane Doe II";
        int contAge=32;
        Address contHome = new Address("333st", "Bronx", "54924");
        boolean contPermanent=true;
        double contRate=99.63;
        
        Contractor cont1=new Contractor(contPermanent, contRate, contName, contAge, contHome);
        System.out.println(cont1.toString());
    }

}
