package lab1.src;

import java.awt.*;

public class ErasedStrategy implements Strategy{


    @Override
    public void pressed(ScribbleCanvas canvas, Point p, Point pStart, Graphics onscreen, Graphics offscreen) {
        canvas.mouseButtonDown = true;
        canvas.x = p.x;
        canvas.y = p.y;
        offscreen = canvas.getOffScreenGraphics();
        offscreen.setColor(Color.white);
    }

    @Override
    public void released(ScribbleCanvas canvas, Point p, Point pStart, Graphics onscreen, Graphics offscreen) {
        canvas.mouseButtonDown = false;
        canvas.setPenColor(canvas.penColor);
    }

    @Override
    public void mouseDragged(ScribbleCanvas canvas, Point p, Point pStart, Graphics onscreen, Graphics offscreen) {
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
