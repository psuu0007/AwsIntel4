
//93페이지 까지의 내용
public class OperatorTest87 {

	public static void main(String[] args) {
//		증감연산자
//		단항연산자 ++, --
		
//		증가연산자++: 피연산자의 값을 1 증가시킨다
//		감소연산자--: 피연산자의 값을 1 감소시킨다
		
		int n = 0;
//		후위형 방식: 값이 참조된 후에 증가시킨다
		n++;
		System.out.println(n);
//		n = n - 1;
		n--;
		n--;
		System.out.println(n);
		
//		전위형 방식: 값이 참조되기 전에 증가시킨다
		++n;
		System.out.println(n);
		
	}
	
}
