package part2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A basic JFC 1.1 based application.
 */
public class Lab0 extends JFrame {
    private final Counter counter;

    public Lab0() {
        counter = new Counter();
        setTitle("Counting Application: Observer.");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);
        setSize(256, 148);
        setVisible(false);
        JButtonIncrease.setText("+");
        getContentPane().add(JButtonIncrease);
        JButtonIncrease.setBounds(24, 60, 88, 30);
        JButtonDecrease.setText("-");
        getContentPane().add(JButtonDecrease);
        JButtonDecrease.setBounds(148, 60, 88, 30);

        new CommonView(counter);

        SymWindow aSymWindow = new SymWindow();
        this.addWindowListener(aSymWindow);
        SymAction aSymAction = new SymAction();
        JButtonIncrease.addActionListener(aSymAction);
        JButtonDecrease.addActionListener(aSymAction);
    }

    static public void main(String args[]) {
        try {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            }

            //Create a new instance of our application's frame, and make it visible.
            (new Lab0()).setVisible(true);
        } catch (Throwable t) {
            //Ensure the application exits with an error condition.
            System.exit(1);
        }
    }

    JButton JButtonIncrease = new JButton();
    JButton JButtonDecrease = new JButton();

    void exitApplication() {
        try {
            this.setVisible(false);    // hide the Frame
            this.dispose();            // free the system resources
            System.exit(0);            // close the application
        } catch (Exception e) {
        }
    }

    class SymWindow extends WindowAdapter {
        public void windowClosing(WindowEvent event) {
            Object object = event.getSource();
            if (object == Lab0.this)
                JFrameCounter_windowClosing(event);
        }
    }

    void JFrameCounter_windowClosing(WindowEvent event) {
        JFrameCounter_windowClosing_Interaction1(event);
    }

    void JFrameCounter_windowClosing_Interaction1(WindowEvent event) {
        try {
            this.exitApplication();
        } catch (Exception e) {
        }
    }

    class SymAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Object object = event.getSource();
            if (object == JButtonIncrease)
                JButtonIncrease_actionPerformed(event);
            else if (object == JButtonDecrease)
                JButtonDecrease_actionPerformed(event);
        }
    }

    void JButtonIncrease_actionPerformed(ActionEvent event) {
        counter.increment();
    }

    void JButtonDecrease_actionPerformed(ActionEvent event) {
        counter.decrement();

    }
}
