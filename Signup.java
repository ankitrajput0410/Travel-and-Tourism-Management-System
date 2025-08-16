package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener {
    JButton create,back;
    JTextField tfname,tfusername,tfPassword,tfanswer;
    Choice security;
    public Signup() {
        setBounds(350, 200, 900, 360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);  // Ensure null layout for absolute positioning

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133, 193, 233));
        p1.setBounds(0, 0, 500, 400);  // Set specific bounds (x, y, width, height)
        p1.setLayout(null);  // Null layout for the panel as well
        add(p1);
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(50,20,125,25);
        lblusername.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p1.add(lblusername);
        
        
        tfusername=new JTextField();
        tfusername.setBounds(190,20,180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50,60,125,25);
        lblname.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p1.add(lblname);
        
        
        tfname=new JTextField();
        tfname.setBounds(190,60,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(50,100,125,25);
        lblpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p1.add(lblpassword);
        
        
       tfPassword=new JTextField();
       tfPassword.setBounds(190,100,180,25);
       tfPassword.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfPassword);
        
        
        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setBounds(50,140,125,25);
        lblsecurity.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p1.add(lblsecurity);
        
        
        security=new Choice();
        security.add("Fav Character From THE BOYS");
        security.add("FAV MARVEL MOVIE"); 
        security.add("Fav MARVEL HERO");
        security.add("Fav DC HERO");
        security.setBounds(190,140,180,25);
        p1.add(security);
        
        
        
        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setBounds(50,180,125,25);
        lblanswer.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p1.add(lblanswer);
        
        
       tfanswer=new JTextField();
       tfanswer.setBounds(190,180,180,25);
       tfanswer.setBorder(BorderFactory.createEmptyBorder());
       p1.add(tfanswer);
        
         
       
        create=new JButton("Create");
        create.setBounds(80, 250, 100, 30);
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133,193,233));
        create.addActionListener(this);
        
        p1.add(create);
        
        
        back=new JButton("Back");
        back.setBounds(250, 250, 100, 30);
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.addActionListener(this);
        
        p1.add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 50, 250, 250);
        add(image);

        setVisible(true);
      
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==create)
        {
          String username=tfusername.getText();
          String name=tfname.getText();
          String password=tfPassword.getText();
          String question=security.getSelectedItem();
          String answer=tfanswer.getText();
          
          
          String query="insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
          try{
               Conn c=new Conn();
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Account Created Sucessfully");
               setVisible(false);
               new Login();
          }catch(Exception e)
          {
              e.printStackTrace();
          }
          
        }
        else if(ae.getSource()==back)
        {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
