package four27;

public class Animal {

	void method1() throws ArithmeticException{
		System.out.println("void method1() throws Arithmetic");
		
		System.out.println(0/0);
	}
	
	
	void method2() {
		System.out.println("void method2() throws ArrayIndexOutOfBounds");
		
		int[] numArr = new int[0];
		
		try {
			numArr[0] = 1;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
