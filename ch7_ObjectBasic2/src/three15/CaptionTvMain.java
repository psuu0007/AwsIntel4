package three15;

public class CaptionTvMain {
	
	public static void main(String[] args) {

		CaptionTv captionTv = new CaptionTv();
		
		captionTv.channel = 10;
		
		captionTv.channelUp();
		System.out.println(captionTv.channel);
		
		captionTv.displayCaption("Hello World"); 
		
		captionTv.caption = true;
		captionTv.displayCaption("Hello World2");
		
	}
	
	
}
