/*
Child of Person class
 */
package PersonCodeAlong;

public class Employee extends Person {

    /*fields*/
    private double salary;

    /*ctors*/
    public Employee(double salary, String name, int age, Address home) {
        super(name, age, home); //calls the parent's ctor
        this.salary = salary;
    }

    /*getters/setters*/
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() + " salary=" + salary + '}';
    }

}
