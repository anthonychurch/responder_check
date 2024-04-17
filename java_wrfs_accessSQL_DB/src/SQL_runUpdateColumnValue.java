import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQL_runUpdateColumnValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/winRfs_availibility";
		String userName = "root";
		String password = "please";
		String tableName = "status";
		String column1Name = "id";
		String column2Name = "code";
		String column3Name = "name";
		
		Connection conn = null;
		String statement = "UPDATE " + tableName + " set " + column2Name + " = '" + 9 + "' where " + column3Name + " = '" + "Anthony Church" + "'";
		try {
			conn = DriverManager.getConnection(url, "root","please");
			System.out.println("ADVICE :: SQL_getColumnValue.SQL_getColumnValue : conn = " + conn);
			Statement st = conn.createStatement();
			int rs = st.executeUpdate(statement);
			//ResultSet rs = st.executeQuery("select id from status where id=(select max(id) from status)");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR :: SQL_getColumnValue.SQL_getColumnValue : Exception: " + e.getMessage());
		} finally {
			try {
				if (conn != null)
					conn.close();
					System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println("ERROR :: SQL_getColumnValue.SQL_getColumnValue : Exception: " + e.getMessage());
			}
		}
	}

}
