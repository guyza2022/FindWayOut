package Util;

import java.awt.*;
import java.util.Random;

public class UIColor {
    Random random = new Random();
    public static int vary_r = 201;
    public static int vary_g = 0;
    public static int vary_b = 0;
    public static final Color lightBlack = new Color(190,190,190);
    public static final Color mid_body = new Color(58,58,58);
    public static final Color obstacle_normal = new Color(62,62,62);
    public static final Color obstacle_fire = new Color(201,0,0);
    public static final Color body = new Color(215,215,215);
    public static Color character = new Color( vary_r,vary_g,vary_b);

    UIColor() {

    }
}
