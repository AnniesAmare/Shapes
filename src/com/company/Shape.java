package com.company;
import java.awt.*;
import java.lang.Math;

public abstract class Shape {
    Point center;

    public abstract Point getCenter(); //Returns a center point
    public abstract double computeArea(); //Computes the area of a given shape
    public abstract double computeCirc(); //Computes the circumference of a shape
    public double computeDistTo(Shape a){ //Computes the euclidean distance between the center of two shapes
        double x1 = this.center.getX();
        double y1 = this.center.getY();
        double x2 = a.center.getX();
        double y2 = a.center.getY();
        double powSum = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        double dist = Math.sqrt(powSum);
        return dist;
    }
    public abstract boolean includesPoint();
}
