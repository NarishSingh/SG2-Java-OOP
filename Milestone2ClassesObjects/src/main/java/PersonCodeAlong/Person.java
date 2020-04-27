package PersonCodeAlong;

public class Person {

    /*fields*/
    private String name;
    private int age;
    private Address home; //uses address class

    /*ctors*/
    /*
    public Person() {
        //default
    }
    */

    public Person(String name, int age, Address home) {
        this.name = name;
        setAge(age); //we can use out setters in constructors to ensure proper field entry
        this.home = home;
    }

    /*getter/setter*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public final void setAge(int age) { // finals makes this a constant method and stops the overridable method warning
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Invalid age.");
        }
    }

    /*behaviors*/
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", home=" + home + '}';
    }

}
