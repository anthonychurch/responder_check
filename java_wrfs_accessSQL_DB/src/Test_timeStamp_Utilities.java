import java.text.DateFormatSymbols;
import java.util.Calendar;

public class Test_timeStamp_Utilities {
	public static String convertToTimeStamp(int value){
    	//1000 = 1 second or in hours/minutes/seconds = 00:00:01
    	//This method only deals with whole seconds, therefore value will be rounded up to 
    	//the nearest 1000
    	//Simplify the calculations for value
    	value = value / 1000;
    	int getHours = 0;
    	int getMinutes = 0;
    	int getSeconds = 0;
    	
    	String getHoursString = "00";
    	String getMinutesString = "00";
    	String getSecondsString = "00";
    	//Test to see if is greater than 24 hours :: 3600,000 (1 hour) x 24 = 86400,000 seconds or 24 hours
    	if(value > 86400){
    		value = value - 86400;
    	}
    	//GET HOURS, MINUTES AND SECONDS	
    	//Test to see if is greater than 60 minutes :: 60,000 (1 minute) x 60 = 3600,000 seconds or 1 hour
    	if(value > 3599){
    		getHours = value / 3600;
    		getMinutes = (value - (getHours * 3600))/60;
    		getSeconds = (value - (getHours * 3600))-(getMinutes*60);
    		if(getMinutes > 60){
    			getHours = getHours + (getMinutes/60);
    			getMinutes = getMinutes - ((getMinutes/60) * 60);
    		}
    		if(getSeconds > 60){
    			getMinutes = getMinutes + (getSeconds/60);
    			getSeconds = getSeconds - ((getSeconds/60) * 60);
    		}
    	//GET MINUTES AND SECONDS ONLY	
    	//Test to see if is greater than 60 seconds :: 1000 x 60 = 60 seconds or 1 minute
    	}else if(value > 59){
    		getMinutes = value / 60 ;
    		getSeconds = value - (getMinutes * 60);
    		if(getSeconds > 60){
    			getMinutes = getMinutes + (getSeconds/60);
    			getSeconds = getSeconds - ((getSeconds/60) * 60);
    		}
    	}else{
    		getSeconds = value;
    	}
    	if(getHours<10){
    		getHoursString = "0" + Integer.toString(getHours);
    	}else{getHoursString = Integer.toString(getHours);};
    	
    	if(getMinutes<10){
    		getMinutesString = "0" + Integer.toString(getMinutes);
    	}else{getMinutesString = Integer.toString(getMinutes);};
    	
    	if(getSeconds<10){
    		getSecondsString = "0" + Integer.toString(getSeconds);
    	}else{getSecondsString = Integer.toString(getSeconds);};
    	
      	return getHoursString + ":" + getMinutesString + ":" + getSecondsString;
    }
	
	public static String getTimeStampSeconds(GetCurrentTimeStamp timeStamp){
    	String timeStampString = timeStamp.get().toString();
    	timeStampString = timeStampString.substring(0,19);
    	return timeStampString;
    }
	
	public static int[] getMinutes(int current, int back){
		System.out.println("getMinutes() : current = " + current);
		System.out.println("getMinutes() : back = " + back);
		int[] retrunArray = new int[2];
		int temp = current - back;
		System.out.println("getMinutes() : temp = " + temp);
		if(temp < 0){
			int tempHour = 0;
			int tempMinutes = Math.abs(temp)%60;
			System.out.println("getMinutes() : tempMinutes = " + tempMinutes);
			tempHour += Math.abs(temp)/60;
			System.out.println("getMinutes() : tempHour = " + tempHour);
			retrunArray[0] = tempHour; 
			retrunArray[1] = tempMinutes;
		}else{
			retrunArray[0] = 0; 
			retrunArray[1] = temp;
		}
		return retrunArray;
	}
	
	public static int[] getHours(int current, int back){
		int[] retrunArray = new int[2];
		int temp = current - back;
		System.out.println("getHours() : temp = " + temp);
		if(temp < 0){
			int tempDays = 0;
			int tempHours = Math.abs(temp)%24;
			System.out.println("getHours() 1 : tempHours = " + tempHours);
			tempHours = 24 - tempHours;
			tempDays += Math.abs(temp)/24;
			System.out.println("getHours() : tempDays = " + tempDays);
			retrunArray[0] = tempDays; 
			retrunArray[1] = tempHours;
		}else{
			retrunArray[0] = 0; 
			retrunArray[1] = temp;
		}
		return retrunArray;
	}
	
	public static int[] getDays(int current, int back, int currentMonth, int currentYear){
		int[] returnArray = new int[2];
		int day = current - back;
		System.out.println("day = " + day);
		System.out.println("back = " + back);
		System.out.println("current = " + current);
		//int day = temp;
		int month = currentMonth;
		if(day < 0){
			month = month - 1;
			if(month <= 0){
				month = 12 - Math.abs(month);
				System.out.println("month = " + month);
			}
			int getMaxDays = getDaysInMonth(month, currentYear);
			day = getMaxDays - Math.abs(day);
			System.out.println("day = " + day);
		}
		returnArray[0] = month;
		returnArray[1] = day;
		return returnArray;
	}
	
	public static int getDaysInMonth(int month, int year){
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, 2);
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		return days;
	}
	
	public static String prefixZero(int n){
		System.out.println("n = " + n);
		if(n < 10){
			return "0" + Integer.toString(n);
		}
		return Integer.toString(n);
	}
	
	public static String backdate(String currentTS, String backDateTime){
		//String backDateTS = currentTS.substring(0,11);
		System.out.println("backDateTime = " + backDateTime);
		
		System.out.println("current hour = " + currentTS.substring(11,13));
		System.out.println("current min = " + currentTS.substring(14,16));
		System.out.println("current sec = " + currentTS.substring(17,19));
		
		System.out.println("current month = " + currentTS.substring(5,7));
		System.out.println("current day = " + currentTS.substring(8,10));
		System.out.println("current year = " + currentTS.substring(0,4));
		
		System.out.println("back hour = " + backDateTime.substring(0,2));
		System.out.println("back min = " + backDateTime.substring(3,5));
		System.out.println("back sec = " + backDateTime.substring(6,8));
		
		int currentMonth = Integer.parseInt(currentTS.substring(5,7));
		int currentDay = Integer.parseInt(currentTS.substring(8,10));
		int currentYear = Integer.parseInt(currentTS.substring(0,4));
		
		int currentHour = Integer.parseInt(currentTS.substring(11,13));
		int currentMinutes = Integer.parseInt(currentTS.substring(14,16));
		//int currentSeconds = Integer.parseInt(currentTS.substring(17,19));
		
		int backHour = Integer.parseInt(backDateTime.substring(0,2));
		int backMinutes = Integer.parseInt(backDateTime.substring(3,5));
		//int backSeconds = Integer.parseInt(backDateTime.substring(6,8));
		
	
		//int newSeconds;
		int[] minutes = getMinutes(currentMinutes, backMinutes);
		int[] hours = getHours(currentHour, backHour + minutes[0]);
		int[] days = getDays(currentDay, hours[0], currentMonth, currentYear);
		System.out.println("minutes[] = " + minutes[0] + " : " + minutes[1]);
		System.out.println("hours[] = " + hours[0] + " : " + hours[1]);
		System.out.println("days[] = " + days[0] + " : " + days[1]);
		
		//String newYear = ;
		String newMonth = prefixZero(days[0]);
		String newDay = prefixZero(days[1]);
		String newHour = prefixZero(hours[1]);
		String newMinute = prefixZero(minutes[1]);
			
		String newTimeStamp = 
				currentYear + "-" +
				newMonth + "-" +
				newDay + " " +
				newHour + ":" +
				newMinute + ":00";
		
		return newTimeStamp;
	}
	public static void main(String[] arg){
		//long when = 217284;
		int timeCap = 259200000 * 2;
		int when = 317284*1000;//86400000 = 24 hours;
		if(when > timeCap){
			System.out.println("Date too old");
		}else{
			System.out.println(6%4);
			//String backTime = convertToTimeStamp(when);
			String backTime = "64:08:04";
			System.out.println("when = " + convertToTimeStamp(when));
			GetCurrentTimeStamp timeStamp = new GetCurrentTimeStamp();
			//String tss = getTimeStampSeconds(timeStamp);
			//System.out.println("tss = " + tss);
			String tss = "2012-05-18 23:58:39";
			String backDate = backdate(tss, backTime);
			System.out.println("backDate = " + backDate);
		}
		
	}
}
