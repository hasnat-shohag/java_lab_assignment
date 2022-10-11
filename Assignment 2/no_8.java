import java.awt.*;
import javax.swing.*;

class GUI8 extends JFrame {

    JMenuBar menuBar;
    JMenu menu1, menu2;
    JMenuItem i1, i2, i3, i4, i5, i6;

    GUI8() {
        menuBar = new JMenuBar();

        menu1 = new JMenu("Indian States");
        menu2 = new JMenu("Indian Cities");

        i1 = new JMenuItem("Himachal Pradesh");
        i2 = new JMenuItem("Rajasthan");
        i3 = new JMenuItem("West Bengal");
        i4 = new JMenuItem("Andra Pradesh");
        i5 = new JMenuItem("Tamilnadu");
        i6 = new JMenuItem("Karnataka");

        menu1.add(i1);
        menu1.add(i2);
        menu1.add(i3);
        menu1.add(new JSeparator()); // separator
        menu1.add(i4);
        menu1.add(i5);
        menu1.add(i6);

        menuBar.add(menu1);
        menuBar.add(menu2);

        setJMenuBar(menuBar);

        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setTitle("Simple Menu Program");
    }
}

public class no_8{
	public static void main(String[] args) {
		new GUI8();
	}
}
