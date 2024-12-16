
// 2차원 배열

public class ArrayBasic217 {

	public static void main(String[] args) {

//		다차원 배열, 가변 배열
		int[][] numArr = {
			{
				1, 2, 3
			},
			{
				10, 50, 100
			},
			{
				10, 50
			}
			
		};
		
		System.out.println(numArr.length);
		System.out.println(numArr[0].length);
		
		for (int i = 0; i < numArr.length; i++) {
			for (int n = 0; n < numArr[i].length; n++) {
				System.out.print(numArr[i][n] + "\t");
			}
			System.out.println();
		}
		
	}

}
