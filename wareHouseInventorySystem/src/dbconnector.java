import java.sql.*;
import javax.swing.*;

public class dbconnector {
	
	Connection conn = null;
	public static Connection dbConnector()
	{
		
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection( "jdbc:mysql://35.239.193.136:3306/internationalap","root","IntAP0271!");
				//JOptionPane.showMessageDialog(null, "Connection Successsful");
				return conn;
						
		}	
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}

}
}
