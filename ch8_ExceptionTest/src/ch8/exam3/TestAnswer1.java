package ch8.exam3;

public class TestAnswer1 {

	public static void main(String[] args) {
		
		ChildAnswer2 child = new ChildAnswer2();
		
//		try {
//			child.add(10, 20);
//		} catch (InvalidNumberException ine) {
//			// TODO: handle exception
//			System.out.println(ine.getMessage());
//		} catch (NotANumberException nane) {
//			// TODO: handle exception
//			System.out.println(nane.getMessage());
//		}
		
		try {
			child.add(10, 20);
		} catch (InvalidNumberException | NotANumberException ine) {
			// TODO: handle exception
			System.out.println(ine.getMessage());
		}
		
		
	}
	
}
