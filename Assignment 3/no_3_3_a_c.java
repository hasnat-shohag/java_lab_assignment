// Using Jframe Class 
// Border Layout
import java.awt.*;
import javax.swing.*;

class Border{
    Border(){
        JFrame fm = new JFrame();
        fm.setLayout(new BorderLayout(20,15));

        JLabel l = new JLabel("Label");  
        JTextField tf =new JTextField("Text");  
        JButton b = new JButton("Send");

        fm.add(l,BorderLayout.WEST); 
        fm.add(tf,BorderLayout.CENTER);  
        fm.add(b,BorderLayout.EAST);
        
        fm.setSize(300,300);
        fm.setVisible(true);
    }
}

public class no_3_3_a_c {
    public static void main(String[] args) {
        new Border();
    }
}
