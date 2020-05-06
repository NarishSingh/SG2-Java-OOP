package ExStateCapitals3;

public class Capital {

    /*fields*/
    private String name;
    private int pop;
    private double sqMi;

    /*ctor*/
    public Capital(String name, int pop, double sqMi) {
        this.name = name;
        this.pop = pop;
        this.sqMi = sqMi;
    }

    /*getters*/
    public String getName() {
        return name;
    }

    public int getPop() {
        return pop;
    }

    public double getSqMi() {
        return sqMi;
    }

    /*behaviors*/
    @Override
    public String toString() {
        return name + ", population = " + pop + ", square mileage = " + sqMi;
    }

}
