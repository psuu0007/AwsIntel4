package ana;

// 반복문 - for문 while문 차이
public class ForWhileComp2 {

	public static void main(String[] args) {

//		while문으로만 구현
//		1부터 100까지 전부 더하는데
//		짝수만 더한다
//		
//		누적합: ????
		int x = 0;
		int y = 0;

		while (x < 100) {
			x++;
			if (x % 2 == 0) {
				y = y + x;
			}
		}
		System.out.println("누적합 : " + y);

	}

}
