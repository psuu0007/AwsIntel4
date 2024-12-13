package ana;

import java.util.Scanner;
//학점을 구해주는 프로그램: 조건1. 키보드 입력으로 학점 받음/ 
//점수가 100~90점-A 89~80-B 79~70- C 그외-F
//조건2. 출력형태: "89점은 B학점입니다."

public class ControlTest141_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;

		System.out.print("점수입력: ");

		Scanner sc = new Scanner(System.in);

		score = sc.nextInt();

		if(score > 100 || score < 0) {
			System.out.println(score+"은 잘못 입력되었습니다.");
		}
		
		if (score >= 90) {
			System.out.println(score + "은 A학점입니다.");
		}else if (score >= 80) {
			System.out.println(score + "은 B학점입니다.");
		}else if (score >= 70) {
			System.out.println(score + "은 C학점입니다.");
		}else {
			System.out.println(score + "은 F학점입니다.");
		}

	}

}
