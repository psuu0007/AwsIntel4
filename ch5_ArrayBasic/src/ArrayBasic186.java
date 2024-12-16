

public class ArrayBasic186 {

	public static void main(String[] args) {
		
//		int s1 = 10;
//		int s2 = 20;
//		int s3 = 30;
//		int s4 = 40;
//		
//		s1 = s1 + 5;
//		s2 = s2 + 5;
//		s3 = s3 + 5;
//		s4 = s4 + 5;
//		
//		System.out.println("1번 국어점수 " + s1);
//		System.out.println("2번 국어점수 " + s2);
//		System.out.println("3번 국어점수 " + s3);
//		System.out.println("4번 국어점수 " + s4);
		
		int[] scoreArr = new int[4];
//		System.out.println(scoreArr);
		scoreArr[0] = 10;
		scoreArr[1] = 20;
		scoreArr[2] = 30;
//		scoreArr[3] = 40;
		
//		scoreArr[0] = scoreArr[0] + 5;
//		scoreArr[1] = scoreArr[1] + 5;
//		scoreArr[2] = scoreArr[2] + 5;
//		scoreArr[3] = scoreArr[3] + 5;
		
		for (int i = 0; i < scoreArr.length; i++) {
			scoreArr[i] = scoreArr[i] + 5;
		}
		
//		System.out.println("1번 국어점수 " + scoreArr[0]);
//		System.out.println("2번 국어점수 " + scoreArr[1]);
//		System.out.println("3번 국어점수 " + scoreArr[2]);
//		System.out.println("4번 국어점수 " + scoreArr[3]);
	
//		for (int i = 0; i < 4; i++) {
//			System.out.println((i+1) + "번 국어점수 " + scoreArr[i]);
//		}
		
		System.out.println(scoreArr.length);
		
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.println((i+1) + "번 국어점수 " + scoreArr[i]);
		}
		
	}
	
}
