import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class MouseEvents extends JFrame{
    private String details;
    private JLabel statusBar;

    public MouseEvents(){
        super("Title");

        statusBar = new JLabel("This is default");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClass());
    }

    private class MouseClass extends MouseAdapter{
        public void mouseClicked(MouseEvents event){
            details = String.format("You clicked %d ", event.getClickCount);

            if(event.isMetaDown())
                details += " with right mouse Button";
            else if(event.isAltDown())
                details +=" Scroll wheel - center mouse button";
            else
                details += " with left mouse button";

            statusBar.setText(details);

        }
    }
}
