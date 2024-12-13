// 조건문 if-else-if
package ana;


public class ControlTest140 {

	public static void main(String[] args) {

//		양수와 음수, 0을 구하는 
//		프로그램을 구현하시오

//		출력형태
//		1인 경우
//		1 - 양수
//		
//		-30인 경우
//		-30 - 음수
//		
//		0인 경우
//		0 - 0 이라고 출력하시오
		int x = 0;

		if (x > 0) {
			System.out.println(x + " - 양수");
		} else if (x < 0) {
			System.out.println(x + " - 음수");
		} else if (x == 0) {
			System.out.println(x + " - 0");
		}

	}

}
