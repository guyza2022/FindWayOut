package Main;
import Panels.*;
import Util.UIColor;
import javax.swing.*;
import java.awt.*;
import Operator.*;

public class FindWayOut_Main extends JFrame {
    public static final int ratio_size_unit = 500;
    public static final int screen_width = 400;
    public static final int screen_height = 400;
    public static final int num_row_column_tiles = 20;
    public static final int unit_size = screen_width/num_row_column_tiles;
    MainLayout main_layout = new MainLayout();
    public static CenterPanel centerPanel = new CenterPanel();
    public static LeftPanel leftController = new LeftPanel();
    public static RightPanel rightController = new RightPanel();
    Dimension screen_size = new Dimension(screen_width,screen_height);


    FindWayOut_Main(){
        super("Find Way Out!");
        setLayout(new MainLayout());
        setBackground(UIColor.body);
        setSize(2*ratio_size_unit+16,ratio_size_unit);
        setPreferredSize(new Dimension(2*ratio_size_unit,ratio_size_unit));
        setMaximumSize(new Dimension(2*ratio_size_unit,ratio_size_unit));
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

        add(leftController, BorderLayout.WEST);
        add(centerPanel,BorderLayout.CENTER);
        add(rightController,BorderLayout.EAST);















    }


}
