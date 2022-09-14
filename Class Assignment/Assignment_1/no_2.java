// Write a GUI program to perform the Clear and Undo functions of a Text Field (Use separate button for each operations and Text Fields for inputting text message).
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;


class tfClearUndo extends JFrame{
    String temp;
    tfClearUndo(){
        setTitle("From Clear and Undo");
        JTextField tf = new JTextField();
        JButton b1 = new JButton("Clear");
        JButton b2 = new JButton("Undo");
        
        tf.setBounds(50, 50, 200, 50);
        b1.setBounds(60, 120, 80, 50);
        b2.setBounds(160, 120, 80, 50);

        add(tf);add(b1);add(b2);

        setLayout(null);
        setSize(300,300);
        setVisible(true);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                temp = tf.getText();
                tf.setText("");
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText(temp);
            }
        });        
    }
}
public class no_2 {
    public static void main(String[] args) {
        new tfClearUndo();
    }
}
