import java.awt.*;
import javax.swing.*;

class menuBar extends JFrame {

    JMenuBar mb;
    JMenu mb1, mb2;
    JMenuItem i1, i2;

    menuBar() {

        setTitle("Meunbar");

        mb = new JMenuBar();
        mb1 = new JMenu("FILE");
        mb2 = new JMenu("Help");

        i1 = new JMenuItem("Open");
        i2 = new JMenuItem("Save as");

        mb1.add(i1);
        mb1.add(i2);
        mb.add(mb1);
        mb.add(mb2);

        setJMenuBar(mb);
        setLayout(null);
        setSize(300, 300);
        setVisible(true);
    }
}

public class no_4 {
    public static void main(String[] args) {
        new menuBar();
    }
}
