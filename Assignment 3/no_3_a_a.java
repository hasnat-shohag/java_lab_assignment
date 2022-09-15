// Using Jframe Class 
// Default Layout
import javax.swing.*;

public class no_3_a_a {
    public static void main(String[] args) {
        JFrame fm = new JFrame();

        // setBounds(x axis,y axis, widht, height)
        JLabel l=new JLabel("Label");  
        l.setBounds(100,100, 40,50);

        JTextField tf =new JTextField("Text");  
        tf.setBounds(145,100,150,50);

        JButton b = new JButton("Send");
        b.setBounds(300,100,100,50);

        fm.add(l);    
        fm.add(tf);  
        fm.add(b);
        fm.setSize(600,600);
        fm.setLayout(null);
        fm.setVisible(true);
    
    }
}
