import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI_FlowLayout extends JFrame{
    private JButton lb;
    private JButton cb;
    private JButton rb;
    private FlowLayout layout;
    private Container container;

    public GUI_FlowLayout(){
        super("Title");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        //Left Stuffs
        lb = new JButton("Left");
        add(lb);
        lb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(container);
                    }
                }
        );


        //Center Stuffs
        cb = new JButton("Center");
        add(cb);
        cb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.CENTER);
                        layout.layoutContainer(container);
                    }
                }
        );

        //Right Stuffs
        rb = new JButton("Right");
        add(rb);
        rb.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.RIGHT);
                        layout.layoutContainer(container);
                    }
                }
        );

    }
}
