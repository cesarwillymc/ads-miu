package part1.usignOwnLibrary2;



import part1.usignOwnLibrary2.Observer.Observer;

import java.awt.*;

public class TextFrame extends javax.swing.JFrame implements Observer<Integer> {

    public TextFrame() {
        getContentPane().setLayout(null);
        setSize(227, 196);
        setVisible(false);
        getContentPane().add(JLabelCount);
        JLabelCount.setFont(new Font("Dialog", Font.BOLD, 36));
        JLabelCount.setBounds(48, 48, 170, 86);
        setTitle("observerInterface.Observer.TextFrame");
        update(0);

    }

    @Override
    public void update(Integer data) {
        JLabelCount.setText(String.valueOf(data));
    }

    javax.swing.JLabel JLabelCount = new javax.swing.JLabel();


}