/*
Child of Person class
 */
package PersonCodeAlong;

public class Contractor extends Person {

    private boolean permanent;
    private double hourlyRate;

    public Contractor(boolean permanent, double hourlyRate, String name, int age, Address home) {
        super(name, age, home);
        this.permanent = permanent;
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "Contractor{" + super.toString() + " permanent=" + permanent + ", hourlyRate=" + hourlyRate + '}';
    }

}
