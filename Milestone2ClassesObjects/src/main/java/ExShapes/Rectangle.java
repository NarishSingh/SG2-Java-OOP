/*
Rectangle class
 */
package ExShapes;

public class Rectangle extends Shape {

    /*fields*/
    private double w, h;

    /*ctor*/
    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    /*getter/setter*/
    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    /*behavior overrides*/
    @Override
    public double getArea() {
        return getH() * getW();
    }

    @Override
    public double getPerimeter() {
        return (2 * getH()) + (2 * getW());
    }
}
