import java.sql.Timestamp;


public class RunGetCurrentTimeStamp {

	private static GetCurrentTimeStamp timeStamp = new GetCurrentTimeStamp();
	public static void main(String[] args) {
		Timestamp ts = timeStamp.get();
		String tss = ts.toString();
		String tssShort = tss.substring(0,19);
		System.out.println(tssShort);

	}

}
