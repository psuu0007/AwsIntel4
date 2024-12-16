
// 삼항연산자
import java.util.Scanner;

public class OperatorBasic130 {

	public static void main(String[] args) {

		
		int x = 0;
		int y = 0;
		int result = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 개 숫자 입력해");
		x = scan.nextInt();
		y = scan.nextInt();
	
//		표현식
//				 조건식 ?    식1(참)   : 식2(거짓)
		result = (x > y) ? x - y : y - x;
		
		System.out.println("큰 수에서 작은 수를 뺀 결과: " + result);
		
	}
	
}
