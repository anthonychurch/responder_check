import java.sql.Timestamp;


public class checkTime {

	private static int timeStep = 30;
	public static void main(String[] args) {
		GetCurrentTimeStamp timeStamp = new GetCurrentTimeStamp();
		//Get timestamp and remove the nano seconds
		Timestamp ts = timeStamp.get();
		String tss = ts.toString();
		String tssShort = tss.substring(0,19);
		System.out.println("ADVICE :: timeStamp = " + tssShort);
	}

}
