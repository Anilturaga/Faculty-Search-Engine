import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class home extends JFrame {
    JFrame frame;
    JButton about, acc, maps, courses, logout;
    public home() {
        //construct components
        frame=new JFrame("Home Page");

        about = new JButton ("About college");
        acc = new JButton ("Account Details");
        maps = new JButton ("Maps");
        courses = new JButton ("Courses");
        logout = new JButton ("Log out");

        //adjust size and set layout
        setPreferredSize (new Dimension (750, 450));
        setLayout (null);

        //add components
        frame.add(about);
        frame.add(acc);
        frame.add(maps);
        frame.add(courses);
        frame.add(logout);

        //set component bounds
        about.setBounds (150, 100, 150, 50);
        acc.setBounds (315, 100, 150, 50);
        maps.setBounds (150, 160, 150, 50);
        courses.setBounds (315, 160, 150, 50);
        logout.setBounds (560, 20, 105, 55);

        about.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            new about();}
        });

        acc.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            new home();}
        });

        maps.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            String[] args = new String[] {"123"};
            test1.main(args);}
        });

        courses.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            new courses();}
        });

        logout.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            new welcome();}
        });

        //adjust size,layout and other functions
        frame.setPreferredSize(new Dimension (750, 450));
        frame.setLayout(null);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(227, 247, 14));
    }


    public static void main (String[] args) {
        new home();
    }
}
