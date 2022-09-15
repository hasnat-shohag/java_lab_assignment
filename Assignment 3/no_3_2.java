import java.awt.*;
import javax.swing.*;

public class no_3_2
{
  public static void main ( String[] args )
  {

    JFrame master = new JFrame("Click to Close Everything");
    JFrame temp = new JFrame("Click to Close Just This");

    temp.setVisible(true);
    temp.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE  );
    temp.setSize( 400, 300 );

    master.setVisible(true);
    master.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    master.setSize( 500, 400 );
    

  }
}