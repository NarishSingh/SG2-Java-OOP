/*
Square class
 */
package ExShapes;

public class Square extends Shape {

    /*fields*/
    private double s;

    /*ctor*/
    public Square(double s) {
        this.s = s;
    }

    /*getter/setter*/
    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    /*behavior overrides*/
    @Override
    public double getArea() {
        return Math.pow(getS(), 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * getS();
    }
}
