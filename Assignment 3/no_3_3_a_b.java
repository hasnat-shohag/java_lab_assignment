// Flow Layout 
import java.awt.*;
import javax.swing.*;
class FlowLayoutImp{
    FlowLayoutImp(){
        JFrame fm = new JFrame();
        fm.setTitle("FlowLayout Design");
        
        //Setting up Flow Layout
        fm.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        JLabel l = new JLabel("Label");  
        fm.add(l);    
        
        JTextField tf =new JTextField("Text");  
        fm.add(tf); 

        JButton b = new JButton("Send");
        fm.add(b);

        fm.setSize(400,400);
        fm.setVisible(true);
    }
}
public class no_3_3_a_b{
    public static void main(String args[]){
       new FlowLayoutImp();
    }
}