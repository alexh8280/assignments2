import java.sql.*;


public class ConnectTest {
	
	public static void main(String[] args) throws SQLException{
		
	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRs = null;
	
	String dbUrl = "jdbc:mysql://localhost:3306/demo";
	String user = "student";
	String pass = "student";
	
	try {
	
		myConn = DriverManager.getConnection(dbUrl, user, pass);
	
		myStmt = myConn.createStatement();
	
		myRs = myStmt.executeQuery("select * from employees");
		
		while (myRs.next()) {
			System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
		}
	}
	catch (Exception e) {
		
	}
	
	
		
	}
	
}
