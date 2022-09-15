// Flow Layout 
import java.awt.*;

class FlowLayoutImp{
    FlowLayoutImp(){
        Frame fm = new Frame();
        fm.setTitle("FlowLayout Design");
        
        //Setting up Flow Layout
        fm.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        Label l = new Label("Label");  
        fm.add(l);    
        
        TextField tf = new TextField("Text");  
        fm.add(tf); 

        Button b = new Button("Send");
        fm.add(b);

        fm.setSize(400,400);
        fm.setVisible(true);
    }
}
public class no_3_b_b{
    public static void main(String args[]){
       new FlowLayoutImp();
    }
}