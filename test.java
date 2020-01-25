import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;
import javax.swing.JFrame;

public class test extends JPanel implements MouseListener, MouseMotionListener {
    private static final int x = 1000;
    private static final int y = 1000;
    static int xtest;
    static int ytest;
    static int xl,yl;
    static String str = new String();
    static JLabel ans=new JLabel(".");
    
    

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(this.xtest, this.ytest, 150, 150);

    }

    public void mousePressed(MouseEvent e) {
       
    }

    public void mouseReleased(MouseEvent e) {
       
    }

    public void mouseClicked(MouseEvent e) {
       
    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
       
    }

    // override MouseMotionListener two abstract methods
    public void mouseMoved(MouseEvent e) {
        xl = e.getX();
        yl = e.getY();
        str = "Mouse Moved";
        ans.setText("x-"+xl+"y-"+yl+"str-"+str);
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        xl = e.getX();
        yl = e.getY();
        str = "Mouse dragged";
        ans.setText("x-"+xl+"y-"+yl+"str-"+str);
        repaint();
    }

    test(int x, int y) {
        addMouseListener((MouseListener) this);
        addMouseMotionListener((MouseMotionListener) this);
        JFrame f = new JFrame();
        Container c=f.getContentPane();
        c.add(this);
        setSize(this.x,this.y);
        
        setBackground(new Color(255,255,255,0));
        ImageIcon oic = new ImageIcon("C:/Users/anilkumar/Desktop/java/1.png");
        Image img = oic.getImage();
        Image tempimg = img.getScaledInstance(1000,1000,Image.SCALE_SMOOTH);
        oic = new ImageIcon(tempimg);
        JLabel label = new JLabel("",oic,JLabel.CENTER);
        label.setBounds(0,0,this.x,this.y);
        ans.setBounds(50,50,100,100);
        c.add(ans);
       f.add(label);
        f.setSize(this.x,this.y);
        xtest = x;
        ytest = y;
        repaint();
        f.setLayout(null);
        setVisible(true);
        f.setVisible(true);
    }

}