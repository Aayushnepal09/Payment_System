package PS.system;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class New_EmployeeTest {

    @Test
    public void main() {
        Conn c1=new Conn();
        String qry = "insert into employee values('"+"d"+"','"+"n"+"','"+"g"+"','"+"a"+"','"+"s"+"','"+"c"+"','"+"e"+"','"+"p"+"')";
        int result= 0;
        try {
            result = c1.s.executeUpdate(qry);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        assertEquals(1,result);
    }
}