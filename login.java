import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

//Shows the login page
public class login extends MouseAdapter
{
    JFrame frame;
    JLabel id, pass;
    JTextField tid;
    JPasswordField tpass;
    JButton log, reg;

    public login()
    {
        frame=new JFrame("Login Page");
        Font f = new Font("Noteworthy",Font.BOLD,15);

        //components and bounds for id,Password,login,Sign up
        id = new JLabel("Username:");
        id.setBounds(115, 50, 150, 50);
        id.setFont(f);

        pass = new JLabel("Password:");
        pass.setBounds(115, 140, 150, 50);
        pass.setFont(f);

        tid = new JTextField("Enter Username");
        tid.setBounds(285, 50, 150, 50);
        tid.setFont(f);
        tid.addMouseListener(new MouseAdapter(){
         public void mouseClicked(MouseEvent e) {
            tid.setText("");
         }

      });

        tpass = new JPasswordField("Enter Password");
        tpass.setBounds(285, 140, 150, 50);
        tpass.setFont(f);
        tpass.addMouseListener(new MouseAdapter(){
         public void mouseClicked(MouseEvent e) {
            tpass.setText("");
         }

      });

        log = new JButton("Login");
        log.setBounds(160, 220, 100, 25);
        log.setFont(f);

        reg = new JButton("Sign Up");
        reg.setBounds(275, 220, 100, 25);
        reg.setFont(f);

        //add components
        frame.add(id);
        frame.add(pass);
        frame.add(tid);
        frame.add(tpass);
        frame.add(log);
        frame.add(reg);

        //adjust size,layout and other functions
        frame.setPreferredSize(new Dimension (750, 450));
        frame.setLayout(null);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(14, 247, 227));

        log.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            if(tid.getText().equals("user")  && tpass.getText().equals("pass")){
                frame.dispose();
            new home();
            }
            else{
                /*JOptionPane.showMessageDialog(frame, "Invalid Username or Password","Inane Warning",JOptionPane.ERROR_MESSAGE);*/                        // frame.dispose();       new home();
                tid.setText("Account not found");
                tpass.setText("");
            }



            }
        });

        reg.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            new signup();}
        });
    }

      public static void main(String[] args) {
        new login();
    }
}
