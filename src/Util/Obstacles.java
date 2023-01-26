package Util;

import java.awt.*;

public class Obstacles {
    static int [] fireObs1_position_x = {6,10,14,5,15,2,19,10,10};
    static int [] fireObs1_position_y = {5,5,5,10,10,13,13,15,18};
    static int [] fireObs2_position_x = {2,8,16,12,5,17,7,13,2,8,17,19,12};
    static int [] fireObs2_position_y = {2,2,2,4,6,9,10,12,14,16,16,16,20};
    static int [] fireObs3_position_x = {2,4,10,17,19,6,13,16,19,6,9,13,11,18,6,16,16,12,14,1,3,9,18,17,10};
    static int [] fireObs3_position_y = {2,2,2,2,2,3,3,4,4,5,5,5,6,6,7,7,9,11,14,15,15,15,15,17,20};

    public static Point[] fireObs1_point = new Point[9];
    public static Point[] fireObs2_point = new Point[13];
    public static Point[] fireObs3_point = new Point[25];
    public Obstacles(){
        generateFire();
    }
    public static void generateFire(){
        for(int i=0;i<fireObs1_position_x.length;i++){
            System.out.println(i);
            fireObs1_point[i] = new Point(fireObs1_position_x[i],fireObs1_position_y[i]);
        }
        for(int i=0;i<fireObs2_position_x.length;i++){
            System.out.println(i);
            fireObs2_point[i] = new Point(fireObs2_position_x[i],fireObs2_position_y[i]);
        }
        for(int i=0;i<fireObs3_position_x.length;i++){
            System.out.println(i);
            fireObs3_point[i] = new Point(fireObs3_position_x[i],fireObs3_position_y[i]);
        }

    }

}
