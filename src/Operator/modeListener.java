package Operator;

import Main.FindWayOut_Main;
import Panels.CenterPanel;
import Panels.RightPanel;
import Panels.ScreenPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class modeListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!ScreenPanel.gameRunning)
        {
            if (e.getSource() == FindWayOut_Main.leftController.mode1) {
                FindWayOut_Main.leftController.mode2.setSelected(false);
                FindWayOut_Main.leftController.mode3.setSelected(false);
                ScreenPanel.gameMode = 0;
                RightPanel.second = 30;
                FindWayOut_Main.rightController.repaint();
                CenterPanel.screen.modeSelected = true;
            } else if (e.getSource() == FindWayOut_Main.leftController.mode2) {
                FindWayOut_Main.leftController.mode1.setSelected(false);
                FindWayOut_Main.leftController.mode3.setSelected(false);
                ScreenPanel.gameMode = 1;
                RightPanel.second = 20;
                FindWayOut_Main.rightController.repaint();
                CenterPanel.screen.modeSelected = true;
            } else if (e.getSource() == FindWayOut_Main.leftController.mode3) {
                FindWayOut_Main.leftController.mode1.setSelected(false);
                FindWayOut_Main.leftController.mode2.setSelected(false);
                RightPanel.second = 15;
                FindWayOut_Main.rightController.repaint();
                ScreenPanel.gameMode = 2;CenterPanel.screen.modeSelected = true;
            }
            else{
                CenterPanel.screen.modeSelected = false;
            }

        }
        else {
            if (e.getSource() == FindWayOut_Main.leftController.mode1) {
                FindWayOut_Main.leftController.mode1.setSelected(false);
            } else if (e.getSource() == FindWayOut_Main.leftController.mode2) {
                FindWayOut_Main.leftController.mode2.setSelected(false);
            } else if (e.getSource() == FindWayOut_Main.leftController.mode3) {
                FindWayOut_Main.leftController.mode3.setSelected(false);
            }

        }
    }
}
