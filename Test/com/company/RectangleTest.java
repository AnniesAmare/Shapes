package com.company;
import java.awt.*;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Point cp = new Point(1,1);
    Rectangle rectangle = new Rectangle(cp,4,6);

    @Test
    void getCenterTest() {
        Point middle = new Point(3,4);
        assertEquals(rectangle.getCenter(),middle);
    }
    @org.junit.jupiter.api.Test
    void computeAreaTest() {
        assertEquals(rectangle.computeArea(),4*6);
    }

    @org.junit.jupiter.api.Test
    void computeCircTest() {
        assertEquals(rectangle.computeCirc(),(2*4)+(2*6));
    }

    @org.junit.jupiter.api.Test
    void computeDistToTest(){
        Rectangle rectangleA = new Rectangle(1,1,2,2);
        assertEquals(rectangle.computeDistTo(rectangleA), 2);
    }

    @org.junit.jupiter.api.Test
    void includesPointTest1(){
        //assertTrue(rectangle.includesPoint(inCircle));
    }

    @org.junit.jupiter.api.Test
    void includesPointTest2(){
    //    assertFalse(rectangle.includesPoint(notInCircle));
    }
}