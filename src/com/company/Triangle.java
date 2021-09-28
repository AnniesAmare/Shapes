package com.company;
import java.awt.*;

//EUREKA ME!!!!!

public class Triangle extends Shape {
    Point vertexA; //vertex means 'hjørne' in danish
    Point vertexB;
    Point vertexC;

    //Constructor
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.vertexA = new Point(x1,y1);
        this.vertexB = new Point(x2,y2);
        this.vertexC = new Point(x3,y3);
        this.center = getCenter();
    }

    public Point calculateCenter(Point a, Point b, Point c){
        //Using the build.in Point-getter-function to get x and y for the vertex-coordinates
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();

        //Calculating center by using 'Centroid Formula' --> https://www.cuemath.com/centroid-formula/
        int cX = (int) (x1 + x2 + x3)/3; //Note that we are forced to use typecasting here,
        int cY = (int) (y1 + y2 + y3)/3; //because the getX/getY method returns a double
        Point center = new Point(cX,cY);
        return center;
    }

    public Point getCenter() {
        this.center = calculateCenter(this.vertexA, this.vertexB, this.vertexC);
        return this.center;
    }

    public double computeAreaFormula(Point a, Point b, Point c){
         /*REFERENCES FOR CALCULATIONS
         Method --> Coordinate Geometry
         formula:
         https://www.geeksforgeeks.org/check-whether-a-given-point-lies-inside-a-triangle-or-not/
         example:
         https://www.youtube.com/watch?v=It9Vd3UFYVg
         NOTE: It doesn't matter if its '/2' or '0.5*'. Same result
         */

        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();

        //the Math.abs method is to indicate "absolute value" (It's the two vertical bars in the formula)
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        return area;
    }

    public double computeArea(){
        double A = computeAreaFormula(this.vertexA, this.vertexB, this.vertexC);
        return A;
    }


    public double computeCirc(){
        Point a = this.vertexA;
        Point b = this.vertexB;
        Point c = this.vertexC;

        double sideAB = getDist(a,b);
        double sideBC = getDist(b,c);
        double sideCA = getDist(c,a);

        double circumference = sideAB + sideBC + sideCA;
        return circumference;
    }

    public boolean includesPoint(Point p){
        /* See all formula-references in 'computeAreaFormula'*/

        //area of triangle ABC
        double A = computeArea();

        //area of triangle PAB
        double A1 = computeAreaFormula(p, this.vertexA, this.vertexB);

        //area of triangle PBC
        double A2 = computeAreaFormula(p, this.vertexB, this.vertexC);

        //area of triangle PAC
        double A3 = computeAreaFormula(p, this.vertexA, this.vertexC);

        double sum = A1 + A2 + A3;


        if(sum == A){
            return true;
        }else{
            return false;
        }

    }


}
