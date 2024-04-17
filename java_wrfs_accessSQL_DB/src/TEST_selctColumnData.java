import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;


public class TEST_selctColumnData {
	private static String url = "jdbc:mysql://localhost:3306/winRfs_availability";
	private static String userName = "root";
	private static String password = "please";
	private static String tableStatus = "status";
	private static String tableLog = "log";
	private static String column2Name = "code";
	private static String column3Name = "name";
	private static String column6Name = "time";
	
	public static void main(String[] arg){
		SQL_DButilities winRfsDB = new SQL_DButilities();
		winRfsDB.setUserPassUrl(url,userName,password);
		winRfsDB.connect();
		String DBgetStatment = "select code,name from status";
		ResultSet rs = winRfsDB.query(DBgetStatment);
		int howManyNams = 1;
		String holdList = "";
		ArrayList<String[]> statusList = new ArrayList<String[]>( );
		ArrayList<String[]> available = new ArrayList<String[]>( );
		String[] hold = new String[2];
		try {
			if(rs.next()){
				System.out.println("rs.getString(1) = " + rs.getString(1));
				System.out.println("rs.getString(2) = " + rs.getString(2));
				holdList = rs.getString(1);
				hold[0] = rs.getString(1);
				hold[1] = rs.getString(2);
				statusList.add(hold);
				System.out.println("holdList1 = " + holdList);
				while(rs.next()){
					hold[0] = rs.getString(1);
					hold[1] = rs.getString(2);
					statusList.add(hold);
					howManyNams += 1;
				}//END WHILE
				
				Iterator iterator = statusList.iterator();
				
				String[] g = statusList.get(0);
				int size = statusList.size();
				
				for(int i = 0; i < size;i++){
					if(Integer.parseInt(g[0]) == 1){
						available.add(g);
					}
				}
				System.out.println("RESPONDER CHECK : There are " + available.size() + " members available to respond.");
				
				
				//if(available.size()<4){
				//	System.out.println("There are " + available.size() + " members available to repsond.");
					//System.out.println("Not enough people available");
				//}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//END IF
		
		
		//for(int i = 0; i < listTest.size();i++){
			
			
		//}
		//String[] getActiveMembersNames = new String[howManyNams];
		//getActiveMembersNames = holdList.split(":+");
		
	}
}
