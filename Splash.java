package travel.management.system;

import javax.swing.*;
import java.awt.*;// Ensure correct import

public class Splash extends JFrame implements Runnable {
    // Extend JFrame correctly

    Splash() {
        //setSize(1200, 600);
        //setLocation(100, 100); 
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dest7.jpg"));
        Image i2=i1.getImage().getScaledInstance(1200, 600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel  image = new JLabel(i3);
        add(image);
        setVisible(true);
        Thread thread=new Thread(this);
        thread.start();
    }
    public void run()
    {
        try
        {
            Thread.sleep(5000);
            setVisible(false);
        }
        catch(Exception e)
        {
            
        }
    }

  public static void main(String[] args) {
   Splash frame= new Splash();
   int x=1;
   for(int i=1;i<=500;x+=7,i++){
       frame.setLocation(600-(x+i)/6, 400-(i/2));
       frame.setSize(x+i,i);
       try
       {
           Thread.sleep(1);
       }
       catch(Exception e){}
   }
}
}
