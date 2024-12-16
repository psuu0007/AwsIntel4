
//배열의 값 위치 변경
public class ArrayBasic199 {

	public static void main(String[] args) {

		int[] ballArr = new int[45];

//		1~45 값 저장
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i + 1;
		}

		// 내용 확인
		for (int i = 0; i < ballArr.length; i++) {
			System.out.print(ballArr[i] + "\t");
		}
		System.out.println();

//		두 값 변경하기 위해 만든 임시 변수
		int tempBall = 0;
//		배열의 인덱스에 임의 접근을 위한 변수
		int randNum = 0;

		// 배열의 값들을 자리바꿈 하기 위한 로직
		for (int i = 0; i < 6; i++) {
			randNum = (int) (Math.random() * 45);

			tempBall = ballArr[i];
			ballArr[i] = ballArr[randNum];
			ballArr[randNum] = tempBall;
		}

		// 내용 확인
//		for (int i = 0; i < ballArr.length; i++) {
//			System.out.print(ballArr[i] + "\t");
//		}
//		System.out.println();

		for (int i = 0; i < 6; i++) {
			System.out.print(ballArr[i] + "\t");
		}

	}

}
