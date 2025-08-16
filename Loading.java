package travel.management.system;
import javax.swing.*;
import java.awt.*;
        
public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    public void run()
    {
        try
        {
            for(int i=1;i<=101;i++)
            {
                int max=bar.getMaximum();//100
                int value=bar.getValue();
                if(value<max)
                {
                    bar.setValue(bar.getValue()+1);
                }
                else
                {
                    setVisible(false);
                    //
                    new Dashboard(username);
                }
                Thread.sleep(30);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    Loading(String username)
    {
        this.username=username;
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Travel and Tourism Aplication");
        text.setBounds(50,20,600,40);
        text.setFont(new Font("Railway",Font.BOLD,35));
        text.setForeground(Color.BLUE);
        add(text);
        
        
        bar =new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        
        JLabel loading = new JLabel("Loading...");
        loading.setBounds(200,140,130,30);
        loading.setFont(new Font("Railway",Font.BOLD,16));
        loading.setForeground(Color.BLUE);
        add(loading);
        
        
        JLabel lblusername = new JLabel("Welcome " + username);
        lblusername.setBounds(20,310,400,40);
        lblusername.setFont(new Font("Railway",Font.BOLD,16));
        lblusername.setForeground(Color.RED);
        add(lblusername);
        
        
        t=new Thread(this);
        t.start();
        setVisible(true);
    }
    
    public static void main(String arg[])
    {
        new Loading("");
    }
}
