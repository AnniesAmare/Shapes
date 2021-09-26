package com.company;
import java.awt.*;
import java.lang.Math;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle = new Circle(5,5,10);
    Circle a = new Circle(2,3,15);
    Point inCircle = new Point(6,8);
    Point notInCircle = new Point(12,22);

    @org.junit.jupiter.api.Test
    void getCenterTest() {
        Point middle = new Point (5,5);
        assertEquals(circle.getCenter(),middle);
    }

    @org.junit.jupiter.api.Test
    void computeAreaTest() {
        assertEquals(circle.computeArea(),100*Math.PI);
    }

    @org.junit.jupiter.api.Test
    void computeCircTest() {
        assertEquals(circle.computeCirc(),2*Math.PI*10);
    }

    @org.junit.jupiter.api.Test
    void computeDistToTest(){
        assertEquals(circle.computeDistTo(a), Math.sqrt(13));
    }

    @org.junit.jupiter.api.Test
    void includesPointTest1(){
        assertTrue(circle.includesPoint(inCircle));
    }

    @org.junit.jupiter.api.Test
    void includesPointTest2(){
        assertFalse(circle.includesPoint(notInCircle));
    }
}