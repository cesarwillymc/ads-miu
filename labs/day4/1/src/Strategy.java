package lab1.src;

import java.awt.*;

public interface Strategy {
    void pressed(ScribbleCanvas canvas, Point p,Point pStart, Graphics onscreen,Graphics offscreen);
    void released(ScribbleCanvas canvas, Point p,Point pStart, Graphics onscreen,Graphics offscreen);
    void mouseDragged(ScribbleCanvas canvas, Point p,Point pStart, Graphics onscreen,Graphics offscreen);
}
