import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MulSelectGUI extends JFrame {

    private JList leftlist;
    private JList rightlist;
    private JButton movebutton;
    private static String[] foods = {"red","blue","green","yellow","magenta","purple","pink","black","white","gre","maroon","orange"};

    public MulSelectGUI(){
        super("The Title is here");
        setLayout(new FlowLayout());
        leftlist = new JList(foods);
        leftlist.setVisibleRowCount(7);
        leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(leftlist));

        movebutton = new JButton("MOVE -->");
        movebutton.addActionListener(
                new ActionListener(){
                    @SuppressWarnings("deprecation")
                    public void actionPerformed(ActionEvent event){
                        rightlist.setListData(leftlist.getSelectedValues());
                    }
                }
        );
        add(movebutton);

        rightlist = new JList();
        rightlist.setVisibleRowCount(7);
        rightlist.setFixedCellWidth(100);
        rightlist.setFixedCellHeight(15);
        rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        add(new JScrollPane(rightlist));

    }

}
