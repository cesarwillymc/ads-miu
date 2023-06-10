package part2;

import javax.swing.*;
import java.awt.*;

public class CommonView extends JFrame {
    public CommonView(Counter counter) {
        TextFrame textf = new TextFrame();
        textf.setVisible(true);
        textf.setBounds(250, 0, 300, 200);
        RectFrame rectf = new RectFrame();
        rectf.setVisible(true);
        rectf.setBounds(250, 200, 300, 200);
        OvalFrame ovalf = new OvalFrame();
        ovalf.setVisible(true);
        ovalf.setBounds(250, 400, 300, 200);
        counter.attach(textf);
        counter.attach(rectf);
        counter.attach(ovalf);
    }

}
