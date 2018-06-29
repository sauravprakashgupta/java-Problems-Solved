import oracle.jrockit.jfr.JFR;

import javax.swing.JFrame;

class MainClass{
    public static void main(String[] args) {
        EventHandlingClass ehcObject = new EventHandlingClass();
        ehcObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ehcObject.setSize(366,110);
        ehcObject.setVisible(true);
    }
}