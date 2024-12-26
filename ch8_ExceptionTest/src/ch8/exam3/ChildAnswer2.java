package ch8.exam3;

public class ChildAnswer2 extends Parent{

	public ChildAnswer2() {
		// TODO Auto-generated constructor stub
	}
	
	public ChildAnswer2(int a, int b){
		super(a, b);
	}
	
	// 부모클래스의 void add(int a, int b)를 재정의 한다면?
	@Override
	void add(int a, int b) throws InvalidNumberException, NotANumberException {
		// TODO Auto-generated method stub
		
//		super.add(a, b);
		System.out.println("자식의: " + a + b);
		
	}
	
	
}
