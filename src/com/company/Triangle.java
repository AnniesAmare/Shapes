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

    public int[] findTriangleSides(){
        Point a = this.vertexA;
        Point b = this.vertexB;
        Point c = this.vertexC;
        double x1 = a.getX();
        double y1 = a.getY();
        double x2 = b.getX();
        double y2 = b.getY();
        double x3 = c.getX();
        double y3 = c.getY();


        //Sides are calculated by finding the distance between the vertices
        int sideAB = (int) Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)); //typecasting
        int sideBC = (int) Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2)); //typecasting
        int sideCA = (int) Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2)); //typecasting

        //Insert new values into the array to be returned
        int[] triangleSides = {sideAB, sideBC, sideCA};


        return triangleSides;
    }

    public boolean triangleTypeCheck(){
        int sides[] = findTriangleSides();
        int sideAB = sides[0];
        int sideBC = sides[1];
        int sideCA = sides[2];
        boolean AB = false;
        boolean BC = false;
        boolean CA = false;


        //I SHOULD METHOD THIS OUT SEPARATELY!!!!!!!!!!!!!!!!!

        //finding out which side of the triangle would be the hypotenuse if it were right-angled
        loop1: //labelling loop for later break statement
        for(int i = 0; i < sides.length; i++){
            if(sides[i] == sides[0]){
                sideAB = sides[0];
                if(sides[0] > sides[1] && sides[0] > sides[2]){
                    AB = true;
                    break loop1;
                }
            }else if(sides[i] == sides[1]){
                sideBC = sides[1];
                if(sides[1] > sides[0] && sides[1] > sides[2]){
                    BC = true;
                    break loop1;
                }

            }else if(sides[i] == sides[2]){
                sideCA = sides[2];
                if(sides[2] > sides[0] && sides[2] > sides[1]){
                    CA = true;
                    break loop1;
                }
            }

        }

        //Confirm whether triangle is right-angled or not using Pythagoras' theorem
        double ABCheck = Math.pow(sideAB,2);
        double BCCheck = Math.pow(sideBC,2);
        double CACheck = Math.pow(sideCA,2);

        if(AB){
            if(ABCheck == BCCheck + CACheck){
                return rightTriangle = true;
            }else{
                return rightTriangle = false;
            }

        }else if(BC){
            if(BCCheck == ABCheck + CACheck){
                return rightTriangle = true;
            }else{
                return rightTriangle = false;
            }

        }else if(CA){
            if(CACheck == ABCheck + BCCheck){
                return rightTriangle = true;
            }else{
                return rightTriangle = false;
            }

        }else{
             /*Since rightTriangle has remained false till here, that means that the hypotenuse couldn't be found.
            Triangle is therefore by default arbitrary */
            return rightTriangle = false;
        }

    }

    public double hypotenuse(){
        double max = 0;


        return max;
    }

    public double computeArea(){
        double area = 0;
        int triangleSides[] = findTriangleSides();
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
