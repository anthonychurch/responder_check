import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;



class MainApplication {
	public static TimerTask doSomeThing(){
		System.out.println("boo");
		return null;
	}

	public static void main(String[] args) {
		Timer timer = new Timer();
		Calendar date = Calendar.getInstance();
		date.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
   	 	date.set(Calendar.HOUR, 16);
   	 	date.set(Calendar.MINUTE, 0);
   	 	date.set(Calendar.SECOND, 0);
   		date.set(Calendar.MILLISECOND, 0);
   		// Schedule to run every Sunday in midnight
   		timer.schedule(doSomeThing(), date.getTime(),1000 * 60 * 60 * 24);
  	}
}