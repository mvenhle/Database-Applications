import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connect {
	static Connection connection = null;
	static String databaseName = "java database";
	static String url = "jdbc:mysql://localhost:3306/" +databaseName;
	static String username = "root";
	static String password = "21may2001";
	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = connection.prepareStatement("INSERT INTO 'studentdatabase'.'student' (name) VALUES ('mvenhle shikovha);");
		int status = ps.executeUpdate();
		
		if (status !=0) {
			System.out.println("Database connected successfully");
			
		}
	

	}

}
