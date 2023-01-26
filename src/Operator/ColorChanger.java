package Operator;

import Main.FindWayOut_Main;
import Panels.CenterPanel;
import Util.UIColor;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class ColorChanger implements MouseListener {
    Random random = new Random();
    int i = random.nextInt(30);

    @Override
    public void mouseClicked(MouseEvent e) {

    }
    @Override
    public void mousePressed(MouseEvent e) {

            UIColor.vary_b = random.nextInt(255);
            UIColor.vary_g = random.nextInt(255);
            UIColor.vary_r = random.nextInt(255);

            System.out.println(i);
            double j = i;   //Implicit casting
            System.out.println(j);

            System.out.println(UIColor.vary_b);
            int x = (int) Math.round(Math.random()*random.nextInt(25)+j);   //explicit casting
            int y = (int) Math.round(Math.random()*random.nextInt(25)+j);
            int z = (int) Math.round(Math.random()*random.nextInt(25)+j);
            if (UIColor.vary_b + x <= 255){
                UIColor.vary_b += x;
            }
            if (UIColor.vary_r + y <= 255){
                UIColor.vary_r += y;
            }
            if (UIColor.vary_g + z <= 255){
                UIColor.vary_g += z;
            }
            CenterPanel.screen.repaint();
        }


    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
