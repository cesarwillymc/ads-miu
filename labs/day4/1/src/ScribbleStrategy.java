package lab1.src;

import java.awt.*;

public class ScribbleStrategy implements Strategy {

    @Override
    public void pressed(ScribbleCanvas canvas, Point p, Point pStart, Graphics onscreen, Graphics offscreen) {
        canvas.mouseButtonDown = true;
        canvas.x = p.x;
        canvas.y = p.y;
    }

    @Override
    public void released(ScribbleCanvas canvas, Point p, Point pStart, Graphics onscreen, Graphics offscreen) {
        canvas.mouseButtonDown = false;

    }

    @Override
    public void mouseDragged(ScribbleCanvas canvas, Point p, Point pStart, Graphics onscreen, Graphics offscreen) {
        if (canvas.mouseButtonDown) {
            canvas.getOffScreenGraphics().drawLine(canvas.x, canvas.y, p.x, p.y);
            int xs = Math.min(canvas.x, p.x);
            int ys = Math.min(canvas.y, p.y);
            int dx = Math.abs(p.x - canvas.x) + 1;
            int dy = Math.abs(p.y - canvas.y) + 1;
            canvas.repaint(xs, ys, dx, dy);
            canvas.x = p.x;
            canvas.y = p.y;
        }
    }
}
