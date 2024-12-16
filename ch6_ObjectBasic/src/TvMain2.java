
public class TvMain2 {

	public static void main(String[] args) {
		
		Tv tv;
//		System.out.println(tv);
		
		tv = new Tv();
		
		Tv tv2 = new Tv();
		
		tv.channel = 7;
		tv.channelDown();
		tv2.channel = 17;
		tv2.channelUp();
		
		System.out.println("현재 채널은 " + tv.channel + " 입니다.");
		System.out.println("현재 채널은 " + tv2.channel + " 입니다.");
		
		
		
	}
	
}
