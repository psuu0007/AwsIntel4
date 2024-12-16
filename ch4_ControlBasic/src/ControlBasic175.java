
// 반복문 - break문

import java.util.Scanner;

public class ControlBasic175 {

	public static void main(String[] args) {

//		switch문에서 배웠던 것이다. 모든 반복문에서
//		break문을 사용할 수 있다. 
//		break문은 자신이 포함된 가장 가까운 반복문을 벗어난다
//		주로 if문과 함께 사용되어 특정 조건을 만족하면 반복문을 벗어나도록 구현한다
		
		int input = 0;
		int answer = 0;
		
//		1~100사이의 임의의 수 반환
		answer = (int)(Math.random() * 100) + 1;
		Scanner scan = new Scanner(System.in);
		System.out.println(answer);
//		무한반복문
		while(true) {
			System.out.print("1과 100사이의 정수를 입력해주세요>");
			input = scan.nextInt();
			
			if(input > answer) {
				System.out.println(input + "보다 작은 수로 다시 시도하세요");
			}else if(input < answer) {
				System.out.println(input + "보다 큰 수로 다시 시도하세요");
			}else {
				System.out.println(input + "은 정답입니다.");
				System.out.println("ㅊㅋㅊㅋ");
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}
	
}
