import java.util.Random;


public class TestRandom {

	public static void main(String[] args) {
		Random r = new Random();
		int i = r.nextInt(3)+1;
		if(i == 2){
			System.out.println("i equaled 2!!");
			i = r.nextInt(3)+1;
		}
		System.out.println(i);

	}

}
