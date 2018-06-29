import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GuiCheckBox extends JFrame{
    private JTextField tf;
    private JCheckBox boldBox;
    private JCheckBox italicBox;

    public GuiCheckBox(){
        super("title");
        setLayout(new FlowLayout());
        tf = new JTextField("This is a Sentence", 20);
        tf.setFont(new Font("Serif",Font.PLAIN,14));
        add(tf);

        boldBox = new JCheckBox("BOLD");
        italicBox = new JCheckBox("ITALICS");

        add(boldBox);
        add(italicBox);

        HandlerClass handlerObj = new HandlerClass();
        boldBox.addItemListener((ItemListener) handlerObj);
        italicBox.addItemListener((ItemListener) handlerObj);
    }

    private class HandlerClass implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent event) {
            Font font = null;

            if(boldBox.isSelected() && italicBox.isSelected()){
                font = new Font("Serif",Font.BOLD + Font.ITALIC, 14);
            }
            else if(boldBox.isSelected()){
                font = new Font("Serif",Font.BOLD, 14);
            }
            else if(italicBox.isSelected()){
                font = new Font("Serif", Font.ITALIC, 14);
            }
            else{
                font = new Font("Serif",Font.PLAIN,14);
            }
            tf.setFont(font);
        }
    }
}
