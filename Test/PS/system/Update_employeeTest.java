package PS.system;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class Update_employeeTest {

    @Test
    public void main() {
        Conn db = new Conn();
        String qry = "update employee set name='"+"n"+"',gender='"+"g"+"',address='"+"a"+"',state='"+"s"+"',city='"+"c"+"',email='"+"e"+"',phone='"+"p"+"' where id=c2.getSelectedItem()";
        try {
            int result =db.s.executeUpdate(qry);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}