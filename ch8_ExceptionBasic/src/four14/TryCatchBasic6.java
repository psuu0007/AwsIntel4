package four14;

public class TryCatchBasic6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
			
		} catch (ArithmeticException | NullPointerException ane) {
//			ane.printStackTrace();
			// TODO: handle exception
			System.out.println("이건 수학과 관련된 예외처리가 있는 클래스야");
			System.out.println("이건 null과 관련된 예외처리가 있는 클래스야");
			System.out.println(5);
		} catch (Exception e) {
//			e.printStackTrace();
			// TODO: handle exception
			System.out.println("이건 모든 예외를 처리가능한 클래스야");
			System.out.println("수학에서 난 오류야");
			System.out.println(7);
		} 
		
		System.out.println();
		
		
	}

}
