package com.company;
import java.awt.*;
import java.lang.Math;

public abstract class Shape {
    Point center;

    public abstract Point getCenter(); //Returns a center point
    public abstract double computeArea(); //Computes the area of a given shape
    public abstract double computeCirc(); //Computes the circumference of a shape
    public double computeDistTo(Shape a){ //Computes the euclidean distance between the center of two shapes
        double dist = getDist(this.center,a.center);
        return dist;
    }

    public static double getDist(Point a, Point b){
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double powSum = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        double dist = Math.sqrt(powSum);
        return dist;
    }
    public abstract boolean includesPoint(Point a);
}
