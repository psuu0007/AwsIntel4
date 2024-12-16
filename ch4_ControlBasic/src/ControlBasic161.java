
// 반복문 - 중첩 for문
public class ControlBasic161 {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 3; i++) {
			System.out.println("===" + i + "===");
			
			for (int n = 0; n < 2; n++) {
				System.out.print(n + ", ");
			}
			System.out.println();
			System.out.println();
		}
		
	}
	
}
