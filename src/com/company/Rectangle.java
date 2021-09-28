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
    public boolean includesPoint(Point a)
    {
        if (cornerPoint.getX() < a.getX() && a.getX() < cornerPoint.getX() + width && cornerPoint.getY() < a.getY() && a.getY() < cornerPoint.getY() + height){
            return true;
        } else {
            return false;
        }
    }
}
