import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameClass extends JFrame{
    private JLabel item1;
    public JFrameClass(){
        super("The Title BAar");
        setLayout(new FlowLayout());

        item1 = new JLabel("This is a Sentence");
        item1.setToolTipText("This is gonna show up on hover");
        add(item1);

    }
}