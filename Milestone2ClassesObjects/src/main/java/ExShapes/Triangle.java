/*
Triangle class
 */
package ExShapes;

public class Triangle extends Shape {

    /*fields*/
    private double a, b, c, h;

    /*ctor*/
    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b; //base
        this.c = c;
        this.h = h;
    }

    /*getter/setter*/
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
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
        return (getB() * getH()) / 2;
    }

    @Override
    public double getPerimeter() {
        double p = getA() + getB() + getC();
        return p;
    }

}
