import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class courses extends JFrame implements ItemListener,ActionListener{
    JFrame frame;
    JComboBox courses;
    JButton back, syl, tts;
    JLabel name,teach;
    String[] coursesItems = {"Theory of Computation", "Design and Analysis of Algorithms", "Digital Logic Design and Computer Architecture", "Object Oriented Programming", "Numerical Methods"};
    String getItem = new String("daa");
    public courses() {
        //construct preComponents
        frame=new JFrame("Courses Page");

        //construct components
        courses = new JComboBox (coursesItems);
        back = new JButton ("Go Back");
        syl = new JButton ("Syllabus");
        tts = new JButton ("Time Table");
        name = new JLabel ("You have picked : x");
        teach = new JLabel ("This course is taught by y.");

        //add components
        frame.add(courses);
        frame.add(back);
        frame.add(syl);
        frame.add(tts);
        frame.add(name);
        frame.add(teach);

        //set component bounds
        courses.setBounds(200, 30, 300, 45);
        back.setBounds(565, 10, 105, 55);
        syl.setBounds(160, 285, 140, 60);
        tts.setBounds(365, 285, 140, 60);
        name.setBounds(200, 75, 600, 45);
        teach.setBounds(200,135,600,45);

        courses.addItemListener(this);

        back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            new home();
        }
        });
        tts.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String[] args = new String[] {"123"};
                new tt();
                tt.main(args);}
            });
        syl.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                getItem = (String)courses.getSelectedItem();
                String[] args = new String[] {"123"};
            

      if(getItem.equals(coursesItems[0])){
          new toc();
        toc.main(args);}
      else if(getItem.equals(coursesItems[1])){
        new daa();
        daa.main(args);}
      else if(getItem.equals(coursesItems[2])){
        new dld();dld.main(args);}
      else if(getItem.equals(coursesItems[3])){
        new oop();oop.main(args);}
      else if(getItem.equals(coursesItems[4])){
        new num();num.main(args);
          }
            }
            });

        //adjust size,layout and other functions
        frame.setPreferredSize(new Dimension (750, 450));
        frame.setLayout(null);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(227, 14, 247));
    }

    public void itemStateChanged(ItemEvent e){
      getItem = (String)courses.getSelectedItem();

      if(getItem.equals(coursesItems[0])){
          name.setText("You have picked : Theory of Computation");
          teach.setText("This course is taught by Ravi Kishore sir.");}
      else if(getItem.equals(coursesItems[1])){
          name.setText("You have picked : Design and Analysis of Algorithms ");
          teach.setText("This course is taught by Ramalingaswamy sir.");}
      else if(getItem.equals(coursesItems[2])){
          name.setText("You have picked : Digital Logic Design and Computer Architecture");
          teach.setText("This course is taught by Ramamurthy sir.");}
      else if(getItem.equals(coursesItems[3])){
          name.setText("You have picked : Object Oriented Programming");
          teach.setText("This course is taught by Prafulla ma'am.");}
      else if(getItem.equals(coursesItems[4])){
          name.setText("You have picked : Numerical Methods");
          teach.setText("This course is taught by Sanjuktha ma'am.");}
      }


    public static void main (String[] args) {

    }

    
    public void actionPerformed(ActionEvent e) {

    }
}
