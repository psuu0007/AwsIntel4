package four14;

public class TryCatchBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;
		int result = 0;
//		ArithmeticException
		
		try {
			for (int i = 0; i < 10; i++) {
				result = num / (int)(Math.random() * 10);
				System.out.println((i + 1) + ": " + result);
			}
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
//			System.out.println(num + "/ 를 수행하다가 0으로 나누다 보니 ");
//			System.out.println("10번 수행을 하지 못함");
			System.out.println(0);
			
		}
		
//		System.out.println(234 / 0);
		
		
		
	}

}
