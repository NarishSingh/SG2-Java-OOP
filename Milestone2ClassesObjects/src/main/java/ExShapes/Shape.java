/*
Shape abstract class
 */
package ExShapes;

public abstract class Shape {

    protected double area;
    protected double perimeter;

    abstract protected double getArea();

    abstract protected double getPerimeter();
}
