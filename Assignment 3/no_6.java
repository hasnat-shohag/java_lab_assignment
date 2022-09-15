import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class IncrementDecrement extends JFrame{
    int cnt = 0;
    IncrementDecrement(){
        setTitle("My Frame");
        JButton b = new JButton("OK");
        JTextField tf = new JTextField("Hello Java Click 0");

        b.setBounds(40, 50, 60, 50);
        tf.setBounds(110, 50, 250, 50);

        add(b);add(tf);
        setLayout(null);
        setSize(400,300);
        setVisible(true);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                cnt++;
                tf.setText("Hello Java Click "+String.valueOf(cnt));
            }
        });
    }
}
public class no_6 {
    public static void main(String[] args) {
        new IncrementDecrement();
    }
}
