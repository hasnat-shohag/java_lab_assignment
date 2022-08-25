// Frame Creating

import java.awt.*;
import javax.swing.*;

class  Myclass{
    public void creating_a_page(){
        JFrame fm = new JFrame("MY First GUI Frame");
        fm.setSize(300,300);
        fm.setVisible(true);
    }
}

class Assignment_3_1{
    public static void main(String[] args) {
        Myclass myObs = new Myclass();
        myObs.creating_a_page();
    }
}