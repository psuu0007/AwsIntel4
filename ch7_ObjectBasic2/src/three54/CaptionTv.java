package three54;

public class CaptionTv extends Tv{
	
	boolean caption = false;
	String text;
	
	// 자막기능 같은거라 생각하자
	void displayCaption(String text) {
		
		if(caption == true) {
			System.out.println(text);
		}
		
	}
	
	void caption() {
		System.out.println("캡션 시작");
	}
	
}
