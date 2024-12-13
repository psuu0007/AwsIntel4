
// 반복문 - for
package ana;

public class ControlTest159 {
	
	public static void main(String[] args) {
		
//		12345 라고 출력하고
//		
//		1부터 1까지의 합: 1 
//		1부터 2까지의 합: 3
//		1부터 3까지의 합: 6
//		,
//		,
//		1부터 5까지의 합: 15 1+2+3+,,,
		
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		int n = 0;
		
		for(int i = 1; i <= 5; i++) {
			n=n+ i;
//			0=0+1
//			1=1+2
//			3=3+3
//			6=6+4
			
			System.out.println("1부터 " + i + "까지의 합: " + n);
		}
		
	}
	
}

