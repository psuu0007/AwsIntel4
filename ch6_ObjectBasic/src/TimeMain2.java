
//객체지향?
public class TimeMain2 {

	public static void main(String[] args) {

		int h = 0;
		int m = 0;
		int s = 0;

		h = 2;
		m = 52;
		s = 26;
		
		Time koreaTime = new Time();
		Time japanTime = new Time();
		Time usaTime = new Time();

		koreaTime.hour = h;
		koreaTime.minute = m;
		koreaTime.second = s;
		
		h = 2;
		m = 52;
		s = 26;
		
		japanTime.setHour(h);
		japanTime.setMinute(m);
		japanTime.setSecond(s);
		
		h = 15;
		m = 52;
		s = 26;
		
		usaTime.setHour(h);
		usaTime.setMinute(m);
		usaTime.setSecond(s);
		
		System.out.println("한국 시간");
		System.out.println(koreaTime.hour + " : " + koreaTime.minute 
			+ " : " + koreaTime.second);

		System.out.println("일본 시간");
		System.out.println(japanTime.hour + " : " + japanTime.minute 
			+ " : " + japanTime.second);

		System.out.println("미국 시간");
		System.out.println(usaTime.getHour() + " : " + usaTime.getMinute() 
			+ " : " + usaTime.getSecond());

	}

}
