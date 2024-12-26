package four27;

// 메서드에 예외 선언하기
public class MethodThrowsBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		결국 어느 곳에선가는 반드시 try-catch문으로 예외처리를 해주어야 한다
		
		Animal a = new Animal();
		
		try {
			a.method1();
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		
		Exception e = new Exception("분리?");
		
		e.printStackTrace();
		System.out.println(e.getMessage());
		
		
	}

}
