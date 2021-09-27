package com.company;

import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;



class TriangleTest {
    Triangle triangle1 = new Triangle(1,2,3,4,5,0);
    Triangle rightTriangleTest = new Triangle(2,4,-1,0,2,0);
    int[] rightTriangleSides = {5, 3,4};
    int [] test;

    @org.junit.jupiter.api.Test
    void getCenterTest1() {
        Point center1 = new Point(3,2);
        assertEquals(triangle1.getCenter(),center1);
        //System.out.println(triangle1.getCenter());
    }

    @org.junit.jupiter.api.Test
    void triangleTypeCheckTest(){
        assertEquals(rightTriangleTest.triangleTypeCheck(), rightTriangleSides);
        System.out.println(rightTriangleTest.triangleTypeCheck());
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