package part1.usingOwnLibrary1;

import part1.usingOwnLibrary1.Observer.Observable;
import part1.usingOwnLibrary1.Observer.Observer;

import java.awt.*;

public class RectFrame extends javax.swing.JFrame implements Observer {
    private int count;
    private Counter counter;
    public RectFrame(Observable observable) {
        this.counter = (Counter) observable;
        getContentPane().setLayout(null);
        setSize(300, 200);
        setTitle("RectangleFrame");
        update();

    }

    @Override
    public void update() {
        count = counter.getCount();
        repaint();
    }

	@Override
    public void paint(Graphics display) {
        super.paint(display); // Call the superclass paint method

        Dimension sizes = getSize();
        display.clearRect(0, 0, sizes.width, sizes.height);

        int x = 50;
        int y = 30;

        // Magnify value by 9 to get a bigger visual effect
        int height = count * 9;
        int width = count * 9;

        display.setColor(Color.red);

        display.fillRect(x, y, Math.abs(width), Math.abs(height));
    }

}