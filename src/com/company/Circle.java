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

    public Point getCenter() {
        return null;
    }
    public double computeArea() {
        return 0;
    }
    public double computeCirc() {
        return 0;
    }
    public double computeDist() {
        return 0;
    }
    public boolean includesPoint() {
        return true;
    }

}
