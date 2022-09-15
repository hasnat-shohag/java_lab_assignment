// Grid Layout 
import java.awt.*;
import javax.swing.*;

class GridLayoutImp{
    GridLayoutImp(){
        JFrame fm = new JFrame();
        fm.setTitle("Grid Layout");
        // GridLayout(row, columns, horizontal gap, vertical gap)
        fm.setLayout(new GridLayout(1,3,10,0));

        JLabel l = new JLabel("Label");  
        JTextField tf =new JTextField("Text");  
        JButton b = new JButton("Send");
        
        fm.add(l);fm.add(tf);fm.add(b);

        fm.setSize(300,300);
        fm.setVisible(true);
    }
}
public class no_3_a_d {
    public static void main(String[] args) {
        new GridLayoutImp();
    }
}
