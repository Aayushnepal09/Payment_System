package PS.system;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class Update_salaryTest {

    @Test
    public void main() {
        Conn db = new Conn();

        String qry = "update salary set hra="+"hra"+",da="+"da"+",med="+"med"+",pf="+"pf"+",basic_salary="+"basic"+"  where id="+"db.getSelectedItem()";
        try {
            int result =db.s.executeUpdate(qry);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }}
