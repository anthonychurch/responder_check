//package demo.mysql.java.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToMySQLSimple {
	
	private static void printOutput(ResultSet r) throws SQLException{
		System.out.println("id: " + r.getInt(1));
		System.out.println("code: " + r.getInt(2));
		System.out.println("name: " + r.getString(3));
		System.out.println("rank: " + r.getString(4));
		System.out.println("experience: " + r.getString(5));
		System.out.println("timeStamp: " + r.getString(6));
	}

	public static void main(String args[]) {
		Connection conn = null;

		try {
			//Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/winRfs_availibility";
			conn = DriverManager.getConnection(url, "root","please");
			System.out.println("con = " + conn);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from status");
			System.out.println("rs = " + rs);
			System.out.println("rs.next() = " + rs.next());
			printOutput(rs);
			while (rs.next()) {
				printOutput(rs);
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception: " + e.getMessage());
		} finally {
			try {
				if (conn != null)
					conn.close();
					System.out.println("Connection closed");
			} catch (SQLException e) {
    
			}
		}
	}
}