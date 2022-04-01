import java.sql.*;

public class database {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/adventures", "root", "");
			System.out.println("Connected to the database");
			//the mysql insert statement
		    String query = " insert into customer (Name, Street, City, County, Country, Eircode, Email_Address, Phone_No)"
		       + " values (?, ?, ?, ?, ?,?,?,?)";

		    // create the mysql insert preparedstatement
		    PreparedStatement preparedStmt = conn.prepareStatement(query);
		    preparedStmt.setString(1, "Big Barney");
		    preparedStmt.setString(2, "Rubble Lane");
		    preparedStmt.setString(3, "Quaryville");
		    preparedStmt.setString(4, "Donegal");
		    preparedStmt.setString(5, "Ireland");
		    preparedStmt.setString(6, "F12 Y345");
		    preparedStmt.setString(7, "lyit@email.me");
		    preparedStmt.setString(8, "012 3456789");

		    // execute the preparedstatement
		    preparedStmt.execute();
			conn.close();
		}
		catch (Exception e) {
			System.out.print("Error Occurred"+e);
		}
	}
}
