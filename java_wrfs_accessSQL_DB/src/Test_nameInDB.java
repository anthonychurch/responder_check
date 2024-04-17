
public class Test_nameInDB {
	public static void main(String[] arg){
	
		String[] re = {"re "};
		String[] dbNames = {"Nathan Ross New"};
		String[] messageN = {"re Na.than. Ross New code 1",""};
	
		String[] msd = MessageUtilities.getCodeMessageDetails(messageN, dbNames, re);
		System.out.println("msd[0] = " + msd[0]);
		System.out.println("msd[1] = " + msd[1]);
		System.out.println("msd[2] = " + msd[2]);
		System.out.println("msd[3] = " + msd[3]);
		System.out.println("msd[4] = " + msd[4]);
		
		String p = StringUtilities.getPrefix(messageN[0], "code");
		System.out.println("p = " + p);
	}
}
