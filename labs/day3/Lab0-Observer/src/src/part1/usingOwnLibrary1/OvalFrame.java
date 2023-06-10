package part1.usingOwnLibrary1;

import part1.usingOwnLibrary1.Observer.Observable;
import part1.usingOwnLibrary1.Observer.Observer;

import java.awt.*;

public class OvalFrame extends javax.swing.JFrame implements Observer {
    private int count;
    public Counter observable;

    public OvalFrame(Observable observable) {
        this.observable = (Counter) observable;
        getContentPane().setLayout(null);
        setSize(300, 200);
        setTitle("observerInterface.Observer.OvalFrame");
        update();
    }

    @Override
    public void update() {
        count = observable.getCount();
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