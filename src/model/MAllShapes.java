package model;

/**
 * a fabric for Shape-Objects.
 * @author Agathe Merceron
 * expanded from Till Wischniewski
 */

import java.util.Arrays;

public class MAllShapes {

    /**
     * construct a number of Rectangle and Circle objects,
     * stores them in an array and returns it
     * @return an array filled with Rectangle or Circle objects
     */

    public static MShape[] getDefaultShapes(){
        MShape[] allshapes= new MShape[9];
        allshapes[0] = new MRectangle( 255, 125, 30, 25);
        allshapes[1] = new MRectangle( 155, 75, 10, 40);
        allshapes[2] = new MCircle( 80, 80, 10);
        allshapes[3] = new MRectangle( 45, 105, 80, 40);
        allshapes[4] = new MCircle( 200, 100, 50);
        allshapes[5] = new MSquare(200,150,25);
        allshapes[6] = new MSquare(100,255,70);
        allshapes[7] = new MEllipse(300,230,50,25);
        allshapes[8] = new MEllipse(150, 300, 80, 40);
        return allshapes;
    }

    public static void main(String[] args) {
        MShape[] mix =  MAllShapes.getDefaultShapes();
        System.out.println(Arrays.deepToString(mix));
    }

}