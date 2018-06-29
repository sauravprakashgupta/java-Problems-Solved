//for Radio Button tutorial

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioGUI extends JFrame {
    private JTextField tf;
    private Font[] font = new Font[4] ;
    private JRadioButton[] rb = new JRadioButton[4];
    private ButtonGroup group;
 /*font[0] = pf;
 font[1] = bf;
 font[2] = itf;
 font[3] = bif;
 rb[0] = pb;
 pb[1] = bb;
 pb[2] = ib;
 pb[3] = bib;*/

    public RadioGUI(){
        super("The title");
        setLayout(new FlowLayout());

        tf=new JTextField("Hello World!!!", 25);
        add(tf);
        System.out.println("\n");

        rb[0] = new JRadioButton("PLAIN", true);
        rb[1] = new JRadioButton("BOLD", false);
        rb[2] = new JRadioButton("ITALICS", false);
        rb[3] = new JRadioButton("BOLD n ITALICS", false);
        group = new ButtonGroup();
        for(JRadioButton x: rb){
            add(x);
            group.add(x);
        }
        font[0] = new Font("Serif",Font.PLAIN,14);
        font[1] = new Font("Serif",Font.BOLD,14);
        font[2] = new Font("Serif",Font.ITALIC,14);
        font[3] = new Font("Serif",Font.BOLD + Font.ITALIC,14);

        tf.setFont(font[0]);

        rb[0].addItemListener(new HandlerClass(font[0]));
        rb[1].addItemListener(new HandlerClass(font[1]));
        rb[2].addItemListener(new HandlerClass(font[2]));
        rb[3].addItemListener(new HandlerClass(font[3]));

 /*for(int i = 0 ; i<=4; i++){
 rb[i].addActionListener(new handler(Font[i]));
 }*/
    }
    private class HandlerClass implements ItemListener{
        private Font font;
        // the font item get
        public HandlerClass(Font f){
            font = f;
        }
        public void itemStateChanged(ItemEvent event){
            tf.setFont(font);
        }
    }
}