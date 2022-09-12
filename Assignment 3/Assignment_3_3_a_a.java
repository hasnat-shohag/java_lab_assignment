// Using Jframe Class 
// Default Layout
import javax.swing.*;

public class Assignment_3_3_a_a {
    public static void main(String[] args) {
        JFrame fm = new JFrame();
        JLabel l=new JLabel("Label");  
        l.setBounds(100,100, 40,50);
        fm.add(l);    
        JTextField tf =new JTextField("Text");  
        tf.setBounds(145,100,150,50);   
        fm.add(tf);  
        JButton b = new JButton("Click Me");
        b.setBounds(300,100,100,50);
        fm.add(b);
        fm.setSize(600,600);
        fm.setLayout(null);
        fm.setVisible(true);
    
    }
}
