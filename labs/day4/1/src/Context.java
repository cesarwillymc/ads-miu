package lab1.src;

import java.awt.*;

public class Context {
    private Strategy strategy;

    public void doSomething(ActionPressed actionPressed, ScribbleCanvas canvas, Point p, Point pStart, Graphics onscreen, Graphics offscreen) {
        switch (actionPressed) {
            case DRAGGED: {
                strategy.mouseDragged(canvas, p, pStart, onscreen, offscreen);
                break;
            }
            case PRESSED : {
                strategy.pressed(canvas, p, pStart, onscreen, offscreen);
                break;
            }
            case RELEASE: {
                strategy.released(canvas, p, pStart, onscreen, offscreen);
                break;
            }

        }
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
