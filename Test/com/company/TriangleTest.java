package com.company;

import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;



class TriangleTest {
    Triangle triangle = new Triangle(-3,4,1,-2,5,5);
    Triangle triangleA = new Triangle(2,4,-1,0,2,0);
    Point inTriangle = new Point(-1,1);
    Point notInTriangle = new Point(9,4);

    @org.junit.jupiter.api.Test
    void getCenterTest() {
        Point expectedCenter = new Point(1,2);
        assertEquals(triangle.getCenter(),expectedCenter);
    }

    @Test
    void computeAreaTest(){
        assertEquals(triangle.computeArea(), 0.5 * Math.abs(-3 * (-2 - 5) + 1 * (5 - 4) + 5 * (4 - (-2))));
    }

    @Test
    void computeCircTest1() {
        assertEquals(triangle.computeCirc(),Math.sqrt(52.0) + Math.sqrt(65.0) + Math.sqrt(65.0));
    }

    @Test
    void computeDistToTest(){ assertEquals(triangle.computeDistTo(triangleA), Math.sqrt(1.0)); }

    @Test
    void includesPointTest1(){ assertTrue(triangle.includesPoint(inTriangle)); }

    @Test
    void includesPointTest2(){ assertFalse(triangle.includesPoint(notInTriangle)); }

}