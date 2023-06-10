package lab1.src;

import java.awt.*;

public class OvalStrategy implements Strategy{

    @Override
    public void pressed(ScribbleCanvas canvas, Point p, Point pStart, Graphics onscreen, Graphics offscreen) {
        canvas.mouseButtonDown = true;
        pStart.x = canvas.x = p.x;
        pStart.y = canvas.y = p.y;
        onscreen = canvas.getGraphics();
        onscreen.setXORMode(Color.darkGray);
        onscreen.setColor(Color.lightGray);

        onscreen.drawOval(pStart.x, pStart.y, 1, 1);
    }

    @Override
    public void released(ScribbleCanvas canvas, Point p, Point pStart, Graphics onscreen, Graphics offscreen) {
        canvas.mouseButtonDown = false;
        onscreen.setPaintMode();
        offscreen = canvas.getOffScreenGraphics();
        offscreen.drawOval(pStart.x, pStart.y, p.x-pStart.x+1, p.y-pStart.y+1);
        canvas.repaint();
    }

    @Override
    public void mouseDragged(ScribbleCanvas canvas, Point p, Point pStart, Graphics onscreen, Graphics offscreen) {
        if (canvas.mouseButtonDown) {
            onscreen.drawOval(pStart.x, pStart.y, canvas.x - pStart.x + 1, canvas.y - pStart.y + 1);
            onscreen.drawOval(pStart.x, pStart.y, p.x - pStart.x + 1, p.y - pStart.y + 1);
        }
        canvas.x = p.x;
        canvas.y = p.y;
    }
}
