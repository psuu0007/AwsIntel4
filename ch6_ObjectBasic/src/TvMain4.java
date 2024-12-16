
//객체들의 복제 방법
public class TvMain4 {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		Tv tv2 = new Tv();
		
		System.out.println("tv 채널은 " + tv.channel + " 입니다.");
		System.out.println("tv2 채널은 " + tv2.channel + " 입니다.");
		
		tv.channel = 7;
		tv.color = "검은색";
		
		tv2.channel = tv.channel;
		tv2.color = tv.color;
		
		System.out.println("tv 채널은 " + tv.channel + " 입니다.");
		System.out.println("tv 채널은 " + tv.color + " 입니다.");
		System.out.println("tv2 채널은 " + tv2.channel + " 입니다.");
		System.out.println("tv2 채널은 " + tv2.color + " 입니다.");
		
		tv.color = "흰색";
		tv2.channel = 17;
		System.out.println("복제 이후 값 변경");
		System.out.println();
		
		System.out.println("tv 채널은 " + tv.channel + " 입니다.");
		System.out.println("tv 채널은 " + tv.color + " 입니다.");
		System.out.println("tv2 채널은 " + tv2.channel + " 입니다.");
		System.out.println("tv2 채널은 " + tv2.color + " 입니다.");
		
		
		
	}
	
}
