package two64;

// 참조형 매개변수
public class ReferenceParamBasic1 {

	public static void main(String[] args) {
		
		Data2 d = new Data2();
		
		d.x = 90;
		
		System.out.println("main: " + d.x);
		
		d.change(d);
		
		System.out.println("d.change(d.x); 이거 수행 후....");
		System.out.println("main: " + d.x);
		
	}
	
	
}
