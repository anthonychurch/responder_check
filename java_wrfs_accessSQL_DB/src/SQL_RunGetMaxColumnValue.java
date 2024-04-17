
public class SQL_RunGetMaxColumnValue{
	static String urll = "jdbc:mysql://localhost:3306/winrfs_availability";
	static String userName = "root";
	static String password = "please";
	static String tableName = "status";//"status";
	static String columnName = "id";
	public static void main(String args[]){
		int maxValue = SQL_getColumnValue.getMaxValue(urll,userName,password,tableName,columnName);
		System.out.println("ADVICE :: SQL_RunGetMaxColumnValue : maxValue = " + maxValue);
		System.out.println("I work.");
	}
}
