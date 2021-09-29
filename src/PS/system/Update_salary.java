package PS.system;

//Importing Class

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Update_salary extends JFrame implements ActionListener,ItemListener{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton b1,b2;
    Choice c2;

    Update_salary(){

        setLayout(null);
        c2 = new Choice();
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from salary");
            while(rs.next()){
                c2.add(rs.getString("id"));
            }

        }catch(Exception e){ }

        JLabel emp = new JLabel("Select Empno");
        emp.setBounds(20,20,100,20);
        add(emp);

        c2.setBounds(120,20,200,20);
        add(c2);

        l1 = new JLabel("House rent allowance");
        t1 = new JTextField(15);

        l1.setBounds(20,60,100,20);
        t1.setBounds(120,60,200,20);
        add(l1);
        add(t1);

        l2 = new JLabel("Domestic allowance");
        t2 = new JTextField(15);

        l2.setBounds(20,100,100,20);
        t2.setBounds(120,100,200,20);
        add(l2);
        add(t2);

        l3 = new JLabel("Medical allowance");
        t3 = new JTextField(15);

        l3.setBounds(20,140,100,20);
        t3.setBounds(120,140,200,20);
        add(l3);
        add(t3);

        l4 = new JLabel("Provident fund");
        t4 = new JTextField(15);

        l4.setBounds(20,180,100,20);
        t4.setBounds(120,180,200,20);
        add(l4);
        add(t4);

        l5 = new JLabel("basic salary");
        t5 = new JTextField(15);

        l5.setBounds(20,220,100,20);
        t5.setBounds(120,220,200,20);
        add(l5);
        add(t5);

        b1 =new JButton("Update");
        b1.setBackground(new Color(7, 119, 113));
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Delete");
        b2.setBackground(new Color(7, 119, 113));
        b2.setForeground(Color.WHITE);

        b1.setBounds(40,280,100,25);
        b2.setBounds(200,280,100,25);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        c2.addItemListener(this);

        getContentPane().setBackground(new Color(114, 204, 198));

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("PS/icons/Nsalary.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,380,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,400,380);
        add(l3);

        setVisible(true);
        setSize(400,380);
        setLocation(600,200);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            String hra = t1.getText();
            String id = c2.getSelectedItem();
            String da = t2.getText();
            String med = t3.getText();
            String pf = t4.getText();
            String basic = t5.getText();

            String qry = "update salary set hra="+hra+",da="+da+",med="+med+",pf="+pf+",basic_salary="+basic+"  where id="+c2.getSelectedItem();

            try{
                Conn c1 = new Conn();
                c1.s.executeUpdate(qry);
                JOptionPane.showMessageDialog(null,"Salary Updated");
                this.setVisible(false);
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }

        if(ae.getSource()==b2){

            try{
                Conn c1 = new Conn();
                c1.s.executeUpdate("delete from salary where id="+c2.getSelectedItem());
                JOptionPane.showMessageDialog(null,"Salary Deleted");
                this.setVisible(false);
            }catch(Exception ee){
                ee.printStackTrace();
            }
        }
    }

    public void itemStateChanged(ItemEvent ie)
    {
        try{
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("select * from salary where id="+c2.getSelectedItem());
            if(rs.next()){
                t1.setText(rs.getString("hra"));
                t2.setText(rs.getString("da"));
                t3.setText(rs.getString("med"));
                t4.setText(rs.getString("pf"));
                t5.setText(rs.getString("basic_salary"));

            }
        }catch(Exception ee){
            ee.printStackTrace();
        }


    }

    public static void main(String[] args){
        new Update_salary();
    }

}

