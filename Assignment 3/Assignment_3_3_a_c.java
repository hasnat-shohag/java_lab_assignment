// Using Jframe Class 
// Border Layout
import java.awt.*;
import javax.swing.*;

class Border{
    Border(){
        JFrame fm = new JFrame();
        fm.setLayout(new BorderLayout(20,15));

        JLabel l = new JLabel("Label");  
        fm.add(l,BorderLayout.WEST); 
        JTextField tf =new JTextField("Text");  
        fm.add(tf,BorderLayout.CENTER);  
        JButton b = new JButton("Click Me");
        fm.add(b,BorderLayout.EAST);
        // JButton x = new JButton("X");
        // JButton y = new JButton("Y");
        // fm.add(x,BorderLayout.NORTH);
        // fm.add(y,BorderLayout.SOUTH);
        fm.setSize(300,300);
        fm.setVisible(true);
    }
}

public class Assignment_3_3_a_c {
    public static void main(String[] args) {
        new Border();
    }
}
