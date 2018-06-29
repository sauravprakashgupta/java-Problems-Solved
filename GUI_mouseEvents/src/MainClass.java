import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        MouseEvGUI myObj = new MouseEvGUI();
        myObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myObj.setSize(300,200);
        myObj.setVisible(true);
    }
}