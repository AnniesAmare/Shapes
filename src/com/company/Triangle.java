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
    public double hypotenuse;

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

        double sideAB = getDist(a,b);
        double sideBC = getDist(b,c);
        double sideCA = getDist(c,a);

        //Insert new values into the array to be returned
        double [] triangleSides = {sideAB, sideBC, sideCA};

        return triangleSides;
    }

    public double[] isolateHypotenuse(){
        double[] sideValues = findTriangleSides();
        double sideAB = sideValues[0];
        double sideBC = sideValues[1];
        double sideCA = sideValues[2];

        if(sideAB > sideBC && sideAB > sideCA){
            hypotenuse = sideAB;
            double[] legsOfTheTriangle1 = {sideBC, sideCA};
            return legsOfTheTriangle1;
        }else if(sideBC > sideAB && sideBC > sideCA){
            hypotenuse = sideBC;
            double[] legsOfTheTriangle2 = {sideAB, sideCA};
            return legsOfTheTriangle2;
        }else if(sideCA > sideAB && sideCA > sideBC){
            hypotenuse = sideAB;
            double[] legsOfTheTriangle3 = {sideAB, sideBC};
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
            double base = Math.pow(triangleLegs[0],2);
            double altitude = Math.pow(triangleLegs[1],2);
            double hyp = Math.pow(hypotenuse,2);

            if(hyp == base + altitude){
                return rightTriangle = true;
            }else{
                return rightTriangle = false;
            }
        }
    }


    public double computeArea(){
        double area = 0;
        int triangleSides[] = {1,2,3}; //dummy-placeholder
        int sideAB = triangleSides[0];
        int sideBC = triangleSides[1];
        int sideCA = triangleSides[2];

        boolean AB = true; //test value - have to be fixed to get real value
        boolean BC = true; //test value - have to be fixed to get real value
        boolean CA = true; //test value - have to be fixed to get real value


        if(rightTriangle){
            if(AB){
                area = 1/2 * sideBC * sideCA;

            }else if(BC){
                area = 1/2 * sideAB * sideCA;

            }else if(CA){
                area = 1/2 * sideAB * sideBC;

            }else{
                System.out.println("ERROR");
            }

        }else{

        }

        return area;
    }
    public double computeCirc(){
        return 0;
    }
    public boolean includesPoint(Point a){
        return true;
    }


}
