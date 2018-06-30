import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class DrawingClass extends JPanel{
    public void paintComponents(Graphics g){
        super.paintComponents(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.fillRect(25,25,100,30);

        g.setColor(new Color(190,81,215));
        g.fillRect(25,65,100,30);

        g.setColor(Color.RED);
        g.drawString("This is a coloured sentence",25,120);

    }
}
