package part1.usingLibrary;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class RectFrame extends JFrame implements Observer {
    private int count;

    public RectFrame() {

        getContentPane().setLayout(null);
        setSize(300, 200);
        setTitle("RectangleFrame");
        update(null, 0);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Integer) {
            System.out.println("From rectangle "+arg);
            count = (int) arg;
            repaint();
        }
    }

    @Override
    public void paint(Graphics display) {
        super.paint(display); // Call the superclass paint method

        int x = 50;
        int y = 30;

        // Magnify value by 9 to get a bigger visual effect
        int height = count * 9;
        int width = count * 9;

        display.setColor(Color.red);
        display.fillRect(x, y, Math.abs(width), Math.abs(height));
    }
}