package part1.usingOwnLibrary1;



import part1.usingOwnLibrary1.Observer.Observable;
import part1.usingOwnLibrary1.Observer.Observer;

import java.awt.*;

public class TextFrame extends javax.swing.JFrame implements Observer {
    private Counter counter;
    public TextFrame(Observable observable) {
        this.counter = (Counter) observable;
        getContentPane().setLayout(null);
        setSize(227, 196);
        setVisible(false);
        getContentPane().add(JLabelCount);
        JLabelCount.setFont(new Font("Dialog", Font.BOLD, 36));
        JLabelCount.setBounds(48, 48, 170, 86);
        setTitle("observerInterface.Observer.TextFrame");
        update();
    }

    @Override
    public void update() {
        JLabelCount.setText(String.valueOf(counter.getCount()));
    }

    javax.swing.JLabel JLabelCount = new javax.swing.JLabel();


}