
import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {

        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawingClass myObj = new DrawingClass();
        f.add(myObj);
        f.setSize(300,200);
        f.setVisible(true);
    }
}