package etc;

import java.util.Calendar;

public class CalendarApi {

	public void calendar(int year, int month) {
		String w = "일\t월\t화\t수\t목\t금\t토";
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month - 1, 1);
		
		System.out.printf("\t\t %d년 %d월 \n", year, month);
		System.out.println(w);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 1~7 요일
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);  // 마지막날
		
		for (int i = 1; i < dayOfWeek; i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <= lastDay; i++) {
			System.out.print(i + "\t");
			if((i + dayOfWeek - 1) % 7 == 0) {
				System.out.println();
			}
		}
		
		Calendar afterCal = Calendar.getInstance();
		
		afterCal.set(year, month, 1);

		System.out.println();
		System.out.println();
	}
	
	public void yearFullView(int year) {
		
		for (int i = 0; i < 12; i++) {
			calendar(year, i+1);
		}
		
	}
	
}
