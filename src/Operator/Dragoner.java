package Operator;

import Panels.CenterPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Dragoner implements ActionListener {
    Random rander = new Random();
    public static int drag_r ;
    public static int drag_g ;
    public static int drag_b ;

    public static int obst_r;
    public static int obst_g;
    public static int obst_b;

    public static int char_r;
    public static int char_g;
    public static int char_b;

    public static int tile_r;
    public static int tile_g;
    public static int tile_b;
    @Override
    public void actionPerformed(ActionEvent e) {
       drag_r = rander.nextInt(255);
       drag_g = rander.nextInt(255);
       drag_b = rander.nextInt(255);

       obst_r = rander.nextInt(255);
       obst_g = rander.nextInt(255);
       obst_b = rander.nextInt(255);

       char_r = rander.nextInt(255);
       char_g = rander.nextInt(255);
       char_b = rander.nextInt(255);

       tile_r = rander.nextInt(255);
       tile_g = rander.nextInt(255);
       tile_b = rander.nextInt(255);
       CenterPanel.screen.repaint();
    }
}
