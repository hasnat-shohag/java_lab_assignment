import java.awt.*;
import javax.swing.*;

class RadioCheckComboBox extends JFrame {
    RadioCheckComboBox() {
        setTitle("Radio/Combo Example");

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.setLayout(null);
        panel2.setLayout(null);

        panel1.setBounds(0, 0, 150, 300);
        panel2.setBounds(200, 0, 150, 300);

        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel2.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel l1 = new JLabel("Radio Buttons");
        JLabel l2 = new JLabel("Check Boxes");
        
        JRadioButton rb1 = new JRadioButton("4 slices");
        JRadioButton rb2 = new JRadioButton("8 slices");

        JCheckBox cb1 = new JCheckBox("Anchovies");
        JCheckBox cb2 = new JCheckBox("Garlic");

        
        
        l1.setBounds(5, 5, 120, 30);
        l2.setBounds(5, 5, 120, 30);

        rb1.setBounds(5, 100, 100, 30);
        rb2.setBounds(5, 150, 100, 30);

        cb1.setBounds(5, 100, 100, 30);
        cb2.setBounds(5, 150, 100, 30);

        String s[] = { "Bird", "Cat", "Dog", "Rabbit", "Cow" };
        JComboBox cbx = new JComboBox(s);
        cbx.setBounds(5, 200, 100, 30);

        add(panel1);
        add(panel2);

        ButtonGroup bg = new ButtonGroup();
        panel1.add(l1);
        bg.add(rb1);
        bg.add(rb2);
        panel1.add(rb1);
        panel1.add(rb2);

        panel2.add(l2);
        panel2.add(cb1);
        panel2.add(cb2);
        panel2.add(cbx);

        setSize(370, 350);
        setLayout(null);
        setVisible(true);
    }
}

public class no_5 {
    public static void main(String[] args) {
        new RadioCheckComboBox();
    }
}
