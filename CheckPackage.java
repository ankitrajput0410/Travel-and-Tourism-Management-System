package travel.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class CheckPackage extends JFrame {
    CheckPackage()
    {
        setBounds(450,200,900,600);
        
        
        String package1[]={"Gold Package","6Days And 7 Nights","Airport Assistence","Hald Day City Tour","daily buffet","Soft Drinks","Full day 3","english Guide","Summer Speical","Book now","RS 12000","package1.jpg"};
        String package2[]={"Silver Package","5 Days And 4 Nights","Toll Free","Meet and greet at airport","Welcome drinks","Night Safari","cruise","good","Monsoon Special","Book Now","Rs 10000","package2.jpg"};
        String package3[]={"Bronze Package","6 Days And 5 Nights","Return Airfare","Free clubbing","Riding Horse","Daily buffet","BBQ Dinner","Bye","Winter Special","Book Now","Rs 8000","package3.jpg"};
        
        
        JTabbedPane tab=new JTabbedPane();
        JPanel p1=createPackage(package1);
        tab.addTab("Package 1",null,p1);
        JPanel p2=createPackage(package2);
        tab.addTab("Package 2",null,p2);
        JPanel p3=createPackage(package3);
        tab.addTab("Package 3",null,p3);
        
        add(tab);
        
        
        
        
        setVisible(true);
                
    }
    
    
    public JPanel createPackage(String p[])
    {
         JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);
        
        JLabel l1 = new JLabel(p[0]);
        l1.setBounds(50,5,300,30);
        l1.setFont(new Font("Tahoma",Font.BOLD,30));
        l1.setForeground(Color.yellow);
        p1.add(l1);
        
        
         JLabel l2 = new JLabel(p[1]);
        l2.setBounds(30,60,300,30);
        l2.setFont(new Font("Tahoma",Font.BOLD,20));
        l2.setForeground(Color.red);
        p1.add(l2);
        
        
        
         JLabel l3 = new JLabel(p[2]);
        l3.setBounds(30,110,300,30);
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        l3.setForeground(Color.blue);
        p1.add(l3);
        
        
        JLabel l4 = new JLabel(p[3]);
        l4.setBounds(30,160,300,30);
        l4.setFont(new Font("Tahoma",Font.BOLD,20));
        l4.setForeground(Color.red);
        p1.add(l4);
        
        
        JLabel l5 = new JLabel(p[4]);
        l5.setBounds(30,210,300,30);
        l5.setFont(new Font("Tahoma",Font.BOLD,20));
        l5.setForeground(Color.blue);
        p1.add(l5);
        
        
        
        JLabel l6 = new JLabel(p[5]);
        l6.setBounds(30,260,300,30);
        l6.setFont(new Font("Tahoma",Font.BOLD,20));
        l6.setForeground(Color.red);
        p1.add(l6);
        
        
        
        JLabel l7 = new JLabel(p[6]);
        l7.setBounds(30,310,300,30);
        l7.setFont(new Font("Tahoma",Font.BOLD,20));
        l7.setForeground(Color.blue);
        p1.add(l7);
        
        
        JLabel l8 = new JLabel(p[7]);
        l8.setBounds(30,360,300,30);
        l8.setFont(new Font("Tahoma",Font.BOLD,20));
        l8.setForeground(Color.red);
        p1.add(l8);
        
        
        JLabel l9 = new JLabel(p[8]);
        l9.setBounds(60,430,300,30);
        l9.setFont(new Font("Tahoma",Font.BOLD,25));
        l9.setForeground(Color.black);
        p1.add(l9);
        
        
        
        
        JLabel l10= new JLabel(p[9]);
        l10.setBounds(80,480,300,30);
        l10.setFont(new Font("Tahoma",Font.BOLD,25));
        l10.setForeground(Color.black);
        p1.add(l10);
        
        
        
        JLabel l11= new JLabel(p[10]);
        l11.setBounds(500,480,300,30);
        l11.setFont(new Font("Tahoma",Font.BOLD,25));
        l11.setForeground(Color.black);
        p1.add(l11);
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+ p[11]));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 500, 300);
        p1.add(image);
        
        
        return p1;
    }
            
    
    
    public static void main(String arg[])
    {
        new CheckPackage();
    }
            
}
