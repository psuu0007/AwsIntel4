
//배열 선언 방법들
public class ArrayBasic189 {

	public static void main(String[] args) {
		
//		1번
		int[] numArr = new int[3];
		
		
//		2번
		int[] numArr2 = new int[] {
			1, 2, 3, 4, 5	
		};
		
//		3번 데이터베이스
		int[] numArr3 = {
			1, 2, 3, 4, 5	
		};		
		
		System.out.println(numArr3[2]);
		
		// 오류
//		int[] numArr4 = new int[3];
//		numArr4 = {1, 2, 3};
	}
	
}
