package two64;

//기본형 매개변수
public class PrimitiveParamBasic1 {

	public static void main(String[] args) {
		
		Data d = new Data();
		
		d.x = 10;
		
		System.out.println("main: " + d.x);
		
		d.change(d.x);
		
		System.out.println("d.change(d.x); 이거 수행 후....");
		System.out.println("main: " + d.x);
		
	}
	
	
}
