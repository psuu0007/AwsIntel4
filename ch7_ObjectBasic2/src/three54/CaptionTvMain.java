package three54;

//다형성(polymorphism)
//다형성은 상속과 깊은 관계가 있다
//다형성이란 여러가지 형태를 가질 수 있는 능력을 의미하며
//자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 함으로써
//다형성을 프로그램적으로 구현하였다
//
//*부모 클래스 타입의 참조변수로 자식 클래스의 인스턴스를 참조할 수 있도록 하였다는 것이다
//
//참조변수가 사용할 수 있는 멤버의 개수는 인스턴스의 멤버 개수보다 같거나 적어야 한다
public class CaptionTvMain {
	
	public static void main(String[] args) {

		Tv tv = new Tv();
		
		CaptionTv c = new CaptionTv();
		
		// 부모 타입의 참조변수로 자식 클래스의 인스턴스를 참조하는 것 가능
		Tv tv2 = new CaptionTv();
		
		tv2.channelUp();
		
		// 자식 타입의 참조변수로 부모 타입의 인스턴스를 참조할 수는 없다
//		CaptionTv c2 = new Tv();
		
		
		
	}
	
	
}
