import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQL_getColumnValue2{
	private static void printOutput(ResultSet r) throws SQLException{
		System.out.println("id: " + r.getInt(1));
		System.out.println("code: " + r.getInt(2));
		System.out.println("name: " + r.getString(3));
		System.out.println("rank: " + r.getString(4));
		System.out.println("experience: " + r.getString(5));
		System.out.println("timeStamp: " + r.getString(6));
	}
	
	private static String[] convertResultSetToArray(ResultSet r) throws SQLException{
		//System.out.println("id: " + r.getString(1));
		//System.out.println("code: " + r.getString(2));
		//System.out.println("name: " + r.getString(3));
		//System.out.println("rank: " + r.getString(4));
		//System.out.println("experience: " + r.getString(5));
		//System.out.println("timeStamp: " + r.getString(6));
		String[] array = {r.getString(1),r.getString(2),r.getString(3),r.getString(4),r.getString(5),r.getString(6)};
		return array;
	}
	
	public static int getMaxValue(String dbAddress, String userName, String password, String tableName, String columnName){
		Connection conn = null;
		String url = dbAddress;
		int maxValue= 0;//-1;
		//"select id, name from status where id=(select max(id) from status)"
		String statement = "select " + columnName + " from " + tableName + " where " + columnName + " =(select max(" + columnName +") from " + tableName + ")";
		System.out.println("ADVICE :: SQL_getColumnValue2.getMaxValue : statement = " + statement);
		try {
			conn = DriverManager.getConnection(url, "root","please");
			System.out.println("ADVICE :: SQL_getColumnValue2.getMaxValue : conn = " + conn);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(statement);
			//ResultSet rs = st.executeQuery("select id from status where id=(select max(id) from status)");
			System.out.println("ADVICE :: SQL_getColumnValue2.getMaxValue : rs.next() = " + rs.next());
			if(rs.next()) {
				//System.out.println("RS not empty");
				//System.out.println("ADVICE :: SQL_getColumnValue.SQL_getColumnValue :rs = " + rs.getInt(1));
				///if(rs.getInt(1) == 1){
				//	maxValue = rs.getInt(1);
				//}else{
				while(rs.next()) {
					maxValue = rs.getInt(1);
					System.out.println("ADVICE :: SQL_getColumnValue2.getMaxValue : rs = " + rs.getInt(1));
					//}
				}
			}else{
				System.out.println("ADVICE :: SQL_getColumnValue2.getMaxValue : RS empty");
				maxValue = 0;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR :: SQL_getColumnValue2.getMaxValue : Exception: " + e.getMessage());
		} finally {
			try {
				if (conn != null)
					conn.close();
					System.out.println("ADVICE :: SQL_getColumnValue2.getMaxValue : Connection closed");
			} catch (SQLException e) {
				System.out.println("ERROR :: SQL_getColumnValue2.getMaxValue : Exception: " + e.getMessage());
			}
		}
		return maxValue;
	}
	
	public static String[][] getTimeStampRange(String dbAddress, String userName, String password, String tableName, String columnName, String timeStamp1, String timeStamp2){
		Connection conn = null;
		int i = 0;
		String url = dbAddress;
		String[][] returnArray = null;
		String statement = "select * from " + tableName + " where " + columnName + " between '" + timeStamp1 + "' and '" + timeStamp2 + "'";
		System.out.println("ADVICE :: SQL_getColumnValue2.getTimeStampRange : statement = " + statement);
		try {
			conn = DriverManager.getConnection(url, "root","please");
			System.out.println("ADVICE :: SQL_getColumnValue2.getTimeStampRange : conn = " + conn);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(statement);
			//RE_QUERY AND STORE STATEMENT DUE TO THE LIMITATIONS OF THE WHILE STATEMENTS
			Statement st2 = conn.createStatement();
			ResultSet rs2 = st2.executeQuery(statement);
			//CALCULATE SIZE OF THE RESULT SET; i.e. how many rows
			while (rs.next()) {
				i += 1;
			}
			String[][] temp = new String[i][6];
			i = 0;
			while (rs2.next()) {
				temp[i] = convertResultSetToArray(rs2);
				i += 1;
			}
			returnArray = temp;
			temp = null;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR :: SQL_getColumnValue2.getTimeStampRange : Exception: " + e.getMessage());
		} finally {
			try {
				if (conn != null)
					conn.close();
					System.out.println("ADVICE :: SQL_getColumnValue2 Connection closed");
			} catch (SQLException e) {
				System.out.println("ERROR :: SQL_getColumnValue2.getTimeStampRange : Exception: " + e.getMessage());
			}
		}
		return returnArray;
	}
}
