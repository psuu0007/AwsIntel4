// while문 분석
package ana;


public class ControlTest171 {

	public static void main(String[] args) {

//		int sum = 0;
//		int n = 0;
//
//		while ((sum = sum + ++n) <= 100) {
//			System.out.println(n + " - " + sum);
//		}

		int sum = 0;
		int n = 1;

		while (true) {
			sum = sum + n; // sum = sum + ++n
			
			if (sum > 100) { // 종료 조건
				break;
			}
			
			System.out.println(n + " - " + sum);
			n++;
		}

	}

}
