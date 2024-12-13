package ana;

//중첩 for문으로 구현해보자
public class ControlTest163_2Ans {

	public static void main(String[] args) {
//		출력형태
//		2 * 1 = 2	3 * 1 = 3							9 * 1 = 9
//		2 * 2 = 4	3 * 2 = 6							9 * 2 = 18
//		2 * 3 = 6	3 * 3 = 9							9 * 3 = 27
//		,,,			,,,			,,,		,,,
//		2 * 9 = 18	3 * 9 = 27							9 * 9 = 81							
		
		
		for (int i = 2; i <= 9; i++) {
//			System.out.print("큰for " + 2 +"*"  + i + " = " + 2*i + "\n");			
			for (int x = 1; x <= 9; x++) {
				System.out.print(i + " * " + x + " = " + i * x + "\t");
			}
			System.out.println();
		}
		
	}
	
}
