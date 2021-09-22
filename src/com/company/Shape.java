package com.company;
import java.awt.*;

public abstract class Shape {
    Point middlePoint;

    public abstract Point getCenter();
    public void computeArea() {}
    public void computeCirc() {}
    public void computeDist() {}
    public void includesPoint() {}
}
