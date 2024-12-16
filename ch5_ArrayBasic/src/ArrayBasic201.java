
// 정렬
public class ArrayBasic201 {

	public static void main(String[] args) {

		int[] scoreArr = {
			15, 11, 1, 3, 8, 27
		};

		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + "\t");
		}
		System.out.println();
		
		int temp = 0;
		int cnt = 0;
		boolean check = false;
		for (int i = 0; i < scoreArr.length-1; i++) {
			check = false;
			
			for (int n = 0; n < scoreArr.length-1-i; n++) {
				if(scoreArr[n] > scoreArr[n+1]) {
					temp = scoreArr[n];
					scoreArr[n] = scoreArr[n+1];
					scoreArr[n+1] = temp;
					
					check = true;
				} // for n end
				cnt++;
				
//				자리 변경이 더 이상 없는거 같다
				if(check == false) {
					break;
				}
			}
		} //for i end
		
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + "\t");
		}
		System.out.println();
		System.out.println(cnt);
	}

}
