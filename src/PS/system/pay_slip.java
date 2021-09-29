package PS.system;

//Importing Class

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pay_slip extends JFrame implements ActionListener{
//Adding button,boolean,textArea
    Choice c1;
    JTextArea t1;
    JButton b1;

    pay_slip(){

        //setting windows visibility,size and location on screen
        setSize(800,700);
        setLocation(400,100);

        c1 = new Choice();
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from salary");//Running sql
            while(rs.next()){
                c1.add(rs.getString("id"));
            }
        }catch(Exception e) { }

        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.add(new JLabel("Select Id"));
        p1.add(c1);
        add(p1,"North");
        // c1.addItemListener(this);

        t1 = new JTextArea(30,80);
        JScrollPane jsp = new JScrollPane(t1);

        Font f1 = new Font("arial",Font.BOLD,20);
        t1.setFont(f1);

        b1 = new JButton("Generate Pay Slip");

        add(b1,"South");
        add(jsp,"Center");
        b1.addActionListener(this);

    }
    //adding action performer to give response to the buttons
    public void actionPerformed(ActionEvent e) {

        try{
            Conn c = new Conn();//connecting to database

            ResultSet rs = c.s.executeQuery("select * from employee where id="+c1.getSelectedItem());//running sql
            rs.next();
            String name = rs.getString("name");
            rs.close();

            rs = c.s.executeQuery("select * from salary where id="+c1.getSelectedItem());
            double gross=0;
            double net=0;

            java.util.Date d1 = new java.util.Date();
            int month = d1.getMonth();
            t1.setText(" ----------------   PAY SLIP FOR THE MONTH OF "+month+" ,2021  ------------------------");
            t1.append("\n");

            if(rs.next()){

                t1.append("\n     Employee ID "+rs.getString("id"));
                t1.append("\n     Employee Name "+name);

                t1.append("\n----------------------------------------------------------------");
                t1.append("\n");

                double hra = rs.getDouble("hra");
                t1.append("\n                  House Rent Allowance         : "+hra);
                double da  = rs.getDouble("da");
                t1.append("\n                  Domestic Allowance          : "+da);
                double med  = rs.getDouble("med");
                t1.append("\n                  Medical Allowance         : "+med);
                double pf  = rs.getDouble("pf");
                t1.append("\n                  Provident Fund          : "+pf);
                double basic = rs.getDouble("basic_salary");
                gross = hra+da+med+pf+basic;
                net = gross - pf;
                t1.append("\n                  BASIC SALARY : "+basic);

                t1.append("\n-------------------------------------------------------");
                t1.append("\n");

                t1.append("\n       GROSS SALARY :"+gross+"    \n       NET SALARY : "+net);
                t1.append("\n       Tax   :   13% of gross "+ (gross*13/100));
                t1.append("\n -------------------------------------------------");
                t1.append("\n");
                t1.append("\n");
                t1.append("\n");
                t1.append("   (  Signature/Seal  )      ");

            }
        }catch(Exception ee) {
            ee.printStackTrace();
        }


    }
    public static void main(String[] args){

        new pay_slip().setVisible(true);
    }
}
