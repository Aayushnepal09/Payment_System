package PS.system;

//Importing Class

import java.sql.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class TakeAttendance extends JFrame implements ActionListener{
    JLabel l1,l2;//declaring label
    JButton b1,b2;//declaring button
    Choice c2,fh,sh;//declaring choice

    TakeAttendance(){

        setLayout(new GridLayout(4,2,50,50));
        c2 = new Choice();
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            while(rs.next()){
                c2.add(rs.getString("id"));
            }


        }catch(Exception e){ }

        add(new JLabel("Select Empno"));
        add(c2);

        l1 = new JLabel("First Half");//adding label for first half of the shift
        fh = new Choice();
        fh.add("Present");
        fh.add("Absent");
        fh.add("Leave");

        add(l1);
        add(fh);

        l2 = new JLabel("Second Half");//adding label for second half of the shift
        sh = new Choice();
        sh.add("Present");
        sh.add("Absent");
        sh.add("Leave");

        add(l2);
        add(sh);

        b1 =new JButton("Submit");//adding button for submit
        b1.setBackground(new Color(20, 164, 164));
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Cancel");//adding button for cancel
        b2.setBackground(new Color(20, 164, 164));

        b2.setForeground(Color.WHITE);

        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        getContentPane().setBackground(new Color(175, 231, 227));


        //setting windows visibility,size and location on screen
        setVisible(true);
        setSize(400,450);
        setLocation(600,200);

    }
    //adding action performer to give response to the buttons
    public void actionPerformed(ActionEvent ae){

        String f = fh.getSelectedItem();
        String s = sh.getSelectedItem();
        String dt = new java.util.Date().toString();
        String id=c2.getSelectedItem();
        String qry = "insert into attendance values("+ id +",'"+dt+"','"+f+"','"+s+"')";

        try{
            Conn c1 = new Conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Attendance confirmed");
            this.setVisible(false);
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }

    public static void main(String s[])
    {
        new TakeAttendance();

    }
}

