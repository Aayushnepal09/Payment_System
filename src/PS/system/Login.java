package PS.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.sql.*;

class login extends JFrame implements ActionListener{
    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    login(){

        super("Login");

        setBackground(Color.white);
        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(100,60,100,30);
        add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(100,110,100,30);
        add(l2);

        t1=new JTextField();
        t1.setBounds(190,60,150,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(190,110,150,30);
        add(t2);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("PS/icons/coin.png"));
        Image i2 = i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,600,300);
        add(l3);


        b1 = new JButton("Login");
        b1.setBounds(80,190,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(new Color(20, 167, 180));
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(220,190,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(new Color(20, 167, 180));
        b2.setForeground(Color.WHITE);
        add(b2);

        b2.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true), "Login",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
        panel.setBounds(10, 5, 567, 255);
        add(panel);
        panel.setBackground(new Color(214, 241, 241));
        setSize(1200,500);

        getContentPane().setBackground(new Color(20, 175, 189));

        setVisible(true);
        setSize(600,300);
        setLocation(500,300);

    }
    public void actionPerformed(ActionEvent ae){
        try
        {
            Conn c1=new Conn();
            String u=t1.getText();
            String v=t2.getText();

            String q="select * from login where username='"+u+"' and password='"+v+"'";

            ResultSet rs=c1.s.executeQuery(q); // query execute
            if(rs.next()){
                new project().setVisible(true);
                setVisible(false);
            }else{
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
