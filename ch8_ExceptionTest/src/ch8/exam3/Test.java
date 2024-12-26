package ch8.exam3;

public class Test {

	public static void main(String[] args) {
		
		Child child = new Child();
		
//		이곳에서 오류를 해결하려면 어떻게 해야할까?
		try {
			child.add(10, 20);
		} catch (InvalidNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			예외발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다
		} catch (NotANumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
