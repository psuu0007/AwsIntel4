package ana;


import java.util.Scanner;

// 삼항연산자
public class OperatorTest130Ans1 {

	public static void main(String[] args) {

//		키보드 입력을 하나 받는다
//	      그 값이 0보다 큰 수라면 양수
//	      0보다 작은 수라면 음수 라고 출력하는 프로그램을 만드시오
//	      
//	      출력형태
//	      10인 경우
//	      입력값: 10 -> 양수
//	      
//	      -1인 경우
//	      입력값: -1 -> 음수
	
		int x = 0;
		String result = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 하나를 입력하세요");
		
		x = scan.nextInt();
//		중첩 삼항연산자
		result = x ==  0 ? "0" : (x > 0 ? "양수" : "음수");
		
		System.out.println(x + "는 " + result);
		
		
	}
	
}
