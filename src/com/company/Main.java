package com.company;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Point a = new Point(10,5);
        System.out.println("NO ONE HAS FUCKED THIS UP YET");
        //All good in the hood
        Circle circle = new Circle(3,3,10);
        Triangle triangle = new Triangle(2,2,1,1,3,8);
        Triangle triangle2 = new Triangle(4,4,5,5,8,8);
        Triangle TriangleTest = new Triangle(1,2,3,4,5,0);

        Point z = triangle.getCenter();
        System.out.println(z);

        double areeee = TriangleTest.computeArea();
        System.out.println(areeee);

        double dist0 = TriangleTest.computeDistTo(circle);
        System.out.println(dist0);

        double dist2 = triangle.computeDistTo(triangle2);
        System.out.println(dist2);


    }

}
