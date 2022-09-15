// Using Jframe Class 
// Border Layout
import java.awt.*;
import javax.swing.*;

class Border{
    Border(){
        Frame fm = new JFrame();
        fm.setLayout(new BorderLayout(10,10));

        Label l = new Label("Label");  
        TextField tf = new TextField("Text");  
        Button b = new Button("Send");

        fm.add(l,BorderLayout.WEST); 
        fm.add(tf,BorderLayout.CENTER);  
        fm.add(b,BorderLayout.EAST);
        
        fm.setSize(300,300);
        fm.setVisible(true);
    }
}

public class no_3_3_b_c {
    public static void main(String[] args) {
        new Border();
    }
}
