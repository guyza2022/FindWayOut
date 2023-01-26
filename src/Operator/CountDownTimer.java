package Operator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountDownTimer implements ActionListener {
    public static int off = 0;
    @Override
    public void actionPerformed(ActionEvent e) {

        off++;
    }
}
