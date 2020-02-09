import javax.swing.*;
import java.sql.*;

public class ConnectionMySql {

	Connection conn = null;
	
	public static Connection connecrBd() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/GestionCabinet","root","");
			return conn;
		}catch(Exception e) 
		{
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
	}

}
