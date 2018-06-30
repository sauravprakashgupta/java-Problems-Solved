import javax.swing.*;
import java.awt.*;

public class MainClass {
    public static void main(String[] args) {
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Shapes s = new Shapes();
        s.setBackground(Color.WHITE);
        f.add(s);
        f.setSize(500,400);
        f.setVisible(true);
    }
}
