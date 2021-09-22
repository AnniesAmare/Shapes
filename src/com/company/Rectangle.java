package com.company;
import java.awt.*;

public class Rectangle extends Shape {

    Point cornerPoint;
    double height;
    double width;
    //middlepoint

    public Rectangle(Point cP, double h, double w){
        this.cornerPoint = cP;
        this.height = h;
        this.width = w;
    }

    //to display overloading. Not needed
    public Rectangle(int x, int y){
        this.cornerPoint = new Point(x,y, double h, double w);
        this.height = h;
        this.width = w;
    }



    public Point getCenter() {
        return null;
    }
    public double computeArea() { return 1;}
    public double computeCirc() {return 1;}
    public double computeDist() {return 1;}
    public boolean includesPoint() {return false;}
}
