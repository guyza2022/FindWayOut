package Panels;

import Main.FindWayOut_Main;
import Operator.KeyboardAction;
import Util.Fonts;
import Util.Obstacles;
import Operator.*;
import Util.UIColor;
import Util.Stage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScreenPanel extends JPanel implements ActionListener {
    public static final int gap = 1;
    public static int position_x = 1;
    public static int position_y = 20;
    static int radius = 6;
    public static int current_stage = 1;
    static int hp = 100;
    public static boolean canGo = true;
    static int door_x = 20;
    static int door_y = 1;
    static int initial_x = 1;
    static int initial_y = 20;
    public static boolean gameRunning = false;
    Obstacles obstacle = new Obstacles(); //generate obstacles
    Stage stages = new Stage(); //generate stage
    public static int gameMode = 0;
    static boolean whatReturnFire = true;
    public static boolean endGame = false;
    public static boolean modeSelected = false;
    public static int roundNotClick = 1;
    static int roundBlink = 0;
    public Timer animation1 = new Timer(500,this);
    public static Timer duration = new Timer(1000,new gameTimer());
    public static int cont = 2;
    static public Timer onOffLight = new Timer(cont*1000,new CountDownTimer());
    public static boolean canStartTimer = false;
    public static Timer dragonTime = new Timer(300,new Dragoner());

    ScreenPanel(){
        setPreferredSize(new Dimension(FindWayOut_Main.screen_width,FindWayOut_Main.screen_height));
        setLayout(null);
        setBackground(Color.white);
        setBorder(BorderFactory.createBevelBorder(1));
        setVisible(true);
        setFocusable(true);
        addKeyListener(new KeyboardAction());
        animation1.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        roundBlink += 1;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if(canStartTimer){
            if (gameMode == 2){
                dragonTime.start();
            }
            onOffLight.start();
            duration.start();
            canStartTimer = false;
        }
        super.paintComponent(g);
        g.setColor(UIColor.lightBlack);
        if (gameMode == 2){
            g.setColor(new Color(Dragoner.drag_r,Dragoner.drag_g,Dragoner.drag_b));
        }
        if(gameRunning){
            setBackground(Color.WHITE);
        for (int i=0;i<20;i++)
        {   //Generate rounded rectangle tiles
            for (int j=0;j<20;j++){
                g.fillRoundRect((j*FindWayOut_Main.unit_size)+gap,(i*FindWayOut_Main.unit_size)+gap,
                        FindWayOut_Main.unit_size-(2*gap),FindWayOut_Main.unit_size-(2*gap),3,3);
            }
        }
            paintObstacle(g);//Generate all obstacles

        }
        else{
            if (endGame == false) {
                paintStart(g);

            }
            else{
            paintEndGame(g);
        }
        }
    }

    static protected void paintObstacle(Graphics g){
        g.setColor(UIColor.obstacle_normal);
        if (gameMode == 2){
            g.setColor(new Color(Dragoner.obst_r,Dragoner.obst_g,Dragoner.obst_b));
        }

        if(current_stage == 1) {
            for (int i = 0; i < Stage.stage1_point.length; i++) {
                g.fillRoundRect((int) ((Stage.stage1_point[i].getX() - 1) * FindWayOut_Main.unit_size) + gap, (int) ((Stage.stage1_point[i].getY() - 1) * FindWayOut_Main.unit_size) + gap,
                        FindWayOut_Main.unit_size - (2 * gap), FindWayOut_Main.unit_size - (2 * gap), 3, 3);
            }
            g.setColor(UIColor.obstacle_fire);
            for (int i = 0; i < Obstacles.fireObs1_point.length; i++) {
                g.fillRoundRect((int) ((Obstacles.fireObs1_point[i].getX() - 1) * FindWayOut_Main.unit_size) + gap, (int) ((Obstacles.fireObs1_point[i].getY() - 1) * FindWayOut_Main.unit_size) + gap,
                        FindWayOut_Main.unit_size - (2 * gap), FindWayOut_Main.unit_size - (2 * gap), 3, 3);
            }
        }
        else if(current_stage == 2){
            for (int i = 0; i < Stage.stage2_point.length; i++) {
                g.fillRoundRect((int) ((Stage.stage2_point[i].getX() - 1) * FindWayOut_Main.unit_size) + gap, (int) ((Stage.stage2_point[i].getY() - 1) * FindWayOut_Main.unit_size) + gap,
                        FindWayOut_Main.unit_size - (2 * gap), FindWayOut_Main.unit_size - (2 * gap), 3, 3);
            }
            g.setColor(UIColor.obstacle_fire);
            for (int i = 0; i < Obstacles.fireObs2_point.length; i++) {
                g.fillRoundRect((int) ((Obstacles.fireObs2_point[i].getX() - 1) * FindWayOut_Main.unit_size) + gap, (int) ((Obstacles.fireObs2_point[i].getY() - 1) * FindWayOut_Main.unit_size) + gap,
                        FindWayOut_Main.unit_size - (2 * gap), FindWayOut_Main.unit_size - (2 * gap), 3, 3);
            }
        } else if(current_stage == 3) {
            for (int i = 0; i < Stage.stage3_point.length; i++) {
                g.fillRoundRect((int) ((Stage.stage3_point[i].getX() - 1) * FindWayOut_Main.unit_size) + gap, (int) ((Stage.stage3_point[i].getY() - 1) * FindWayOut_Main.unit_size) + gap,
                        FindWayOut_Main.unit_size - (2 * gap), FindWayOut_Main.unit_size - (2 * gap), 3, 3);
            }
            g.setColor(UIColor.obstacle_fire);
            for (int i = 0; i < Obstacles.fireObs3_point.length; i++) {
                g.fillRoundRect((int) ((Obstacles.fireObs3_point[i].getX() - 1) * FindWayOut_Main.unit_size) + gap, (int) ((Obstacles.fireObs3_point[i].getY() - 1) * FindWayOut_Main.unit_size) + gap,
                        FindWayOut_Main.unit_size - (2 * gap), FindWayOut_Main.unit_size - (2 * gap), 3, 3);
            }
        }
        if(CountDownTimer.off%2 == 1){
            g.setColor(Color.BLACK);
            if (gameMode == 2){
                g.setColor(new Color(Dragoner.char_r,Dragoner.char_g,Dragoner.char_b));
            }
            g.fillRect(0,0,400,400);
            g.setColor(UIColor.mid_body);
            if (gameMode == 2){
                g.setColor(new Color(Dragoner.tile_r,Dragoner.tile_g,Dragoner.tile_b));
            }
            for (int i=0;i<20;i++)
            {   //Generate rounded rectangle tiles
                for (int j=0;j<20;j++){
                    g.fillRoundRect((j*FindWayOut_Main.unit_size)+gap,(i*FindWayOut_Main.unit_size)+gap,
                            FindWayOut_Main.unit_size-(2*gap),FindWayOut_Main.unit_size-(2*gap),3,3);
                }
            }
        }
        g.setColor(new Color(UIColor.vary_r,UIColor.vary_g,UIColor.vary_b));
        if (gameMode == 2){
            g.setColor(new Color(Dragoner.obst_r,Dragoner.obst_g,Dragoner.obst_b));
        }
        g.fillOval((position_x*FindWayOut_Main.unit_size-(FindWayOut_Main.unit_size)/2-radius),
                (position_y*FindWayOut_Main.unit_size-(FindWayOut_Main.unit_size)/2-radius),2*radius,2*radius);
        g.setColor(Color.BLUE);
        if (gameMode == 2){
            g.setColor(new Color(Dragoner.obst_r,Dragoner.obst_g,Dragoner.obst_b));
        }
        g.fillRoundRect((int) ((20 - 1) * FindWayOut_Main.unit_size) + gap, (int) ((1 - 1) * FindWayOut_Main.unit_size) + gap,
                FindWayOut_Main.unit_size - (2 * gap), FindWayOut_Main.unit_size - (2 * gap), 3, 3);
    }

    public static boolean checkGetInDoor(int x, int y){
        if(x == door_x && y == door_y){
            return true;
        }
        return false;
    }

    public static void changeMap() {
        if(current_stage <3){
            current_stage +=1;
            position_x = initial_x;
            position_y = initial_y;
            onOffLight.stop();
            duration.stop();
            CountDownTimer.off = 0;
            canStartTimer = true;
            if (ScreenPanel.gameMode ==0){
                RightPanel.second += 15;
            }
            else if(ScreenPanel.gameMode ==1){
                RightPanel.second += 12 ;
            }
            else if(ScreenPanel.gameMode ==2){
                RightPanel.second += 10;
            }
            FindWayOut_Main.rightController.repaint();
            CenterPanel.screen.repaint();
        }
        else{
            System.out.println(3);
            setEndGameParameter();
            onOffLight.stop();
            duration.stop();
            canStartTimer = false;
            current_stage += 1;
            CountDownTimer.off = 0;
            CenterPanel.screen.repaint();

        }
    }

    protected void paintEndGame(Graphics g) {
        setBackground(Color.BLACK);
        g.setFont(Fonts.font_main);
        animation1.start();
        if (current_stage <=3){
            g.drawString("GAMEOVER",105,180);
            g.setFont(Fonts.font_main_small);
            if (roundBlink%2 == 0) {
                g.drawString("Press Space to Play Again", 75, 200 + 10);
            }
            else{
                g.setColor(Color.BLACK);
                g.fillRect(80,180,250,100);
            }

        }
        else
            {
            g.drawString("YOU WIN", 120, 180);
            g.setFont(Fonts.font_main_small);
                if (roundBlink%2 == 0) {
                    g.drawString("Press Space to Play Again", 75, 200 + 10);
                }
                else{
                    g.setColor(Color.BLACK);
                    g.fillRect(80,180,250,100);
                }
        }
    }

    protected void paintStart(Graphics g){
        setBackground(Color.YELLOW);
        g.setColor(new Color(UIColor.vary_r,UIColor.vary_g,UIColor.vary_b));
        g.fillOval(175,250,50,50);
        g.setFont(Fonts.font_main);
        g.setColor(UIColor.mid_body);
        g.drawString("START",140,170+10);
        g.setFont(Fonts.font_main_small);
        if (!CenterPanel.screen.modeSelected && roundNotClick <= 0) {
            System.out.println(1);
            g.setFont(Fonts.font_main_small);
            g.setColor(Color.YELLOW);
            g.fillRect(80,180,250,50);
            if (roundBlink%2 == 0){
                g.setColor(UIColor.mid_body);
                g.drawString("Please select game mode", 80, 200+10);
            }
            else{
                g.setColor(Color.YELLOW);
                g.fillRect(80,180,250,50);
            }

        }
        else {
            if (roundBlink % 2 == 0) {
                g.setColor(UIColor.mid_body);
                g.drawString("Press Space to Start", 95, 200 + 10);
            } else {
                g.setColor(Color.YELLOW);
                g.fillRect(80, 180, 250, 50);
            }
            if (!CenterPanel.screen.modeSelected && roundNotClick <= 0) {
                System.out.println(1);
                g.setFont(Fonts.font_main_small);
                g.setColor(Color.YELLOW);
                g.fillRect(80, 180, 250, 50);
                if (roundBlink % 2 == 0) {
                    g.setColor(UIColor.mid_body);
                    g.drawString("Please select game mode", 80, 200 + 10);
                } else {
                    g.setColor(Color.YELLOW);
                    g.fillRect(80, 180, 250, 50);
                }

            }
        }
    }

    public static boolean checkHitFire(int x, int y){
        whatReturnFire = true;
        if(ScreenPanel.current_stage == 1) {
            for (Point element : Obstacles.fireObs1_point) {
                if (element.getY() == y && x == element.getX()) {
                    hp -= 5*hpDecreasedMultiplier(gameMode);
                    whatReturnFire = false;

                }
            }
        }
        else if(ScreenPanel.current_stage == 2){
            for (Point element : Obstacles.fireObs2_point) {
                if (element.getY() == y  && x == element.getX()) {
                    hp -= 5*hpDecreasedMultiplier(gameMode);
                    whatReturnFire = false;
                }
            }
        }
        else if(ScreenPanel.current_stage == 3){
            for (Point element : Obstacles.fireObs3_point) {
                if (element.getY() == y && x == element.getX()) {
                    hp -= 5*hpDecreasedMultiplier(gameMode);
                    whatReturnFire = false;
                }
            }
        }
        if (hp<=0){
            setEndGameParameter();
            duration.stop();
            FindWayOut_Main.centerPanel.repaint();
        }
        FindWayOut_Main.centerPanel.repaint();
        return whatReturnFire;
    }

    static public int hpDecreasedMultiplier(int x){
        if(x == 0 || x == 1){
            return 1;
        }
        else{
            return 2;
        }
    }

    static public void resetParameter(){
        current_stage = 1;
        hp = 100;
        position_x = initial_x;
        position_y = initial_y;
        gameRunning = false;
        endGame = false;
        roundNotClick = 1;
        modeSelected = false;

        FindWayOut_Main.leftController.mode1.setSelected(false);
        FindWayOut_Main.leftController.mode2.setSelected(false);
        FindWayOut_Main.leftController.mode3.setSelected(false);
    }

    static public void setEndGameParameter(){
        endGame = true;
        gameRunning = false;
    }

    static public void setStartGameParameter(){
        endGame = false;
        gameRunning = true;
    }

}
