package lab1.tools;

import java.awt.*;

public class LineShape implements TwoEndShape {

    @Override
    public void drawShape(Graphics onscreen, int x1, int y1, int x2, int y2) {
        onscreen.drawLine(x1,y1,x2,y2);
    }

    @Override
    public void drawOutline(Graphics onscreen, int xStart, int yStart, int x, int y) {

    }
}
