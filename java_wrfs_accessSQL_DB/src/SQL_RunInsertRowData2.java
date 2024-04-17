import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class SQL_RunInsertRowData2 {
	//private static final String ArrayList = null;
	private static String url = "jdbc:mysql://localhost:3306/winRfs_availability";
	private static String userName = "root";
	private static String password = "please";
	private static String tableName = "status";
	private static String column1Name = "id";
	private static String[] dataTypes = {"int","int","String","String","String","String","String","String","String","String","String"};
	private static ArrayList<String> person1 = new ArrayList<String>(Arrays.asList("Peter Church", "Deputy Group Captain", "Senior","true","false","true",null,null));
	private static ArrayList<String> person2 = new ArrayList<String>(Arrays.asList("Anthony Church", "Fire Fighter", "Senior","false","false","true",null,null));
	private static ArrayList<String> person3 = new ArrayList<String>(Arrays.asList("Colin Church", "Deputy Captain", "Senior","true","true","true",null,null));
	private static ArrayList<String> person4 = new ArrayList<String>(Arrays.asList("Peter Todd", "Deputy Captain", "Senior","true","true","true",null,null));
	private static ArrayList<String> person5 = new ArrayList<String>(Arrays.asList("Fiona Stalgis", "Fire Fighter", "Senior","false","true","true",null,null));
	private static ArrayList<String> person6 = new ArrayList<String>(Arrays.asList("John Stanley", "Fire Fighter", "Mid","true","false","false",null,null));
	private static ArrayList<String> person7 = new ArrayList<String>(Arrays.asList("Peter Easterling", "Fire Fighter", "Senior","true","true","true",null,null));
	private static ArrayList<String> person8 = new ArrayList<String>(Arrays.asList("Matt Bradshaw", "Fire Fighter", "Mid","true","false","true",null,null));
	private static ArrayList<String> person9 = new ArrayList<String>(Arrays.asList("Chris Bradshaw", "Fire Fighter", "Mid","false","false","true",null,null));
	private static ArrayList<String> person10 = new ArrayList<String>(Arrays.asList("Doug Reed", "Fire Fighter", "Senior","false","true","false",null,null));
	private static ArrayList<String> person11 = new ArrayList<String>(Arrays.asList("Nathan Ross New", "Senior Deputy Captain", "Senior","false","true","false",null,null));
	private static ArrayList<String> person12 = new ArrayList<String>(Arrays.asList("David I Jones", "Fire Fighter", "Mid","false","true","false",null,null));
	private static ArrayList<String> person13 = new ArrayList<String>(Arrays.asList("Anthony Black", "Captain", "Senior","true","true","true",null,null));
	//static String[] data = {"6","1","Peter Todd","Deputy Captain","Senior","2012-03-26 13:23:00"};
	private static String[] codeArray = {"1","2","3"};
	private static String[] data = {"","","","","","","","","","",""};
	private static HashMap<String, ArrayList<String>> mapPersonel = new HashMap<String, ArrayList<String>>();
	private static GetCurrentTimeStamp timeStamp = new GetCurrentTimeStamp();
	private static int code = 1;
	private static int whichPerson = 1;
	private static Random r = new Random();
	
	private static int start = 1;
	
	public static void main(String args[]){
		int i = 0;
		int maxValue = SQL_getColumnValue.getMaxValue(url,userName,password,tableName,column1Name);
		populateHashMap();
		SQL_InsertRowData db = new SQL_InsertRowData(url,userName,password);
		db.connect();
		for(int j = start; j < mapPersonel.size()+1; j++){
			code = r.nextInt(3)+1;
			if(code == 2){
				System.out.println("code equaled 2!!");
				code = r.nextInt(3)+1;
			}
			whichPerson = j;//r.nextInt(start)+1;
			System.out.println("whichPerson = " + whichPerson);
			//Get timestamp and remove the nano seconds
			Timestamp ts = timeStamp.get();
			String tss = ts.toString();
			String tssShort = tss.substring(0,19);
			System.out.println("tssShort = " + tssShort);
		
			
			data[0] = Integer.toString(maxValue+1);//ID
			System.out.println("data[0] = " + data[0]);
			data[1] = Integer.toString(code);//CODE
			data[2] = mapPersonel.get(Integer.toString(whichPerson)).get(0);//NAME
			data[3] = mapPersonel.get(Integer.toString(whichPerson)).get(1);//RANK
			data[4] = mapPersonel.get(Integer.toString(whichPerson)).get(2);//EXPERIENCE
			data[5] = mapPersonel.get(Integer.toString(whichPerson)).get(3);//DRIVER
			data[6] = mapPersonel.get(Integer.toString(whichPerson)).get(4);//CREW LEADER
			data[7] = mapPersonel.get(Integer.toString(whichPerson)).get(5);//KEY HOLDER
			data[8] = mapPersonel.get(Integer.toString(whichPerson)).get(6);//PHONE NUMBER
			data[9] = mapPersonel.get(Integer.toString(whichPerson)).get(7);//EMAIL
			data[10] = tssShort;
			
			while(i < data.length){
				System.out.println("data = " + data[i]);
				i += 1;
			}
			db.insert(tableName,column1Name,dataTypes,data);
			i = 0;
			maxValue += 1;
		}
		db.close();
	}
	
	private static void populateHashMap(){
		mapPersonel.put("1",person1);
		mapPersonel.put("2",person2);
		mapPersonel.put("3",person3);
		mapPersonel.put("4",person4);
		mapPersonel.put("5",person5);
		mapPersonel.put("6",person6);
		mapPersonel.put("7",person7);
		mapPersonel.put("8",person8);
		mapPersonel.put("9",person9);
		mapPersonel.put("10",person10);
		mapPersonel.put("11",person11);
		mapPersonel.put("12",person12);
		mapPersonel.put("13",person13);
	}
}
