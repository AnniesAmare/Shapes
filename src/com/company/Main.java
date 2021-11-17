package com.company;
import java.awt.*;

public class Main {
    public static void end() {
        System.out.println("Calculation - Finished \n\n");
    }

    public static void main(String[] args) {
        //Examples for use of our Shapes-structure
        Point a = new Point(10,5);
        Point b = new Point(15,10);
        Point c = new Point(1,1);
        Circle circle = new Circle(3,3,10);
        Triangle triangleABC = new Triangle(a,b,c);
        Rectangle rectangle = new Rectangle(c, 20,15);

        //Get the center of a shape
        System.out.println("Getting center of rectangle:");
        System.out.println(rectangle.getCenter());
        end();

        //Calculate which shape has the biggest area.
        System.out.println("Printing shape areas:");
        System.out.println("Area of circle is = "+circle.computeArea());
        System.out.println("Area of triangle is = "+triangleABC.computeArea());
        System.out.println("Area of rectangle is = "+rectangle.computeArea());
        end();

        //Calculate the distance between shapes
        System.out.println("Printing distance from circle to triangle (center to center):");
        System.out.println(circle.computeDistTo(triangleABC));
        end();

        //Calculate if triangle or rectangle has the biggest circumference
        System.out.println("Printing shape circumferences:");
        System.out.println("Circumference of triangle is = "+triangleABC.computeCirc());
        System.out.println("Circumference of rectangle is = "+rectangle.computeCirc());
        if (rectangle.computeCirc() > triangleABC.computeCirc()) System.out.println("Rectangle is bigger");
        else if (rectangle.computeCirc() < triangleABC.computeCirc()) System.out.println("Triangle is bigger");
        else System.out.println("Their circumferences are the same");
        end();

        //See if the center of the triangle is within the rectangle.
        Point triangleCenter = triangleABC.center;
        System.out.println("Calculating if point:");
        System.out.println(triangleCenter);
        System.out.println("is within the rectangle");
        System.out.println("Result: "+rectangle.includesPoint(triangleCenter));
        end();
    }

}
