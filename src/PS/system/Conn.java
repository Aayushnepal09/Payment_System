package PS.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;

    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Payment","root","aayush");
            s =c.createStatement();
            System.out.println("connected");

        } catch (Exception e) {
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new Conn();
    }
}
