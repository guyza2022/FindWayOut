package Panels;

import Main.FindWayOut_Main;
import Util.Fonts;
import Util.UIColor;
import javax.swing.*;
import java.awt.*;
import Main.*;

public class CenterPanel extends JPanel {
    public static ScreenPanel screen = new ScreenPanel();
    private int hpBar_x = 100;
    private int hpBar_y = 430;

    public CenterPanel(){
        setBackground(UIColor.body);
        setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
        setPreferredSize(new Dimension(FindWayOut_Main.ratio_size_unit,FindWayOut_Main.ratio_size_unit));
        add(screen, BorderLayout.CENTER);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(UIColor.mid_body);
        g.fillRoundRect(0,0,FindWayOut_Main.ratio_size_unit, FindWayOut_Main.ratio_size_unit-38,50,50);
        g.setColor(Color.WHITE);
        g.drawRoundRect(hpBar_x,hpBar_y,320+1,15+1
                ,10,10);
        g.setColor(Color.WHITE);
        g.setFont(Fonts.font_pixel);
        g.drawString("HP",64,444);
        paintHP(g);
    }

    protected void paintHP(Graphics g){
        g.setColor(UIColor.obstacle_fire);
        g.fillRoundRect(hpBar_x+1,hpBar_y+1,(ScreenPanel.hp/10)*32,15,10,10);

    }
}
