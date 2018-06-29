import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Gui_Jbutton extends JFrame{
    private JButton regular;
    private JButton custom;

    public Gui_Jbutton(){
        super("The Title");
        setLayout(new FlowLayout());

        regular = new JButton("Regular Button");
        add(regular);

        Icon b = new ImageIcon(getClass().getResource("b.png"));
        Icon x = new ImageIcon(getClass().getResource("x.png"));

        custom = new JButton("Custom Button",b);
        custom.setRolloverIcon(x);
        add(custom);

        HandlerClass handlerObj = new HandlerClass();
        regular.addActionListener(handlerObj);
        custom.addActionListener(handlerObj);

    }

    private class HandlerClass implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, String.format("%s",event.getActionCommand()));
        }
    }
}
