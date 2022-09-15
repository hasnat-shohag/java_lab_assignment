// Grid Layout 
import java.awt.*;

class GridLayoutImp{
    GridLayoutImp(){
        Frame fm = new Frame();
        fm.setTitle("Grid Layout");
        // GridLayout(row, columns, horizontal gap, vertical gap)
        fm.setLayout(new GridLayout(1,3,10,0));

        Label l = new Label("Label");  
        TextField tf = new TextField("Text");  
        Button b = new Button("Send");
        
        fm.add(l);fm.add(tf);fm.add(b);

        fm.setSize(300,300);
        fm.setVisible(true);
    }
}
public class no_3_b_d {
    public static void main(String[] args) {
        new GridLayoutImp();
    }
}
