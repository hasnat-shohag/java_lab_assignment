// Using Jframe Class 
// Default Layout
import java.awt.*;

public class no_3_b_a {
    public static void main(String[] args) {
        Frame fm = new Frame();
        fm.setTitle("Default Layout");

        Label l=new Label("Label");  
        // setBounds(x axis,y axis, widht, height)
        l.setBounds(100,100, 40,50);
        fm.add(l);    

        TextField tf =new TextField("Text");  
        tf.setBounds(145,100,150,50);   
        fm.add(tf);  

        Button b = new Button("Send");
        b.setBounds(300,100,100,50);
        fm.add(b);

        fm.setSize(600,600);
        fm.setLayout(null);
        fm.setVisible(true);
    }
}
