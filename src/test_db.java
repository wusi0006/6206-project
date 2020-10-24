import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;
public class test_db{
//	@Test
//	public void show1() {
//		System.out.println("111");
//	}
	@Test
	public void show1() throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
	    String dbdriver = "com.mysql.jdbc.Driver";
	    String username = "root";
	    String password = "44818610";
	    Class.forName(dbdriver);
			Connection con = DriverManager.getConnection(url, username, password);
//			System.out.println("Database connection established");
			assert con.equals(null) == false;

	}
}




