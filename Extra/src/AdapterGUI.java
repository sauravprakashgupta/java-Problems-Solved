import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdapterGUI extends JFrame{
    private String details;
    private JLabel statusbar;

    public AdapterGUI(){
        super("The Title");
        statusbar = new JLabel("This is a default : ");
        add(statusbar,BorderLayout.SOUTH);
        addMouseListener(new Mouseclass());
    }

    private class Mouseclass extends MouseAdapter{
        public void mouseClicked(MouseEvent event){
            details = String.format("You Clicked %d number of times", event.getClickCount());

            if(event.isMetaDown()){
                details += " you are using RIGHT click";
            }
            else if(event.isAltDown()){
                details += " you are scrolling";
            }
            else{
                details += " you are using LEFT clkick";
            }
            statusbar.setText(details);
        }
    }
}