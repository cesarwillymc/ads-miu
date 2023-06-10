package lab1.src;

import java.awt.*;
import java.awt.event.*;

public class ScribbleCanvasListener
        implements MouseListener, MouseMotionListener {


    protected Lab1 drawframe;
    protected ScribbleCanvas canvas;
    protected Point pStart;
    protected Graphics onscreen, offscreen;

    public ScribbleCanvasListener(ScribbleCanvas canvas, Lab1 drawframe) {
        this.canvas = canvas;
        this.drawframe = drawframe;
    }

    public void mousePressed(MouseEvent e) {
        Point p = e.getPoint();
        drawframe.currentTool.doSomething(ActionPressed.PRESSED, canvas, p, pStart, onscreen, offscreen);

    }

    public void mouseReleased(MouseEvent e) {
        drawframe.currentTool.doSomething(ActionPressed.RELEASE, canvas, e.getPoint(), pStart, onscreen, offscreen);
    }

    public void mouseDragged(MouseEvent e) {
        drawframe.currentTool.doSomething(ActionPressed.DRAGGED, canvas, e.getPoint(), pStart, onscreen, offscreen);
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }


}

