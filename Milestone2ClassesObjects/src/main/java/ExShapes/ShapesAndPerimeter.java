/*
Create a set of classes to represent a square, rectangle, triangle, and circle. 
Have these classes inherit from an abstract base class called Shape. 
Each class will implement at least two read-only fields area and perimeter — 
represented by their getters: getArea(), which will return the area of the shape; 
and getPerimeter(), which will return the perimeter of the shape.
 */
package ExShapes;

import java.util.Scanner;

public class ShapesAndPerimeter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ap = true;

        System.out.println("Welcome to the area and perimeter calculator!");
        System.out.println("Select the shape type and follow the prompts:");

        while (ap) {
            System.out.println("1 - Circle");
            System.out.println("2 - Triangle");
            System.out.println("3 - Rectangle");
            System.out.println("4 - Square");
            System.out.println("5 - Exit");
            int user = input.nextInt();

            switch (user) {
                case 1: { //circle
                    System.out.print("Enter radius (r): ");
                    double circleR = input.nextDouble();

                    Circle c = new Circle(circleR);
                    System.out.println("Area = " + c.getArea());
                    System.out.println("Perimeter = " + c.getPerimeter());

                    break;
                }
                case 2: { //triangle
                    System.out.print("Enter base (b): ");
                    double triB = input.nextDouble();
                    System.out.print("Enter height (h): ");
                    double triH = input.nextDouble();
                    System.out.print("Enter side (a): ");
                    double triA = input.nextDouble();
                    System.out.print("Enter side (c): ");
                    double triC = input.nextDouble();

                    Triangle t = new Triangle(triA, triB, triC, triH);
                    System.out.println("Area = " + t.getArea());
                    System.out.println("Perimeter = " + t.getPerimeter());
                    break;
                }
                case 3: { //rectange
                    System.out.print("Enter width (w): ");
                    double rectW = input.nextDouble();
                    System.out.print("Enter height (h): ");
                    double rectH = input.nextDouble();

                    Rectangle r = new Rectangle(rectW, rectH);
                    System.out.println("Area = " + r.getArea());
                    System.out.println("Perimeter = " + r.getPerimeter());
                    break;
                }
                case 4: { //square
                    System.out.print("Enter side (s): ");
                    double sqS = input.nextDouble();

                    Square s = new Square(sqS);
                    System.out.println("Area = " + s.getArea());
                    System.out.println("Perimeter = " + s.getPerimeter());
                    break;
                }
                default: {
                    ap = false;
                }
            }

            System.out.println("-------");
        }
    }

}
