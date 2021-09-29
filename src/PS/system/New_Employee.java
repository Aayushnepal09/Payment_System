package PS.system;

//Importing Class


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class New_Employee extends JFrame implements ActionListener{
    JLabel l0,l1,l2,l3,l4,l5,l6,l7; //declaring label
    JTextField t0,t1,t3,t4,t5,t6,t7;//declaring text Field
    JButton b1,b2; //declaring buttons
    Choice c1;      //declaring options/choice

    New_Employee(){

        //Giving title
        super("New Employee");

        //setting windows visibility,size and location on screen
        setSize(600,650);
        setLocation(600,200);

        //adding label for employer id
        l0 = new JLabel("Employer id");
        l0.setBounds(30,10,130,30);
        l0.setFont(new Font("serif",Font.BOLD,25));
        l0.setForeground(new Color(0, 10, 10));

        //adding text field for Employer id
        t0 = new JTextField(15);
        t0.setBorder(new LineBorder(new Color(7, 75, 94), 2, true));
        t0.setForeground(new Color(0, 10, 10));
        t0.setBackground(new Color(12, 117, 148));
        t0.setBounds(160,15,200,25);
        t0.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        add(l0);
        add(t0);


        //adding label for Name
        l1  = new JLabel("Name");
        l1.setBounds(80,60,100,30);
        l1.setFont(new Font("serif",Font.BOLD,25));
        l1.setForeground(new Color(0, 10, 10));

        //adding text field for Name
        t1 = new JTextField(15);
        t1.setBorder(new LineBorder(new Color(20, 164, 164), 4, true));
        t1.setForeground(new Color(20, 164, 164));
        t1.setBackground(new Color(179, 227, 223));
        t1.setBounds(250,60,300,35);
        t1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        add(l1);
        add(t1);

        //Adding choose for gender
        c1 = new Choice();
        c1.add("Male");
        c1.setForeground(new Color(0, 10, 10));
        c1.add("Female");
        c1.setForeground(new Color(0, 10, 10));
        c1.setBounds(250,120,300,35);
        c1.setForeground(new Color(20, 164, 164));

        //Adding label for Gender
        l2 = new JLabel("Gender");
        l2.setBounds(80,120,100,30);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(new Color(0, 10, 10));
        add(l2);
        add(c1);

        //Adding label for Address
        l3 = new JLabel("Address");
        l3.setBounds(80,180,100,30);
        l3.setFont(new Font("serif",Font.BOLD,25));
        l3.setForeground(new Color(0, 0, 10));

        //Adding textField for Address
        t3 = new JTextField(15);
        t3.setBorder(new LineBorder(new Color(20, 164, 164), 4, true));
        t3.setForeground(new Color(0, 10, 10));
        t3.setBackground(new Color(179, 227, 223));
        t3.setBounds(250,180,300,35);
        t3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        add(l3);
        add(t3);

        //Adding label for state
        l4 = new JLabel("State");
        l4.setBounds(80,260,100,30);
        l4.setFont(new Font("serif",Font.BOLD,25));
        l4.setForeground(new Color(0, 0, 10));
        t4 = new JTextField(15);

        //Adding textField for State
        t4.setBorder(new LineBorder(new Color(20, 164, 164), 4, true));
        t4.setForeground(new Color(0, 10, 10));
        t4.setBackground(new Color(179, 227, 223));
        t4.setBounds(250,260,300,35);
        t4.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        add(l4);
        add(t4);

        //Adding label for city
        l5 = new JLabel("City");
        l5.setBounds(80,320,100,30);
        l5.setFont(new Font("serif",Font.BOLD,25));
        l5.setForeground(new Color(0, 0, 10));

        //Adding textField for city
        t5 = new JTextField(15);
        t5.setBorder(new LineBorder(new Color(20, 164, 164), 4, true));
        t5.setForeground(new Color(0, 10, 10));
        t5.setBackground(new Color(179, 227, 223));
        t5.setBounds(250,320,300,35);
        t5.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        add(l5);
        add(t5);

        //Adding label for email
        l6 = new JLabel("Email");
        l6.setBounds(80,380,100,30);
        l6.setFont(new Font("serif",Font.BOLD,25));
        l6.setForeground(new Color(0, 0, 10));

        //Adding textField for email
        t6 = new JTextField(15);
        t6.setBorder(new LineBorder(new Color(20, 164, 164), 4, true));
        t6.setForeground(new Color(0, 10, 10));
        t6.setBackground(new Color(179, 227, 223));
        t6.setBounds(250,380,300,35);
        t6.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        add(l6);
        add(t6);

        //Adding label for phone
        l7 = new JLabel("Phone");
        l7.setBounds(80,440,100,30);
        l7.setFont(new Font("serif",Font.BOLD,25));
        l7.setForeground(new Color(0, 0, 10));;

        //Adding textField for phone
        t7= new JTextField(15);
        t7.setBorder(new LineBorder(new Color(20, 164, 164), 4, true));
        t7.setForeground(new Color(0, 10, 10));
        t7.setBackground(new Color(179, 227, 223));
        t7.setBounds(250,440,300,35);
        t7.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        add(l7);
        add(t7);

        //Adding button for submit and setting button layout
        b1 =new JButton("Submit");
        b1.setBounds(160,520,120,35);
        add(b1);
        b1.addActionListener(this);
        b1.setBackground(new Color(20, 164, 164));
        b1.setForeground(Color.WHITE);

        //adding button for cancel and setting button layout
        b2 = new JButton("Cancel");
        b2.setBounds(330,520,120,35);
        add(b2);
        setLayout(new BorderLayout());
        b2.addActionListener(this);
        b2.setBackground(new Color(20, 164, 164));
        b2.setForeground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("PS/icons/aaemp.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,800,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,600,800);
        add(l3);

    }
//adding action performer to give response to the buttons
    public void actionPerformed(ActionEvent ae){

        String d = t0.getText();
        String n = t1.getText();
        String g = c1.getSelectedItem();
        String a = t3.getText();
        String s = t4.getText();
        String c = t5.getText();
        String e = t6.getText();
        String p = t7.getText();
        String qry = "insert into employee values('"+d+"','"+n+"','"+g+"','"+a+"','"+s+"','"+c+"','"+e+"','"+p+"')";

        try{
            Conn c1 = new Conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Employee Created");
            this.setVisible(false);
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
    public static void main(String s[]){
        new New_Employee().setVisible(true);
    }
}

