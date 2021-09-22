package com.company;
import java.awt.*;

public abstract class Shape {
    Point middlePoint;

    public abstract Point getCenter();
    public abstract double computeArea();
    public abstract double computeCirc();
    public abstract double computeDist();
    public abstract includesPoint();
}
