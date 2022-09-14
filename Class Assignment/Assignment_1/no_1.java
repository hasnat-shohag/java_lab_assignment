// Write a GUI program to perform the following operations (Use separate button for each operations and text fields for inputs and output):
// (a) addition
// (b) subtraction
// (c) multiplication
// (d) division

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

class calculator extends JFrame {
    calculator() {
        setTitle("Basic Calculator");
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JButton b1 = new JButton("+");
        JButton b2 = new JButton("-");
        JButton b3 = new JButton("×");
        JButton b4 = new JButton("÷");
        JLabel l1 = new JLabel("");
        JLabel l2 = new JLabel("");
        JLabel l3 = new JLabel("");
        JLabel l4 = new JLabel("");

        tf1.setBounds(150, 50, 150, 40);
        tf2.setBounds(150, 100, 150, 40);

        l1.setBounds(150, 160, 200, 30);
        l2.setBounds(150, 200, 200, 30);
        l3.setBounds(150, 240, 200, 30);
        l4.setBounds(150, 280, 200, 30);

        b1.setBounds(100, 340, 60, 40);
        b2.setBounds(170, 340, 60, 40);
        b3.setBounds(240, 340, 60, 40);
        b4.setBounds(310, 340, 60, 40);

        add(tf1);
        add(tf2);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setLayout(null);
        setSize(400, 450);
        setVisible(true);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                int c = a + b;
                l1.setText("Sum is = " + String.valueOf(c));
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                int c = a - b;
                l2.setText("Substract is = " + String.valueOf(c));
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                int c = a * b;
                l3.setText("Multiplication is = " + String.valueOf(c));
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                try {
                    int c = a / b;
                    l4.setText("Divison is = " + String.valueOf(c));
                } catch (ArithmeticException p) {
                    l4.setText(String.valueOf(p));
                }
            }
        });
    }
}

public class no_1 {
    public static void main(String[] args) {
        new calculator();
    }
}