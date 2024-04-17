import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQL_TestGetMaxValue{
	private static int delay = 1000;//1 second delay
	private static int delayCeckDB = 5000;//5 second delay
	private static int test = 1000 * 86500;// * 86300;
	private static boolean runProgram = true;
	private static String tss = "";
	private static String nextTimeStamp = "";
	
	private static String url = "jdbc:mysql://localhost:3306/winRfs_availability";
	private static String userName = "root";
	private static String password = "please";
	private static String tableName = "status";
	private static String column6Name = "time";
	
	public static void main(String args[]) {
		SQL_DButilities winRfsDB = new SQL_DButilities();
		winRfsDB.setUserPassUrl(url,userName,password);
		winRfsDB.connect();
		int max = winRfsDB.getMaxValue("log", "id");
		winRfsDB.close();
		System.out.println(max);
	}
}
