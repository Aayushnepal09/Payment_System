package PS.system;

//Importing Class
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class project extends JFrame implements ActionListener {

     project(){
        //adding title
        super("Salary Management System");

        //setting size
        setSize(2000,900);
        getContentPane().setBackground(Color.WHITE);

        //adding image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("PS/icons/pay.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500,900,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1500,800);
        add(l3);

    //creating menu bar
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        JMenu m1 = new JMenu("Master");
        m1.setForeground(Color.blue);

        //adding menu items
        JMenuItem t1 = new JMenuItem("New Employee");
        t1.setForeground(Color.blue);
        t1.setFont(new Font("monospaced",Font.PLAIN,12));
        t1.setMnemonic('N');
        t1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));//adding shortcut key
        t1.setIcon(new ImageIcon(ClassLoader.getSystemResource("PS/icons/New.png")));//adding menu icon

        //adding menu items
        JMenuItem t3 = new JMenuItem("Salary");
        t3.setForeground(Color.blue);
        t3.setFont(new Font("monospaced",Font.PLAIN,12));
        t3.setMnemonic('S');
        t3.setIcon(new ImageIcon(ClassLoader.getSystemResource("PS/icons/schedreport.PNG")));//adding menu icon
        t3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));//adding shortcut key

        //adding menu items
        JMenuItem t4 = new JMenuItem("List Employee");
        t4.setForeground(Color.blue);
        t4.setFont(new Font("monospaced",Font.PLAIN,12));
        t4.setMnemonic('L');
        t4.setIcon(new ImageIcon(ClassLoader.getSystemResource("PS/icons/newinvoice.png")));//adding menu icon
        t4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));//adding shortcut key


        m1.add(t1);//
        m1.add(t3);//..........Adding item in screen
        m1.add(t4);//
        mb.add(m1);//

        t1.addActionListener(this);//
        t3.addActionListener(this);//......adding action listrner
        t4.addActionListener(this);//

        //adding new menu
        JMenu edit =new JMenu("Update");
        edit.setForeground(Color.RED);
        mb.add(edit);
        JMenuItem s1 = new JMenuItem("Update Salary");
        s1.setForeground(Color.blue);
        s1.setFont(new Font("monospaced",Font.PLAIN,12));
        s1.setMnemonic('U');
        s1.setIcon(new ImageIcon(ClassLoader.getSystemResource("PS/icons/EditOpen.png")));//adding menu icon
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));//adding shortcut key
        edit.add(s1);

        //adding new menu
        JMenuItem s2 = new JMenuItem("Update Employee");
        s2.setForeground(Color.blue);
        s2.setFont(new Font("monospaced",Font.PLAIN,12));
        s2.setMnemonic('p');
        s2.setIcon(new ImageIcon(ClassLoader.getSystemResource("PS/icons/empreport.png")));//adding menu icon
        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));//adding shortcut key
        edit.add(s2);

        //adding new menu
        JMenuItem s3 = new JMenuItem("Take Attendance");
        s3.setForeground(Color.blue);
        s3.setFont(new Font("monospaced",Font.PLAIN,12));
        s3.setMnemonic('T');
        s3.setIcon(new ImageIcon(ClassLoader.getSystemResource("PS/icons/EXPENSE.PNG")));//adding menu icon
        s3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));//adding shortcut key
        edit.add(s3);

        s1.addActionListener(this);//
        s2.addActionListener(this);//.......adding action listener
        s3.addActionListener(this);//
        JMenu rep =new JMenu("Reports");
        rep.setForeground(Color.blue);
        mb.add(rep);
        JMenuItem p1 = new JMenuItem("Generate PaySlip");

//adding menu items
        p1.setForeground(Color.blue);
        p1.setFont(new Font("monospaced",Font.PLAIN,12));
        p1.setMnemonic('P');
        p1.setIcon(new ImageIcon(ClassLoader.getSystemResource("PS/icons/payments.png")));//adding menu icon
        p1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));//adding shortcut key

        rep.add(p1);
        JMenuItem p2 = new JMenuItem("List Attendance");

        //adding menu items
        p2.setForeground(Color.blue);
        p2.setFont(new Font("monospaced",Font.PLAIN,12));
        p2.setMnemonic('L');
        p2.setIcon(new ImageIcon(ClassLoader.getSystemResource("PS/icons/empreport.png")));//adding menu icon
        p2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));//adding shortcut key
        rep.add(p2);
        p1.addActionListener(this);
        p2.addActionListener(this);

        //adding menu
        JMenu util =new JMenu("Utilities");
        util.setForeground(Color.red);

        mb.add(util);
        JMenuItem u1 = new JMenuItem("Notepad");//adding notepad


        u1.setIcon(new ImageIcon(ClassLoader.getSystemResource("PS/icons/New.png")));//adding menu icon

        u1.setForeground(Color.blue);
        u1.setFont(new Font("monospaced",Font.PLAIN,12));
        u1.setMnemonic('o');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));//adding shortcut key

        util.add(u1);
        JMenuItem u2 = new JMenuItem("Calculator");//adding calculator
        u2.setIcon(new ImageIcon(ClassLoader.getSystemResource("PS/icons/calc.png")));//adding menu icon

        u2.setForeground(Color.blue);
        u2.setFont(new Font("monospaced",Font.PLAIN,12));
        u2.setMnemonic('C');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));//adding shortcut key


        util.add(u2);
        JMenuItem u3 = new JMenuItem("Web Browser");//adding web browser
        u3.setIcon(new ImageIcon(ClassLoader.getSystemResource("PS/icons/explorer.jpg")));

        u3.setForeground(Color.blue);
        u3.setFont(new Font("monospaced",Font.PLAIN,12));
        u3.setMnemonic('E');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));//adding shortcut key

        util.add(u3);

        u1.addActionListener(this);
        u2.addActionListener(this);
        u3.addActionListener(this);

        //adding menu items
        JMenu m8=new JMenu("Exit");
        m8.setForeground(Color.red);
        mb.add(m8);
        JMenuItem m8i1=new JMenuItem("Exit");
        m8.add(m8i1);
        m8i1.setForeground((Color.blue));
        m8i1.setFont(new Font("monospaced", Font.PLAIN, 14));
        m8i1.setMnemonic('X');
        m8i1.setIcon(new ImageIcon(ClassLoader.getSystemResource("PS/icons/exit.png")));//adding menu icon
        m8i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));//adding shortcut key
        m8i1.addActionListener(this);

    }
    //adding action performer to give response to the buttons
    public void actionPerformed(ActionEvent ae){
        String msg= ae.getActionCommand();

        if(msg.equals("New Employee"))
            new New_Employee().setVisible(true);
        else if(msg.equals("List Employee"))
            new List_Employee().setVisible(true);
        else if(msg.equals("Update Employee"))
            new Update_employee().setVisible(true);
        else if(msg.equals("Salary"))
            new Salary().setVisible(true);
        else if(msg.equals("Update Salary"))
            new Update_salary().setVisible(true);
        else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");//adding command for system noatpad
            }catch(Exception e){ }
        }
        else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");//adding command for system Calculator
            }catch(Exception e){ }
        }
        else if(msg.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft\\Edge" +
                        "\\Application\\msedge.exe");//adding command for system Web Browser

            }catch(Exception e){ }
        }
        else if(msg.equals("Take Attendance")){
            new TakeAttendance().setVisible(true);
        }
        else if(msg.equals("Exit"))
            System.exit(0);
        else if(msg.equals("Generate PaySlip"))
            new pay_slip().setVisible(true);
        else if(msg.equals("List Attendance"))
            new List_Attendance().setVisible(true);
    }

    public static void main(String[] args) {
        new project().setVisible(true);

    }

}
