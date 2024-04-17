import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class TestMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> places = new ArrayList<String>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));

		HashMap mapA = new HashMap();
		ArrayList list = new ArrayList();
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		mapA.put("1",list);
		mapA.put("2",places);
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(((ArrayList<String>) mapA.get("1")).get(0));
		System.out.println(mapA.get("2"));
		String one = "Anthony";
		String two = "anthony";
		int test = one.compareToIgnoreCase(two);
		System.out.println("test = " + test);
		String message = "Anthony Church Code 1";
		String[] splitMessage = message.split("\\s+");
		for(String txt : splitMessage)
			//if("Anthony" != null){
			if(txt != null){
				System.out.println(txt + null);
			}
		String pre = StringUtilities.getPrefix(message, " ode ");
		System.out.println("pre = " + pre);
		
		int a = 1;
		int b = 1;
		if((a == 1) && (b == 1)){
			System.out.println("go");
		}
	}

}
