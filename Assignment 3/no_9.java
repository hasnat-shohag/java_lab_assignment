import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class tempConverter extends JFrame{
    tempConverter(){
        setTitle("Fahrenheit to Celsius Converter");
        JLabel l1 = new JLabel("Enter Fahrenheit temperature:");
        JLabel l2 = new JLabel("Temperature in Celsius:");

        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();

        JButton b = new JButton("Convert");

        l1.setBounds(20, 10, 250, 40);
        l2.setBounds(30, 80, 180, 40);

        tf1.setBounds(280, 10, 80, 40);
        tf2.setBounds(220, 80, 80, 40);

        b.setBounds(150,150,100,40);

        add(l1);add(l2);add(tf1);
        add(tf2);add(b);

        setSize(400,300);
        setLayout(null);
        setVisible(true);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Float a = Float.parseFloat(tf1.getText());
                Float b = ((5*a)-160)/9;
                tf2.setText(String.valueOf(b));
            }
        });
    }   
}

public class no_9 {
    public static void main(String[] args) {
        new tempConverter();
    }
}
