package com.company;
import java.awt.*;

public class Rectangle extends Shape {
    Point cornerPoint;
    double height;
    double width;
    //center (inherited from Shapes)

    public Rectangle(Point cP, double h, double w){
        this.cornerPoint = cP;
        this.height = h;
        this.width = w;
        this.center = getCenter();
    }

    //to display overloading. Not needed
    public Rectangle(int x, int y, double h, double w){
        this.cornerPoint = new Point(x,y);
        this.height = h;
        this.width = w;
        this.center = getCenter();

    }

    public Point getCenter() {
        double x = width/2+cornerPoint.getX();
        double y = height/2+cornerPoint.getY();
        Point center = new Point();
        center.setLocation(x,y);
        return center;
    }
    public double computeArea() {
        return height*width;
    }
    public double computeCirc() {
        return height*2+width*2;
    }
    public boolean includesPoint(Point a) {
        double cpX = cornerPoint.getX();
        double cpY = cornerPoint.getY();
        double aX = a.getX();
        double aY = a.getY();
        if (cpX < aX && aX < cpX+width && cpY < aY && aY < cpY+height){
            return true;
        } else {
            return false;
        }
    }
}
