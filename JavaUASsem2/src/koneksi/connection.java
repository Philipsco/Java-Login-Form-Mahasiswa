package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class connection {

    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas.db","root","");
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "connection failed");
        }
        return con;
    }
}


