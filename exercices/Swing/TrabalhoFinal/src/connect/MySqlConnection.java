package connect;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MySqlConnection {
    
    public Connection getConnection(){
        
        try{
            return
            DriverManager.getConnection("jdbc:mysql://localhost:3306/Programacao","root","");
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, "Connection Error!" + error);
            exit(0);
        }
        
        return null;
    }
}
