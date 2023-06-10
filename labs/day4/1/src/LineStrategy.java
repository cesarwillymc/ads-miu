package lab1.src;

import java.awt.*;

public class LineStrategy implements Strategy{

    @Override
    public void pressed(ScribbleCanvas canvas, Point p, Point pStart, Graphics onscreen, Graphics offscreen) {
        canvas.mouseButtonDown = true;

        pStart.x = canvas.x = p.x;
        pStart.y = canvas.y = p.y;
        onscreen = canvas.getGraphics();
        onscreen.setXORMode(Color.darkGray);
        onscreen.setColor(Color.lightGray);
        onscreen.drawLine(pStart.x, pStart.y, pStart.x, pStart.y);
    }

    @Override
    public void released(ScribbleCanvas canvas, Point p, Point pStart, Graphics onscreen, Graphics offscreen) {
        canvas.mouseButtonDown = false;
        onscreen.setPaintMode();
        offscreen = canvas.getOffScreenGraphics();
        offscreen.drawLine(pStart.x, pStart.y, p.x, p.y);
        canvas.repaint();
    }

    @Override
    public void mouseDragged(ScribbleCanvas canvas, Point p, Point pStart, Graphics onscreen, Graphics offscreen) {
        if (canvas.mouseButtonDown) {
            onscreen.drawLine(pStart.x, pStart.y, canvas.x, canvas.y);
            onscreen.drawLine(pStart.x, pStart.y, p.x, p.y);
        }
        canvas.x = p.x;
        canvas.y = p.y;
    }
}
