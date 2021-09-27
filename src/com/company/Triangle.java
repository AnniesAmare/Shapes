package com.company;
import java.awt.*;
/*The Math in this assignment is SHHHHIIIIITTTTT. I officially hate triangles!
ARRRGGGGGGHHHHH,the sheer frustration!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/

public class Triangle extends Shape {
    Point vertexA; //vertex means 'hjørne' in danish
    Point vertexB;
    Point vertexC;
    Point centroid; //fancy (correct) geometric designation for the center of a triangle
    boolean rightTriangle = false; //If boolean remains false, then triangle is arbitrary
    public double sideAB;
    public double sideBC;
    public double sideCA;
    public double hypotenuse;
    public double base;
    public double altitude;

    //Constructor
    public Triangle(Point a, Point b, Point c) {
        this.vertexA = a;
        this.vertexB = b;
        this.vertexC = c;
    }


    //Overloading to specify coordinates (not really needed, but used for ease of point input)
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.vertexA = new Point(x1,y1);
        this.vertexB = new Point(x2,y2);
        this.vertexC = new Point(x3,y3);
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
        centroid = new Point(cX,cY);
        return centroid;
    }

    public Point getCenter() {
        centroid = calculateCenter(this.vertexA, this.vertexB, this.vertexC);
        return centroid;
    }

    public double[] findTriangleSides(){
        Point a = this.vertexA;
        Point b = this.vertexB;
        Point c = this.vertexC;

        sideAB = getDist(a,b);
        sideBC = getDist(b,c);
        sideCA = getDist(c,a);

        //Insert new values into the array to be returned
        double [] triangleSides = {sideAB, sideBC, sideCA};

        return triangleSides;
    }

    public double[] isolateHypotenuse(){
        double[] sideValues = findTriangleSides();
        double AB = sideValues[0];
        double BC = sideValues[1];
        double CA = sideValues[2];

        if(AB > BC && AB > CA){
            hypotenuse = AB;
            double[] legsOfTheTriangle1 = {BC, CA};
            return legsOfTheTriangle1;
        }else if(BC > AB && BC > CA){
            hypotenuse = BC;
            double[] legsOfTheTriangle2 = {AB, CA};
            return legsOfTheTriangle2;
        }else if(CA > AB && CA > BC){
            hypotenuse = AB;
            double[] legsOfTheTriangle3 = {AB, BC};
            return legsOfTheTriangle3;
        }else{
            return null;
        }
    }

    public boolean triangleTypeCheck(){
        if(isolateHypotenuse() == null){
            /*triangleLegs being null means that the hypotenuse couldn't be found.
            Triangle is therefore by default arbitrary */
            return rightTriangle = false;
        }else{
            double[] triangleLegs = isolateHypotenuse();
            base = triangleLegs[0];
            altitude = triangleLegs[1];
            double powBase = Math.pow(base,2);
            double powAltitude = Math.pow(altitude,2);
            double hyp = Math.pow(hypotenuse,2);

            if(hyp == powBase + powAltitude){
                return rightTriangle = true;
            }else{
                return rightTriangle = false;
            }
        }
    }


    public double computeArea(){
        double area;

        if(triangleTypeCheck() == true){
            area = 0.5 * base * altitude; //area-calculation for right-angled triangle
        }else{
            /*Calculating area of arbitrary triangle by using 'Heron's Formula' -->
            https://www.cuemath.com/measurement/area-of-triangle-with-3-sides/
             */
            double semiPerimeter = (sideAB + sideBC + sideCA)/2;
            area = Math.sqrt(semiPerimeter *
                    (semiPerimeter - sideAB) * (semiPerimeter - sideBC) * (semiPerimeter - sideCA));
        }
        return area;
    }

    public double computeCirc(){
        double circumference;
        circumference = sideAB + sideBC + sideCA;
        return circumference;
    }

    public boolean includesPoint(Point p){
        /*REFERENCES FOR CALCULATIONS
        formula:
        https://www.geeksforgeeks.org/check-whether-a-given-point-lies-inside-a-triangle-or-not/
        example:
        https://www.youtube.com/watch?v=qObJQesvZUU
         */

        Point a = this.vertexA;
        Point b = this.vertexB;
        Point c = this.vertexC;
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();
        double pX = p.getX();
        double pY = p.getY();

        /* NOTE: I should be able to substitute the A-calculation with the area method.
        Though further testing is required to confirm whether that would change the result*/
        //area of triangle ABC --> used formula
        double A = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))/2;

        //area of triangle PAB
        double A1 = (pX * (y1 - y2) + x1 * (y2 - pY) + x2 * (pY - y1))/2;

        //area of triangle PBC
        double A2 = (pX * (y2 - y3) + x2 * (y3 - pY) + x3 * (pY - y2))/2;

        //area of triangle PAC
        double A3 = (pX * (y1 - y3) + x1 * (y3 - pY) + x3 * (pY - y1))/2;

        double sum = A1 + A2 + A3;


        if(sum == A){
            return true;
        }else{
            return false;
        }

    }


}
