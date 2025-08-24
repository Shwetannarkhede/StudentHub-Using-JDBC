package db;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	    public static Connection connect() throws Exception {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        String url = "jdbc:mysql://localhost:3306/Management";
	        String username = "root";       // change if needed
	        String password = "Shweta@123"; // change if needed
	        return DriverManager.getConnection(url, username, password);
	    }
	}


