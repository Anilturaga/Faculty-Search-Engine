import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//shows the welcome page
public class welcome extends JFrame{
    JFrame frame;
    JLabel welc, sub;
    JButton enter;

    public welcome(){

        //create components
        frame=new JFrame("Welcome Page");

        welc = new JLabel ("Welcome to University Search Engine (USE)!");
        welc.setFont(new Font("Noteworthy",Font.BOLD,20));

        enter = new JButton ("Enter page.");
        enter.setFont(new Font("Serif",Font.ITALIC,15));

        sub = new JLabel ("Made for your Use.");
        sub.setFont(new Font("Monaco",Font.ITALIC,15));

        //add components
        frame.add(welc);
        frame.add(enter);
        frame.add(sub);

        //set component bounds
        welc.setBounds(175, 40, 500, 250);
        enter.setBounds(305, 220, 120, 25);
        sub.setBounds(280, 270, 200, 25);


        //adjust size,layout and other functions
        frame.setPreferredSize(new Dimension (750, 450));
        frame.setLayout(null);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(227, 247, 14));

        enter.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            new login();
           }
        });

    }

    public static void main (String[] args){
      new welcome();
    }
}
