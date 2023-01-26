package Operator;

import Main.FindWayOut_Main;
import Panels.RightPanel;
import Panels.ScreenPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gameTimer implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (RightPanel.second-1 < 0){
            ScreenPanel.setEndGameParameter();
            FindWayOut_Main.centerPanel.screen.duration.stop();
            FindWayOut_Main.centerPanel.screen.repaint();
        }
        else{
        RightPanel.second--;
    }
        FindWayOut_Main.rightController.repaint();
    }
}
