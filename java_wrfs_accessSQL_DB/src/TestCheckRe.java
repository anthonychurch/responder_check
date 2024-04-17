
public class TestCheckRe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sentence = "Re: test string";
		String[] re = {"Re:","RE:","re:","rE:"};
		String s = StringUtilities.checkForPrefix("Re: re:      test string",re);
		int r = sentence.lastIndexOf("Re:");
		//System.out.println(r);
		//System.out.println(s);
		String t = "Java is a wonderful language";
		//System.out.println(s);
		//System.out.println("lastIndexOf(a, 19) = " + t.lastIndexOf('a', 19));
		///System.out.println("lastIndexOf(97, 19) = " + t.lastIndexOf(97, 19));
		System.out.println(t);

	}

}
