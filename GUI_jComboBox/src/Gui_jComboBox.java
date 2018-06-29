import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui_jComboBox extends JFrame {
    private JComboBox box;
    private JLabel picture;

    private static String[] filename = {"b.png","x.png"};
    private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),
            new ImageIcon(getClass().getResource(filename[1]))};

    public Gui_jComboBox(){
        super("The Title");
        setLayout(new FlowLayout());

        box = new JComboBox(filename);
 /*box.addItemListener(
 new ItemListener(){
 public void itemStateChanged(ItemEvent event){
 if(event.getStateChange() == ItemEvent.SELECTED){
 picture.setIcon(pics[box.getSelectedIndex()]);
 }
 }
 }
 );*/
        for(Icon x : pics){
            box.addItemListener(new HandlerClass(x));
        }
        add(box);
        picture = new JLabel(pics[0]);
        add(picture);
    }

    private class HandlerClass implements ItemListener{
        private Icon pic;
        public HandlerClass(Icon p){
            pic = p;
        }

        public void itemStateChanged(ItemEvent event){
            if(event.getStateChange() == ItemEvent.SELECTED){
                picture.setIcon(pics[box.getSelectedIndex()]);
            }
            add(picture);
        }
    }
}