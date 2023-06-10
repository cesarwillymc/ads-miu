package part1.usingLibrary;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class TextFrame extends JFrame implements Observer {
    public TextFrame() {

        getContentPane().setLayout(null);
        setSize(227, 196);
        setVisible(false);
        getContentPane().add(JLabelCount);
        JLabelCount.setFont(new Font("Dialog", Font.BOLD, 36));
        JLabelCount.setBounds(48, 48, 170, 86);
        setTitle("TextFrame");
        update(null, 0);
    }

    @Override
    public void update(Observable o, Object arg) {
        JLabelCount.setText(String.valueOf(arg));
    }

    JLabel JLabelCount = new JLabel();

}