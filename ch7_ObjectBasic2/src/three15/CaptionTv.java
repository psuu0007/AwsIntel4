package three15;

public class CaptionTv extends Tv{
	
	boolean caption = false;
	
	// 자막기능 같은거라 생각하자
	void displayCaption(String text) {
		
		if(caption == true) {
			System.out.println(text);
		}
		
	}
	
	
	
}
