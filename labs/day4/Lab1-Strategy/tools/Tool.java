package lab1.tools;

import java.awt.*;

public interface Tool {
    void mousePressed(ScribbleCanvas canvas, Point p);
    void mouseReleased(Point p);
    void mouseDragged(Point p);
}
