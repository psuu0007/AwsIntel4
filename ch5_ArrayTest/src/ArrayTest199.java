
//로또 6자리 뽑기
public class ArrayTest199 {

	public static void main(String[] args) {

//		1	2	3	4	5	
//		6	7	8	9	10	
//		11	12	13	14	15	
//		16	17	18	19	20	
//		21	22	23	24	25	
//		26	27	28	29	30	
//		31	32	33	34	35	
//		36	37	38	39	40	
//		41	42	43	44	45	
		
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
