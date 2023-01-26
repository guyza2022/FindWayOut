package Panels;

import Main.FindWayOut_Main;
import Operator.ColorChanger;
import Util.Fonts;
import Util.UIColor;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {
    public static int second = 00;
    JButton left = new JButton("<<");
    JButton right = new JButton(">>");
    JButton middle = new JButton("Color");
    JPanel colorTab = new JPanel();
    ColorChanger colorChanger = new ColorChanger();
    JLabel version = new JLabel("                                                 " +
            "                          v.1");
    public RightPanel(){
        setBackground(UIColor.body);
        setPreferredSize(new Dimension(FindWayOut_Main.ratio_size_unit/2,FindWayOut_Main.ratio_size_unit));
        setLayout(new BorderLayout());
        add(version,BorderLayout.NORTH);
        add(colorTab,BorderLayout.SOUTH);
        colorTab.setLayout(new FlowLayout());
        colorTab.setBackground(UIColor.body);
        colorTab.add(left);
        left.setBackground((UIColor.mid_body));
        left.setForeground(Color.WHITE);
        left.setFont(Fonts.font_pixel);
        left.addMouseListener(colorChanger);
        left.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");
        left.setFocusable(false);
        colorTab.add(middle);
        middle.setBackground((UIColor.mid_body));
        middle.setForeground(Color.WHITE);
        middle.setFont(Fonts.font_pixel);
        middle.addMouseListener(colorChanger);
        middle.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");
        middle.setFocusable(false);
        colorTab.add(right);
        right.setBackground(UIColor.mid_body);
        right.setForeground(Color.WHITE);
        right.setFont(Fonts.font_pixel);
        right.addMouseListener(colorChanger);
        right.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");
        right.setFocusable(false);
        setFocusable(false);

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(Fonts.font_main);
        g.drawString(("Time"),77,165);
        g.setFont(Fonts.font_main_big);
        g.setColor(UIColor.obstacle_fire);
        g.drawString(""+second,75,260);

    }
}
