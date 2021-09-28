package com.company;

import org.junit.jupiter.api.Test;
import java.awt.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;



class TriangleTest {

    Triangle arbitraryTriangleTest = new Triangle(1,2,3,4,5,0);
    Triangle rightTriangleTest = new Triangle(2,4,-1,0,2,0);
    double[] findTriangleSidesTestExpected = {5,3,4}; //right-angled
    //2,4,4

    @org.junit.jupiter.api.Test
    void getCenterTest() {
        Point expectedCenter = new Point(3,2);
        assertEquals(arbitraryTriangleTest.getCenter(),expectedCenter);
        System.out.println(arbitraryTriangleTest.getCenter());
    }

    @Test
    void getAreaTest(){ //Test needs fixing. Right now it just confirms it works
        Triangle Testing = new Triangle(-3,4,1,-2,5,5);
        System.out.println(arbitraryTriangleTest.computeArea() + " here");
        System.out.println(rightTriangleTest.computeArea());

        //result should be 26
        System.out.println(Testing.computeArea());

    }

    @org.junit.jupiter.api.Test
    void computeCircTest1() {
    }


}