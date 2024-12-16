
//절차지향? 비객체지향?
public class TimeMain1 {

	public static void main(String[] args) {

		int h = 0;
		int m = 0;
		int s = 0;

		h = 2;
		m = 52;
		s = 26;

		int jh = h;
		int jm = m;
		int js = s;

		int ush = h + 13;
		int usm = m;
		int uss = s;

		System.out.println("한국 시간");
		System.out.println(h + " : " + m + " : " + s);

		System.out.println("일본 시간");
		System.out.println(jh + " : " + jm + " : " + js);

		System.out.println("미국 시간");
		System.out.println(ush + " : " + usm + " : " + uss);

	}

}
