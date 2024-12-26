package four14;

public class TryCatchBasic7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
//			System.out.println(0/0);
			System.out.println(4);
			
		} catch (NullPointerException ane) {
			System.out.println("이건 null과 관련된 예외처리가 있는 클래스야");
			System.out.println(5);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("이건 수학과 관련된 예외처리가 있는 클래스야");
			System.out.println(6);
		}
		finally {
			System.out.println(7);
			System.out.println("난 finally야");
		}
		
		System.out.println(8);
		
		
	}

}
