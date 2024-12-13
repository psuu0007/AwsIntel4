// 삼항연산자
package ana;

import java.util.Scanner;

public class OperatorTest130Ans2 {
	
	public static void main(String[] args) {

//		키보드 입력을 하나 받는다
//		그 값이 0보다 큰 수라면 양수
//		0보다 작은 수라면 음수 라고 출력하는 프로그램을 만드시오
//		
//		출력형태
//		10인 경우
//		입력값 : 10 - > 양수
//		
//		-1인 경우
//		입력값 : -1 - > 음수
		
		int num = 0;
		String result = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 하나를 입력하시오.");
		
		num = scan.nextInt();
		result = num > 0 ? "양수" : "음수";
		
		result = num == 0 ? "0" : result;
		
		System.out.println("입력값: " + result);
	}

}