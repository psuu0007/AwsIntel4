
//문자열 특징
public class VarBasic34 {

	public static void main(String[] args) {
//					 문자
		char ch = 'J';
//						문자열
		String name = "Java";
		
		System.out.println(ch);
		System.out.println(name);
		
		ch = '킹';
		name = "포스트";
		
		System.out.println(ch);
		System.out.println(name);
		
		ch = 'a' + 'b';
//		ch = 'a' + 1;
		name = "포스트" + " 바이오틱스";
//		name = "포스트 바이오틱스";
		
		System.out.println(ch);
		System.out.println(name);
		
//		문자열 + any type -> 문자열 + 문자열 
//		-> 문자열
//		any type + 문자열 -> 문자열 + 문자열 
//		-> 문자열
		
		String str = "신기하네" + 0;
		System.out.println(str);
		
		str = 1.12 + str;
		System.out.println(str);
		
		
		
	}
	
}
