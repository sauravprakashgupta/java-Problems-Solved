import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;

public class Gui_radioButtons extends JFrame{

    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bif;

    private JRadioButton pb;
    private JRadioButton bb;
    private JRadioButton ib;
    private JRadioButton bib;

    private ButtonGroup radioGroup;

    public Gui_radioButtons(){
        super("The Title");
        setLayout(new FlowLayout());

        tf = new JTextField("This is the Sentence", 25);
        add(tf);

        pb = new JRadioButton("PLAIN", true);
        bb = new JRadioButton("BOLD", true);
        ib = new JRadioButton("ITALICS", true);
        bib = new JRadioButton("BOLD and ITLAICS", true);

        add(pb);
        add(bb);
        add(ib);
        add(bib);

        radioGroup = new ButtonGroup();
        radioGroup.add(pb);
        radioGroup.add(bb);
        radioGroup.add(ib);
        radioGroup.add(bib);

        pf = new Font("Serif", Font.PLAIN, 14);
        bf = new Font("Serif", Font.BOLD, 14);
        itf = new Font("Serif", Font.ITALIC, 14);
        bif = new Font("Serif", Font.ITALIC + Font.BOLD, 14);

        tf.setFont(pf);

        //wait for event to happen, pass in font object to constructor
        pb.addItemListener(new HandlerClass(pf));
        bb.addItemListener(new HandlerClass(bf));
        ib.addItemListener(new HandlerClass(itf));
        bib.addItemListener(new HandlerClass(bif));


    }

    private  class HandlerClass implements ItemListener{
        private Font fontObj;

        //the font object get variable font
        public HandlerClass(Font f){
            fontObj = f;
        }

        //sets the font to the font object that was passed in
        @Override
        public void itemStateChanged(ItemEvent e) {
            tf.setFont(fontObj);

        }
    }

}
