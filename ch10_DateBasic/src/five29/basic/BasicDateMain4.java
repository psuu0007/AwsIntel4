package five29.basic;

import java.util.Calendar;

public class BasicDateMain4 {

	
	public static void main(String[] args) {
	
		Calendar startDate = Calendar.getInstance();
		
		Calendar endDate = Calendar.getInstance();
		
		endDate.set(Calendar.HOUR, 18);
		endDate.set(Calendar.MINUTE, 45);
		endDate.set(Calendar.SECOND, 0);
		
		long difference = 
			Math.abs(endDate.getTimeInMillis() - startDate.getTimeInMillis()) 
			/ 1000;
		
		System.out.println(difference);
		
//		단위
		
	}
	
}
