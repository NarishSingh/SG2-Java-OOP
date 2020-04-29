/*
Circle class
 */
package ExShapes;

public class Circle extends Shape {

    /*fields*/
    private double r;

    /*ctor*/
    public Circle(double r) {
        this.r = r;
    }

    /*getter/setter*/
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    /*behavior overrides*/
    @Override
    public double getArea() {
        return Math.PI * Math.pow(getR(), 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (2 * getR());
    }
}
