package Panels;

import Main.FindWayOut_Main;
import Operator.modeListener;
import Util.Fonts;
import Util.UIColor;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {
    public JRadioButton mode1 = new JRadioButton("Chicken");
    public JRadioButton mode2 = new JRadioButton("Duck");
    public JRadioButton mode3 = new JRadioButton("Dragon");

    private int buttonGap = 30;
    private int button_Y = 180;
    private int button_X = 70;

    public LeftPanel(){
        setBackground(UIColor.body);
        setLayout(null);
        setPreferredSize(new Dimension((FindWayOut_Main.ratio_size_unit/2),FindWayOut_Main.ratio_size_unit));
        add(mode1);
        add(mode2);
        add(mode3);

        mode1.setBounds(button_X,button_Y,150,40);
        mode1.setBackground(UIColor.body);
        mode1.setFont(Fonts.font_pixel);
        mode1.addActionListener(new modeListener());
        mode1.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");
        mode1.setFocusable(false);

        mode2.setBounds(button_X,button_Y+buttonGap,150,40);
        mode2.setBackground(UIColor.body);
        mode2.setFont(Fonts.font_pixel);
        mode2.addActionListener(new modeListener());
        mode2.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");
        mode2.setFocusable(false);

        mode3.setBounds(button_X,button_Y+2*buttonGap,150,40);
        mode3.setBackground(UIColor.body);
        mode3.setFont(Fonts.font_pixel);
        mode3.addActionListener(new modeListener());
        mode3.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");
        mode3.setFocusable(false);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(UIColor.mid_body);
        //g.drawString("HI",15,15);
        g.setFont(Fonts.font_main);
        g.drawString(("Mode"),button_X,165);
    }
}
