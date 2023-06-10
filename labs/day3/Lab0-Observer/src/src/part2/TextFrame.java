package part2;

import javax.swing.*;
import java.awt.*;

public class TextFrame extends JFrame implements Observer<Integer> {
    public TextFrame() {
        //{{INIT_CONTROLS
        getContentPane().setLayout(null);
        setSize(227, 196);
        setVisible(false);
        getContentPane().add(JLabelCount);
        JLabelCount.setFont(new Font("Dialog", Font.BOLD, 36));
        JLabelCount.setBounds(48, 48, 170, 86);
        setTitle("TextFrame");
        update(0);
        //}}

        //{{REGISTER_LISTENERS
        SymWindow aSymWindow = new SymWindow();
        this.addWindowListener(aSymWindow);
        //}}

        //{{INIT_MENUS
        //}}

    }

    @Override
    public void update(Integer data) {
        JLabelCount.setText(String.valueOf(data));
    }


    class SymWindow extends java.awt.event.WindowAdapter {
        public void windowClosing(java.awt.event.WindowEvent event) {
            Object object = event.getSource();
            if (object == TextFrame.this)
                TextFrame_WindowClosing(event);
        }
    }

    void TextFrame_WindowClosing(java.awt.event.WindowEvent event) {
        dispose();         // dispose of the Frame.
    }

    //{{DECLARE_CONTROLS
    JLabel JLabelCount = new JLabel();
    //}}

    //{{DECLARE_MENUS
    //}}

}