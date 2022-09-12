import javax.swing.*;

class JframeExtent extends JFrame{
    JframeExtent(){
        setSize(300,300);
        setTitle("My First GUI Frame");
        // setVisible(true);
    }
}

public class Assignment_3_1_c {
    public static void main(String[] args) {
        JframeExtent myFrame = new JframeExtent();
        myFrame.setVisible(true);
    }
}
