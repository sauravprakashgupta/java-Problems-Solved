import javafx.scene.paint.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.Color;

public class Gui_jList extends JFrame{

    private JList list;
    private static String[] colorNames = {"Black","Blue","White","Red"};
    private static Color[] colors = {Color.BLACK, Color.BLUE,Color.WHITE,Color.RED};

    public Gui_jList(){
        super("The title");
        setLayout(new FlowLayout());

        list = new JList(colorNames);
        list.setVisibleRowCount(2);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(new JScrollPane(list));

        list.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent event) {
                        getContentPane().setBackground(colors[list.getSelectedIndex()]);

                    }
                }
        );
    }
}
