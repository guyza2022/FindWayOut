package Operator;

import Main.FindWayOut_Main;
import Panels.CenterPanel;
import Panels.ScreenPanel;
import Util.Stage;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardAction implements KeyListener {
    public KeyboardAction(){

    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {
        if (ScreenPanel.gameRunning) {
            ScreenPanel.canGo = true;
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                ScreenPanel.checkHitFire(ScreenPanel.position_x - 1, ScreenPanel.position_y);
                if (ScreenPanel.current_stage == 1) {
                    for (Point element : Stage.stage1_point) {
                        if (element.getX() == ScreenPanel.position_x - 1 && ScreenPanel.position_y == element.getY()) {
                            ScreenPanel.canGo = false;
                        }
                    }
                } else if (ScreenPanel.current_stage == 2) {
                    for (Point element : Stage.stage2_point) {
                        if (element.getX() == ScreenPanel.position_x - 1 && ScreenPanel.position_y == element.getY()) {
                            ScreenPanel.canGo = false;
                        }
                    }
                } else if (ScreenPanel.current_stage == 3) {
                    for (Point element : Stage.stage3_point) {
                        if (element.getX() == ScreenPanel.position_x - 1 && ScreenPanel.position_y == element.getY()) {
                            ScreenPanel.canGo = false;
                        }
                    }
                }
                if (ScreenPanel.position_x - 1 > 0 && ScreenPanel.position_x - 1 < 21 && ScreenPanel.canGo
                        && ScreenPanel.checkHitFire(ScreenPanel.position_x - 1, ScreenPanel.position_y)) {
                    ScreenPanel.position_x -= 1;
                }
            } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                ScreenPanel.checkHitFire(ScreenPanel.position_x + 1, ScreenPanel.position_y);
                if (ScreenPanel.current_stage == 1) {
                    for (Point element : Stage.stage1_point) {
                        if (element.getX() == ScreenPanel.position_x + 1 && ScreenPanel.position_y == element.getY()) {
                            ScreenPanel.canGo = false;
                        }
                    }
                } else if (ScreenPanel.current_stage == 2) {
                    for (Point element : Stage.stage2_point) {
                        if (element.getX() == ScreenPanel.position_x + 1 && ScreenPanel.position_y == element.getY()) {
                            ScreenPanel.canGo = false;
                        }
                    }
                } else if (ScreenPanel.current_stage == 3) {
                    for (Point element : Stage.stage3_point) {
                        if (element.getX() == ScreenPanel.position_x + 1 && ScreenPanel.position_y == element.getY()) {
                            ScreenPanel.canGo = false;
                        }
                    }
                }
                if (ScreenPanel.position_x + 1 > 0 && ScreenPanel.position_x + 1 < 21 && ScreenPanel.canGo
                        && ScreenPanel.checkHitFire(ScreenPanel.position_x + 1, ScreenPanel.position_y)) {
                    ScreenPanel.position_x += 1;
                }

            } else if (e.getKeyCode() == KeyEvent.VK_UP) {
                ScreenPanel.checkHitFire(ScreenPanel.position_x, ScreenPanel.position_y - 1);
                if (ScreenPanel.current_stage == 1) {
                    for (Point element : Stage.stage1_point) {
                        if (element.getY() == ScreenPanel.position_y - 1 && ScreenPanel.position_x == element.getX()) {
                            ScreenPanel.canGo = false;
                        }
                    }
                } else if (ScreenPanel.current_stage == 2) {
                    for (Point element : Stage.stage2_point) {
                        if (element.getY() == ScreenPanel.position_y - 1 && ScreenPanel.position_x == element.getX()) {
                            ScreenPanel.canGo = false;
                        }
                    }
                } else if (ScreenPanel.current_stage == 3) {
                    for (Point element : Stage.stage3_point) {
                        if (element.getY() == ScreenPanel.position_y - 1 && ScreenPanel.position_x == element.getX()) {
                            ScreenPanel.canGo = false;
                        }
                    }
                }
                if (ScreenPanel.position_y - 1 > 0 && ScreenPanel.position_y - 1 < 21 && ScreenPanel.canGo
                        && ScreenPanel.checkHitFire(ScreenPanel.position_x, ScreenPanel.position_y - 1)) {
                    ScreenPanel.position_y -= 1;
                }
            } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                ScreenPanel.checkHitFire(ScreenPanel.position_x, ScreenPanel.position_y + 1);
                if (ScreenPanel.current_stage == 1) {
                    for (Point element : Stage.stage1_point) {
                        if (element.getY() == ScreenPanel.position_y + 1 && ScreenPanel.position_x == element.getX()) {
                            ScreenPanel.canGo = false;
                        }
                    }
                } else if (ScreenPanel.current_stage == 2) {
                    for (Point element : Stage.stage2_point) {
                        if (element.getY() == ScreenPanel.position_y + 1 && ScreenPanel.position_x == element.getX()) {
                            ScreenPanel.canGo = false;
                        }
                    }
                } else if (ScreenPanel.current_stage == 3) {
                    for (Point element : Stage.stage3_point) {
                        if (element.getY() == ScreenPanel.position_y + 1 && ScreenPanel.position_x == element.getX()) {
                            ScreenPanel.canGo = false;
                        }
                    }
                }
                if (ScreenPanel.position_y + 1 > 0 && ScreenPanel.position_y + 1 < 21 && ScreenPanel.canGo
                        && ScreenPanel.checkHitFire(ScreenPanel.position_x, ScreenPanel.position_y + 1)) {
                    ScreenPanel.position_y += 1;
                }
            }


            if (ScreenPanel.checkGetInDoor(ScreenPanel.position_x, ScreenPanel.position_y)) {
                ScreenPanel.changeMap();
            }

            CenterPanel.screen.repaint();

        }

        else{

            if(ScreenPanel.endGame == false){
                if(e.getKeyCode() == KeyEvent.VK_SPACE){
                    if (FindWayOut_Main.leftController.mode1.isSelected() ||
                            FindWayOut_Main.leftController.mode2.isSelected() ||
                            FindWayOut_Main.leftController.mode3.isSelected()){

                        FindWayOut_Main.leftController.mode1.setVisible(true);
                        FindWayOut_Main.leftController.mode2.setVisible(true);
                        FindWayOut_Main.leftController.mode3.setVisible(true);
                        CenterPanel.screen.modeSelected = true;
                        ScreenPanel.canStartTimer = true;
                        ScreenPanel.setStartGameParameter(); //gameRunning true endGame False
                        CenterPanel.screen.repaint();

                    }
                    ScreenPanel.roundNotClick --;
                    CenterPanel.screen.repaint();

                }

            }
            else{//endGame == true
                if(e.getKeyCode() == KeyEvent.VK_SPACE){
                    ScreenPanel.resetParameter(); //gameRunning false endGame false
                    CenterPanel.screen.repaint(); //repaint the screen to start game
                    FindWayOut_Main.leftController.mode1.setVisible(true);
                    FindWayOut_Main.leftController.mode2.setVisible(true);
                    FindWayOut_Main.leftController.mode3.setVisible(true);
                    FindWayOut_Main.centerPanel.repaint();
                }
            }

        }
    }
        @Override
        public void keyReleased (KeyEvent e){

        }
    }

