package ch8.exam1;
public class ExceptionExam1_2 {
	public static void main(String[] args) {
		boolean b = true;
		b = method(b);
		b = method(b);
		// 실행 결과는 어떻게 될까?
	} // main
	static boolean method(boolean b) {
		try {
			System.out.println(1);
			if (b){
				throw new RuntimeException();
			}
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return true;
		} catch (Exception e) {
			System.out.println(4);
			return false;
		} finally {
			System.out.println(5);
			return false;
		}
//		System.out.println(6);
	}

}
