package lab1.tools;

import java.awt.*;

public interface TwoEndShape {
    void drawShape(Graphics onscreen, int x1, int y1, int x2, int y2);
    void drawOutline(Graphics onscreen, int xStart, int yStart, int x, int y);
}
