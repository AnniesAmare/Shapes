package com.company;
import java.awt.*;

public class Circle extends Shape {
    double radius;

    //Constructors
    public Circle(Point a, double radius) {
        this.middlePoint = a;
        this.radius = radius;
    }

    public Circle(int x, int y, double radius) {
        this.middlePoint = new Point(x,y);
        this.radius = radius;
    }

    public Point getCenter() {
        return null;
    }
    public void computeArea() {}
    public void computeCirc() {}
    public void computeDist() {}
    public void includesPoint() {}

}
