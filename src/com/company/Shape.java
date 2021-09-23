package com.company;
import java.awt.*;

public abstract class Shape {
    Point center;

    public abstract Point getCenter();
    public abstract double computeArea();
    public abstract double computeCirc();
    public double computeDist(){
        return 1;
    }
    public abstract boolean includesPoint();
}
