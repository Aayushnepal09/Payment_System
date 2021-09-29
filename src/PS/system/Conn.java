//connecting database
package PS.system;

//Importing Class
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;

    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //installing driver
            c =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Payment","root","aayush");//giving path to database
            s =c.createStatement();
            System.out.println("connected");// printing connecting on console so that we would know database is connected

        } catch (Exception e) {
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new Conn();
    }
}
