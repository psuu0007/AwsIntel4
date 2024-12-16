
public class TvMain {

	public static void main(String[] args) {
		
		Tv tv;
		tv = new Tv();
		
//		System.out.println(tv.color);
//		System.out.println(tv.power);
//		System.out.println(tv.channel);
		
		tv.channel = 7;
		tv.channelDown();
		
		System.out.println("현재 채널은 " + tv.channel + " 입니다.");
		
	}
	
}
