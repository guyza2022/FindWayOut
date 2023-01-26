package Util;

import java.awt.*;

public class Stage {
    private final int[] stage_1_position_x = {5,6,7,13,14,15,10,3,18,3,9,11,18,3,8,12,18,3,7,
            13,18,6,14,5,15,1,2,19,20,5,15,6,14,7,13,8,12,9,
            11,4,17,4,17,4,7,8,9,11,12,13,17,4,17,4,17,10};
    private final int [] stage_2_position_x = {6,12,6,11,12,13,14,15,18,6,18,1,2,3,4,8,9,15,17,18,
            19,9,12,15,3,9,15,17,7,8,9,10,15,18,4,12,15,1,2,3,4,15,4,10,11,6,7,8,11,
            13,14,15,18,6,15,2,6,18,19,20,5,6,7,8,9,10,12,14,15,2,6,12,15,6,12,18,1,2,
            3,6,6,10,11,12,13,14,15,19,4,6,4,6};
    private final int [] stage_2_position_y = {1,1,2,2,2,2,2,2,2,3,3,4,4,4,4,4,4,4,4,4,4,5,5,5,6,6,6,6,
            7,7,7,7,7,7,8,8,8,9,9,9,9,9,10,10,10,11,11,11,11,11,11,11,11,12,12,13,13,13,13,
            13,14,14,14,14,14,14,14,14,14,15,15,15,15,16,16,16,17,17,17,17,18,18,18,18,18,18,
            18,18,18,19,19,20,20};
    private final int [] stage_3_position_x = {8,14,15,6,8,11,14,20,14,16,1,2,3,4,6,9,11,17,7,14,16,3,6,9,
            12,14,20,1,7,14,17,4,7,9,11,14,18,2,7,12,20,1,2,3,4,5,7,8,9,10,14,16,17,18,20,16,5,7,8,9,
            10,12,14,16,18,19,20,3,5,7,9,16,18,7,11,13,16,20,2,4,20,6,7,11,13,14,15,20,3,7,9,15,1,5,7,
            11,13,16,19,5,7,8,14,18,3,5,12,16,20,17,18,15};
    private final int [] stage_3_position_y = {1,1,1,2,2,2,2,2,3,3,4,4,4,4,4,4,4,4,5,5,5,6,6,6,6,6,6,7,7,7,7,
            8,8,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,11,12,12,12,12,12,12,12,12,12,
            12,12,13,13,13,13,13,13,14,14,14,14,14,15,15,15,16,16,16,16,16,16,16,17,17,17,17,18,18,18,18,
            18,18,18,19,19,19,19,19,20,20,20,20,20,1,4,11};
    public static Point[] stage1_point = new Point[56];
    public static Point[] stage2_point = new Point[92];
    public static Point[] stage3_point = new Point[112];
    public Stage(){
        for(int i=0;i<stage_1_position_x.length;i++){
            //System.out.println(i);
            int[] stage_1_position_y = {2, 2, 2, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 9, 9, 10,
                    10, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16,
                    17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 20, 20, 10};
            stage1_point[i] = new Point(stage_1_position_x[i], stage_1_position_y[i]);

        }
        System.out.println(stage1_point);
        for(int i=0;i<stage_2_position_x.length;i++){
            //System.out.println(i);
            stage2_point[i] = new Point(stage_2_position_x[i],stage_2_position_y[i]);

        }
        System.out.println(stage2_point);
        for(int i=0;i<stage_3_position_x.length;i++){
            //System.out.println(i);
            stage3_point[i] = new Point(stage_3_position_x[i],stage_3_position_y[i]);

        }
        System.out.println(stage3_point);

    }
}
