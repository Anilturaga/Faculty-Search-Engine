//import Code.Sample;
//import Code.Trie;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.StringTokenizer;
import javax.swing.*;

public class test1 extends Frame implements ActionListener,KeyListener{
    private static final int x = 1000;
    private static final int y = 1000;
    static JButton b=new JButton();
    static JTextField tf=new JTextField();
    
    static Font font1 = new Font("SansSerif", Font.BOLD, 30);
    public test1(){
        
        b.addActionListener(this);
        tf.addKeyListener(this);;
    }
    public void paint(Graphics g) {  
        Graphics2D g2 = (Graphics2D)g;
        Font boldFont = new Font("Serif", Font.BOLD, 50);        
        g2.setFont(boldFont);
        Color c = new Color(0,188,212);
        setBackground(Color.BLACK); 
        g.setColor(c);   
        g.fillRect(0,0,x,y/4);  
        setForeground(c);
        g.setColor(Color.BLACK);
        g2.drawString("Map Search",x/3,y/5);       
    }  
    public void keyTyped(KeyEvent e) {
        String ans = new Trie().search(tf.getText().toLowerCase());
       if(ans.equals("0")){
            b.setText("Not found");
            b.setVisible(true);
       }else{
           b.setText(ans);
           b.setVisible(true);
       }
    }
    public void keyPressed(KeyEvent e) {
      
       
    }
    public void keyReleased(KeyEvent e) {
       
    }
    public void actionPerformed(ActionEvent e) {
        
       
       
    }  
    public static void main(String args[]){
        Sample s = new Sample();
        s.initialize();
        test1 f=new test1();  
        
        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                    //f.setVisible(false); 
                    
                    StringTokenizer st1 =new StringTokenizer(Trie.map.get(b.getText()), "-"); 
                    int count = 0;
                    int xa=0,ya=0;
               while (st1.hasMoreTokens()) {
                st1.nextToken();
                xa = Integer.parseInt(st1.nextToken());
                    ya = Integer.parseInt(st1.nextToken());
                    

                    }

                    new test(xa,ya);
                   
            }  
            });  
        
        tf.setFont(font1);
        b.setFont(font1);
        b.setBounds(x/3,y/2,x/3, y/9);  
        tf.setBounds(x/3,y/3,x/3,y/9);
        JButton add=new JButton("Add new loc");
        JTextField tf1=new JTextField();
        JTextField tf2=new JTextField();
        JButton submit=new JButton("Submit");
        tf1.setFont(font1);
        tf2.setFont(font1);
        add.setFont(font1);
        submit.setFont(font1);
        add.setBounds(x/3,2*y/3,x/3, y/9); 
        tf2.setBounds(x/3,y/2,x/3, y/9);  
        tf1.setBounds(x/3,y/3,x/3,y/9);
        submit.setBounds(x/3,2*y/3,x/3, y/9);
        add.setVisible(true);
        tf1.setVisible(false);
        tf2.setVisible(false);
        submit.setVisible(false);
        tf.setBackground(Color.WHITE);
        tf1.setBackground(Color.WHITE);
        tf2.setBackground(Color.WHITE);
        add.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                        b.setVisible(false);
                        tf.setVisible(false);
                        add.setVisible(false);
                        tf1.setVisible(true);
                        tf2.setVisible(true);
                        submit.setVisible(true);
                        f.repaint();

                    }  
                });  
        submit.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                tf1.setVisible(false);
                tf2.setVisible(false);
                
                b.setVisible(true);
                tf.setVisible(true);
                
                f.repaint();
                String names = new String(tf1.getText().toLowerCase());
                String values = new String(tf2.getText());
                s.input(names,values);
                submit.setVisible(false);
                add.setVisible(true);
        
                            }  
                        });          
        b.setVisible(false);
        f.add(tf1);
        f.add(tf2);
        f.add(add);
        f.add(submit);
        f.add(tf);
        f.add(b);  
        f.setSize(x,y);
        f.setLayout(null);
        f.addWindowListener( new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
                new home();
            }
        } );
        f.setVisible(true);  
    }
 
}
