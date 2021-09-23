package com.company;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle circle = new Circle(5,5,10);

    @org.junit.jupiter.api.Test
    void getCenterTest() {
        Point middle = new Point (5,5);
        assertTrue(circle.getCenter().equals(middle));
    }

    @org.junit.jupiter.api.Test
    void computeAreaTest() {
        assertEquals(circle.computeArea(),100*Math.PI);
    }

    @org.junit.jupiter.api.Test
    void computeCircTest() {
        assertEquals(circle.computeCirc(),2*Math.PI*5);
    }
}