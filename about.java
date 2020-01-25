import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class about extends JFrame {
      JFrame frame;
      JButton back;
      JLabel about;
      JTextArea data;

    public about() {
        //construct components
        frame = new JFrame("About MEC page");

        back = new JButton("Go Back");
        about = new JLabel("About MEC");
        data = new JTextArea("Mahindra École Centrale (abbreviated MEC) is a private engineering institute located in Bahadurpally, near Hyderabad, Telangana. Dr. Yajulu Medury is an acclaimed academician and a seasoned professional with more than three decades of academic and administrative experience.");

        //adjust size and set layout
        setPreferredSize (new Dimension (681, 480));
        setLayout (null);

        //add components
        frame.add(back);
        frame.add(about);
        frame.add(data);
        data.setLineWrap(true);
        data.setEditable(false);
        data.setWrapStyleWord(true);

        //set component bounds (only needed by Absolute Positioning)
        back.setBounds (565, 10, 105, 55);
        about.setBounds (5, 45, 100, 25);
        data.setBounds (10, 90, 550, 335);

        back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            new home();}
        });

        //adjust size,layout and other functions
        frame.setPreferredSize(new Dimension (750, 450));
        frame.setLayout(null);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(247, 14, 227));
    }


    public static void main (String[] args) {

    }
}
