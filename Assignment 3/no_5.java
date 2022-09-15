import java.awt.*;
import javax.swing.*;

class RadioCheckComboBox extends JFrame {
    RadioCheckComboBox() {
        setTitle("Radio/Combo Example");

        JRadioButton rb1 = new JRadioButton("4 slices");
        JRadioButton rb2 = new JRadioButton("8 slices");

        JCheckBox cb1 = new JCheckBox("Anchovies");
        JCheckBox cb2 = new JCheckBox("Garlic");
        
        rb1.setBounds(5, 50, 100, 30);
        rb2.setBounds(5, 100, 100, 30);

        cb1.setBounds(150, 50, 100,30);
        cb2.setBounds(150, 100, 100,30);

        String s[] = {"Bird", "Cat", "Dog","Rabbit","Cow"};
        JComboBox cbx = new JComboBox(s);
        cbx.setBounds(150, 150, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        add(rb1); add(rb2);
        add(cb1);add(cb2);
        add(cbx);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
}

public class no_5 {
    public static void main(String[] args) {
        new RadioCheckComboBox();
    }
}
