package lab1.tools;

import java.awt.*;

public class RectShape implements TwoEndShape {


    @Override
    public void drawShape(Graphics onscreen, int x1, int y1, int x2, int y2) {
        onscreen.drawRect(x1,y1,x2-x1+1,y2-y1+1);
    }

    @Override
    public void drawOutline(Graphics onscreen, int xStart, int yStart, int x, int y) {

    }
}
