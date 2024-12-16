
public class TvMain3 {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		Tv tv2 = new Tv();
		
		System.out.println("tv 채널은 " + tv.channel + " 입니다.");
		System.out.println("tv2 채널은 " + tv2.channel + " 입니다.");
		
		tv.channel = 7;
		tv2 = tv;
		
		System.out.println("tv 채널은 " + tv.channel + " 입니다.");
		System.out.println("tv2 채널은 " + tv2.channel + " 입니다.");
		
		tv2.channel = 17;
		System.out.println("tv2의 채널을 17로 변경했다?");
		
		System.out.println("tv 채널은 " + tv.channel + " 입니다.");
		System.out.println("tv2 채널은 " + tv2.channel + " 입니다.");
		
		
		
	}
	
}
