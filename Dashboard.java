package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Dashboard extends JFrame implements ActionListener{
    String username;
    JButton addPersonalDetails,viewPersonalDetails;
    JButton updatePersonalDetails;
     JButton checkpackages;
       JButton bookpackage;
       JButton viewpackage;
       JButton viewhotels;
       JButton destination;
       JButton bookhotel;
       JButton viewbookedhotel;
       JButton payment;
        JButton calculator;
        JButton notepad;
         JButton about;
         JButton deletePersonalDetails;
    Dashboard(String username)
    {
        this.username=username;
        //setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5, 0, 70, 70);
        p1.add(image);
        
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        heading.setForeground(Color.WHITE);
        p1.add(heading);
                
        

        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        
        addPersonalDetails=new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        
        updatePersonalDetails=new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        
        viewPersonalDetails=new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,30));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        
        deletePersonalDetails=new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        
        
        checkpackages=new JButton("Check Packages");
        checkpackages.setBounds(0, 200, 300, 50);
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setBackground(new Color(0,0,102));
        checkpackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackages.setMargin(new Insets(0,0,0,110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        
        bookpackage=new JButton("Book Package");
        bookpackage.setBounds(0, 250, 300, 50);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        
        viewpackage=new JButton("View Packages");
        viewpackage.setBounds(0, 300, 300, 50);
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        
        viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        
        bookhotel=new JButton("Book Hotel");
        bookhotel.setBounds(0, 400, 300, 50);
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        
        viewbookedhotel=new JButton("View Booked Hotel");
       viewbookedhotel.setBounds(0, 450, 300, 50);
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setBackground(new Color(0,0,102));
       viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookedhotel.setMargin(new Insets(0,0,0,70));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
        
        destination=new JButton("Destinations");
        destination.setBounds(0, 500, 300, 50);
        destination.setForeground(Color.WHITE);
        destination.setBackground(new Color(0,0,102));
        destination.setFont(new Font("Tahoma",Font.PLAIN,20));
        destination.setMargin(new Insets(0,0,0,125));
        destination.addActionListener(this);
        p2.add(destination);
        
        
        payment=new JButton("Payment");
        payment.setBounds(0, 550, 300, 50);
        payment.setForeground(Color.WHITE);
        payment.setBackground(new Color(0,0,102));
        payment.setFont(new Font("Tahoma",Font.PLAIN,20));
        payment.setMargin(new Insets(0,0,0,155));
        payment.addActionListener(this);
        p2.add(payment);
        
        
         calculator=new JButton("Calculator");
        calculator.setBounds(0, 600, 300, 50);
        calculator.setForeground(Color.WHITE);
        calculator.setBackground(new Color(0,0,102));
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,145));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        
        notepad=new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setForeground(Color.WHITE);
        notepad.setBackground(new Color(0,0,102));
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        
        about=new JButton("About");
       about.setBounds(0, 700, 300, 50);
        about.setForeground(Color.WHITE);
       about.setBackground(new Color(0,0,102));
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image1 = new JLabel(i6);
        image1.setBounds(0, 0, 1650, 1000);
        add(image1);
        
        
         JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
        text.setFont(new Font("Railway",Font.PLAIN,55));
        text.setForeground(Color.WHITE);
       image1.add(text);
        

        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==addPersonalDetails)
        {
            new AddCustomer(username);
        }
        else if(ae.getSource()==viewPersonalDetails)
        {
             new ViewCustomer(username);
        }
        else if(ae.getSource()==updatePersonalDetails)
        {
            new UpdateCustomer(username);
        }
        else if(ae.getSource()==checkpackages)
        {
            new CheckPackage();
        }
          else if(ae.getSource()==bookpackage)
        {
            new BookPackage(username);
        }
          else if(ae.getSource()==viewpackage)
        {
            new ViewPackage(username);
        }
         else if(ae.getSource()==viewhotels)
        {
            new CheckHotels();
        }
        else if(ae.getSource()==destination)
        {
            new Destination();
        }
         else if(ae.getSource()==bookhotel)
        {
            new BookHotel(username);
        }
         else if(ae.getSource()==viewbookedhotel)
        {
            new ViewBookedHotel(username);
        }
         else if(ae.getSource()==payment)
        {
            new Payment();
        }
         else if(ae.getSource()==calculator)
        {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
         else if(ae.getSource()==notepad)
        {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
         else if(ae.getSource()==about)
        {
            new About();
        }
        else if(ae.getSource()==deletePersonalDetails)
        {
            new DeleteDetails(username);
        }
    }
            
    public static void main(String arg[])
    {
        new Dashboard("");
    }
}
