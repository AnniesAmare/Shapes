package com.company;
import java.awt.*;

public class Rectangle extends Shape {
    Point cornerPoint;
    double height;
    double width;
    //center

    public Rectangle(Point cP, double h, double w){
        this.cornerPoint = cP;
        this.height = h;
        this.width = w;
    }

    //to display overloading. Not needed
    public Rectangle(int x, int y, double h, double w){
        this.cornerPoint = new Point(x,y);
        this.height = h;
        this.width = w;
    }



    public Point getCenter() {
        return null;
    }
    public double computeArea() { return 1;}
    public double computeCirc() {return 1;}
    public boolean includesPoint(Point a) {return false;} //try again now
}
