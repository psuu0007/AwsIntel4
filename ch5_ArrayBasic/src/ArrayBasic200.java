
// 정렬
public class ArrayBasic200 {

	public static void main(String[] args) {

		int[] scoreArr = {
			15, 11, 1, 3, 8	
		};

		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + "\t");
		}
		System.out.println();
		
		int temp = 0;
		int cnt = 0;
		for (int i = 0; i < scoreArr.length; i++) {
			for (int n = 0; n < scoreArr.length; n++) {
				if(scoreArr[i] > scoreArr[n]) {
					temp = scoreArr[i];
					scoreArr[i] = scoreArr[n];
					scoreArr[n] = temp;
				}
				cnt++;
			}
		} //for i end
		
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + "\t");
		}
		System.out.println();
		System.out.println(cnt);
	}

}
