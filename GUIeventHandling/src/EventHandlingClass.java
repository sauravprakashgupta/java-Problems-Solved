import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class EventHandlingClass extends JFrame{
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    public EventHandlingClass(){
        super("The title");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        item2 = new JTextField("Enter text Here");
        item3 = new JTextField("UnEditable",20);
        item3.setEditable(false);

        add(item1);
        add(item2);
        add(item3);

        passwordField = new JPasswordField("myPassword");
        add(passwordField);

        MyHandlerClass handlerObj = new MyHandlerClass();
        item1.addActionListener(handlerObj);
        item2.addActionListener(handlerObj);
        item3.addActionListener(handlerObj);
        passwordField.addActionListener(handlerObj);

    }


    private class MyHandlerClass implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String myString = "";
            if(event.getSource()==item1){
                myString=String.format("field 1 is %s", event.getActionCommand());
            }
            else if(event.getSource()==item2){
                myString=String.format("field 2 is %s", event.getActionCommand());
            }
            else if(event.getSource()==item3){
                myString=String.format("field 3 is %s", event.getActionCommand());
            }
            else if(event.getSource() == passwordField){
                myString = String.format("password field is :  %s",event.getActionCommand());
            }

        }

    }
}
