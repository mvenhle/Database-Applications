import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {
	
	static Connection connection = null;
	static String databaseName = "";
	static String url = "jbc:mysql://localost:3306/" +databaseName;
	static String username = "root";
	static String password = 21+"may"+2001;
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jbc.Driver").newInstance();
		connection = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = connection.prepareStatement("INSERT INTO 'studentdatabase'.'student' ('name') VALUES ( 'Mvenhle Shikovha');");
		int status = ps.executeUpdate();
		if (status !=0) {
			System.out.println("Database connected and record inserted");
			
		}
	}

}
