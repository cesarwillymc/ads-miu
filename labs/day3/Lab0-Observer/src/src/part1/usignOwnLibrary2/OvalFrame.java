package part1.usignOwnLibrary2;

import part1.usignOwnLibrary2.Observer.Observer;

import java.awt.*;

public class OvalFrame extends javax.swing.JFrame implements Observer<Integer> {
    private int count;

    public OvalFrame() {
        getContentPane().setLayout(null);
        setSize(300, 200);
        setTitle("observerInterface.Observer.OvalFrame");
        update(0);

    }


    @Override
    public void update(Integer data) {
        count = data;
        repaint();
    }


    @Override
    public void paint(Graphics display) {
        super.paint(display); // Call the superclass paint method

        Dimension dims = getSize();
        display.clearRect(0, 0, dims.width, dims.height);

        int x = 50;
        int y = 30;

        // Magnify value by 9 to get a bigger visual effect
        int height = count * 9;
        int width = count * 9;

        display.setColor(Color.red);

        display.fillOval(x, y, Math.abs(width), Math.abs(height));
    }

}