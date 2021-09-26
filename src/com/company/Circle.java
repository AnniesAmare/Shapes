package com.company;
import java.awt.*;

//Anne-Thea arbejder på det her og den tilhørende test
public class Circle extends Shape {
    double radius;

    //Constructors
    public Circle(Point a, double radius) {
        this.center = a;
        this.radius = radius;
    }

    public Circle(int x, int y, double radius) {
        this.center = new Point(x,y);
        this.radius = radius;
    }

    //Methods
    public Point getCenter() {
        return this.center;
    }
    public double computeArea() {
        double r = this.radius;
        double area = Math.PI*Math.pow(r,2);
        return area;
    }
    public double computeCirc() {
        double r = this.radius;
        double circ = 2*Math.PI*r;
        return circ;
    }
    public boolean includesPoint(Point a) {
        double x1 = this.center.getX();
        double y1 = this.center.getY();
        double x2 = a.getX();
        double y2 = a.getY();
        double powSum = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        double dist = Math.sqrt(powSum);

        return false;
    }

}
