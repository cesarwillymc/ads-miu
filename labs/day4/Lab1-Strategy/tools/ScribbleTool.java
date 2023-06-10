package lab1.tools;

import java.awt.*;

public class ScribbleTool implements Tool {
    ScribbleCanvas canvas;

    @Override
    public void mousePressed(ScribbleCanvas c, Point p) {
        this.canvas = c;
        canvas.mouseButtonDown = true;
        canvas.x = p.x;
        canvas.y = p.y;
    }

    @Override
    public void mouseReleased(Point p) {
        canvas.mouseButtonDown = false;
    }

    @Override
    public void mouseDragged(Point p) {
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
