package PS.system;
//Importing Class

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.sql.*;

class login extends JFrame implements ActionListener{  //creating login frame


    //Creating label,textfield,passwordfield,and buttons for login,password and cancel
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    login(){

        super("Login");

        setBackground(Color.white);//adding background colour
        setLayout(null);

        //creating label for Username
        l1 = new JLabel("Username");
        l1.setBounds(100,60,100,30);
        add(l1);

        //creating label for Password
        l2 = new JLabel("Password");
        l2.setBounds(100,110,100,30);
        add(l2);

        //adding text field for username
        t1=new JTextField();
        t1.setBounds(190,60,150,30);
        add(t1);

        //adding password field for password
        t2=new JPasswordField();
        t2.setBounds(190,110,150,30);
        add(t2);




        //adding button for login
        b1 = new JButton("Login");
        b1.setBounds(80,190,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(new Color(20, 167, 180));
        b1.setForeground(Color.WHITE);
        add(b1);

        //Adding button for cancel
        b2=new JButton("Cancel");
        b2.setBounds(220,190,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(new Color(20, 167, 180));
        b2.setForeground(Color.WHITE);
        add(b2);
        b2.addActionListener(this);

        //adding background Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("PS/icons/coin.png"));
        Image i2 = i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,600,300);
        add(l3);

        //adding jpanel
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true), "Login",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
        panel.setBounds(10, 5, 567, 255);
        add(panel);
        panel.setBackground(new Color(214, 241, 241));
        setSize(1200,500);

        getContentPane().setBackground(new Color(20, 175, 189));

        //setting windows visibility,size and location on screen
        setVisible(true);
        setSize(600,300);
        setLocation(500,300);

    }

    //connecting to database for verification
    public void actionPerformed(ActionEvent ae){

            try
            {
                Conn c1=new Conn();
                String u=t1.getText();
                String v=t2.getText();

                String q="select * from login where username='"+u+"' and password='"+v+"'";

                ResultSet rs=c1.s.executeQuery(q); // query execute
                if(rs.next()){                  //verifying login and password
                    new project().setVisible(true);
                    setVisible(false);

                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    setVisible(false);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }



    public static void main(String[] args){

        new login();
    }
}
