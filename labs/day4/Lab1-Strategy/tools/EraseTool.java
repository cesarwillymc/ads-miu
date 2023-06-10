package lab1.tools;

import java.awt.*;

public class EraseTool implements Tool{
    ScribbleCanvas canvas;
    Graphics offscreen;
    @Override
    public void mousePressed(ScribbleCanvas canvas, Point p) {
        this.canvas = canvas;
        canvas.mouseButtonDown = true;
        canvas.x = p.x;
        canvas.y = p.y;
        offscreen = canvas.getOffScreenGraphics();
        offscreen.setColor(Color.white);
    }

    @Override
    public void mouseReleased(Point p) {
        canvas.mouseButtonDown = false;
        canvas.setPenColor(canvas.penColor);
    }

    @Override
    public void mouseDragged(Point p) {
        if (canvas.mouseButtonDown) {
            int xs, ys, dx, dy;
            xs = Math.min(canvas.x, p.x) - 2;
            ys = Math.min(canvas.y, p.y) - 2;
            dx = Math.abs(p.x - canvas.x) +  6;
            dy = Math.abs(p.y - canvas.y) +  6;
            offscreen.fillRect(xs, ys, dx, dy);
            canvas.repaint(xs, ys, dx, dy);
            canvas.x = p.x;
            canvas.y = p.y;
        }
    }
}
