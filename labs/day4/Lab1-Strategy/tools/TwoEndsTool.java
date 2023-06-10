package lab1.tools;

import java.awt.*;

public class TwoEndsTool implements Tool{
    private TwoEndShape shape;
    private int xStart, yStart;
    private Graphics onscreen, offscreen;
    private ScribbleCanvas canvas;
    @Override
    public void mousePressed(ScribbleCanvas c, Point p) {
        this.canvas =c;
        canvas.mouseButtonDown = true;
        xStart = canvas.x = p.x;
        yStart = canvas.y = p.y;
        onscreen = canvas.getGraphics();
        onscreen.setXORMode(Color.darkGray);
        onscreen.setColor(Color.lightGray);
        shape.drawShape(onscreen, xStart, yStart, 1, 1);
    }

    @Override
    public void mouseReleased(Point p) {
        canvas.mouseButtonDown = false;
        onscreen.setPaintMode();
        offscreen = canvas.getOffScreenGraphics();
        shape.drawShape(offscreen,xStart, yStart, p.x, p.y);
        canvas.repaint();
    }

    @Override
    public void mouseDragged(Point p) {
        if (canvas.mouseButtonDown) {
            shape.drawShape(onscreen,xStart, yStart, canvas.x, canvas.y);
            shape.drawShape(onscreen,xStart, yStart, p.x, p.y);
        }
        canvas.x = p.x;
        canvas.y = p.y;
    }

    public void setShape(TwoEndShape shape) {
        this.shape = shape;
    }
}
