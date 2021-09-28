package com.company;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Point a = new Point(10,5);
        System.out.println("NO ONE HAS FUCKED THIS UP YET");
        //All good in the hood
        Circle circle = new Circle(3,3,10);
        Triangle triangle = new Triangle(2,2,1,1,3,3);
        double dist = circle.computeDistTo(triangle);
        System.out.println(dist);
    }

}
