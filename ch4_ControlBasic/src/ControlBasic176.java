
// 반복문 - continue문
public class ControlBasic176 {

	public static void main(String[] args) {

//		continue문은 반복문 내에서만 사용될 수 있으며,
//		반복이 진행되는 도중에 continue를 만나면
//		반복문의 끝으로 이동하여 다음 반복으로 넘어간다
		
		for (int i = 0; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}
	
}
