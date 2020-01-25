import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class tt {
 public static void main(String args[]) {
     
  JFrame frame = new JFrame();
  ImageIcon icon = new ImageIcon("tt.png");
  Image img = icon.getImage();
  Image scal = img.getScaledInstance(1000,1000,Image.SCALE_SMOOTH);
  icon = new ImageIcon(scal);
  JLabel label = new JLabel(icon);
  frame.add(label);
  frame.setDefaultCloseOperation
         (JFrame.DISPOSE_ON_CLOSE);
  frame.pack();
  frame.setVisible(true);
 }
}