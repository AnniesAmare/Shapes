package com.company;

import org.junit.jupiter.api.Test;
import java.awt.*;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;



class TriangleTest {
    Triangle arbitraryTriangleTest = new Triangle(1,2,3,4,5,0);
    Triangle rightTriangleTest = new Triangle(2,4,-1,0,2,0);
    double[] findTriangleSidesTestExpected = {5,3,4};

    @org.junit.jupiter.api.Test
    void getCenterTest() {
        Point expectedCenter = new Point(3,2);
        assertEquals(arbitraryTriangleTest.getCenter(),expectedCenter);
        System.out.println(arbitraryTriangleTest.getCenter());
    }

   /* @org.junit.jupiter.api.Test
    void  triangleTypeCheckTest1(){
        assertTrue(rightTriangleTest.triangleTypeCheck());
        System.out.println(rightTriangleTest.triangleTypeCheck());

    }*/

    @Test
    void triangleSidesCalculationTest(){
        assertTrue(Arrays.equals(rightTriangleTest.findTriangleSides(), findTriangleSidesTestExpected));
        System.out.println(Arrays.toString(rightTriangleTest.findTriangleSides()));
    }

    @Test
    void isolateHypotenuseTest(){
        assertTrue(arbitraryTriangleTest.isolateHypotenuse() == null);
        assertTrue(rightTriangleTest.isolateHypotenuse() != null);
        assertFalse(rightTriangleTest.isolateHypotenuse() == null);
    }

    /*
    @org.junit.jupiter.api.Test
    void herePrebTest() {

        test = rightTriangleTest.findTriangleSides(rightTriangleTest.vertexA,
                rightTriangleTest.vertexB, rightTriangleTest.vertexC);

        System.out.println(test.toString());
        System.out.print(rightTriangleSides.toString());

    }


    @org.junit.jupiter.api.Test
    void findTriangleSidesTest(){
        assertEquals(rightTriangleTest.findTriangleSides
                (this.rightTriangleTest.vertexA, this.rightTriangleTest.vertexB, this.rightTriangleTest.vertexC)
                ,rightTriangleSides);

    }

    @org.junit.jupiter.api.Test
    void triangleTypeCheckTest(){
        assertTrue(rightTriangleTest.triangleTypeCheck(rightTriangleTest.findTriangleSides
                (this.rightTriangleTest.vertexA, this.rightTriangleTest.vertexB, this.rightTriangleTest.vertexC)));
    }
    */

    @org.junit.jupiter.api.Test
    void computeAreaTest1() {
    }

    @org.junit.jupiter.api.Test
    void computeCircTest1() {
    }
}