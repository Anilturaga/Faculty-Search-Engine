import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class signup extends JFrame {
    JFrame frame;
    JLabel name, email, id, pass,repass;
    JButton done;
    JTextField tname, temail, tid, tpass, trepass;


    public signup() {

        //construct components
        frame = new JFrame("Sign up page");

        name = new JLabel ("Enter your name:");
        email = new JLabel ("Enter your email:");
        id = new JLabel ("Enter your roll no:");
        pass = new JLabel ("Enter the password you want:");
        repass = new JLabel ("Re-enter the password:");

        done = new JButton ("Done");

        tname = new JTextField (2);
        temail = new JTextField (2);
        tid = new JTextField (2);
        tpass = new JTextField (2);
        trepass = new JTextField (2);

        //add components
        frame.add(name);
        frame.add(email);
        frame.add(id);
        frame.add(pass);
        frame.add(repass);
        frame.add(done);
        frame.add(tname);
        frame.add(temail);
        frame.add(tid);
        frame.add(tpass);
        frame.add(trepass);

        //set component bounds
        name.setBounds(125, 30, 190, 25);
        email.setBounds(125, 70, 190, 25);
        id.setBounds(125, 110, 190, 25);
        pass.setBounds(125, 150, 190, 25);
        repass.setBounds(125, 190, 190, 25);
        done.setBounds(255, 235, 100, 25);
        tname.setBounds(360, 30, 190, 25);
        temail.setBounds(360, 70, 190, 25);
        tid.setBounds(360, 110, 190, 25);
        tpass.setBounds(360, 150, 190, 25);
        trepass.setBounds(360, 190, 190, 25);

        done.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            new login();}
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

    }
}
