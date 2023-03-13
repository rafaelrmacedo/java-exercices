package connect;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TestMySqlConnection {
    public static void main(String[] args) throws SQLException {
        
        Connection conn = null;
        MySqlConnection mySqlConnection = new MySqlConnection();
        conn = mySqlConnection.getConnection();
        JOptionPane.showMessageDialog(null, "Conection established with sucess!" );

    }
}
