package three30;

public class SuperMain1 {

	public static void main(String[] args) {
		
//		*super
//		슈퍼는 자식 클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데
//		사용되는 참조변수이다. 멤버변수와 지역변수의 이름이 같을 때 this를 
//		사용해서 구별했듯이 상속받은 멤버와 자신의 클래스에 정의된 멤버의 이름이
//		같을 때는 super를 사용해서 구별할 수 있다
		
		Child c = new Child();
		c.method();
		System.out.println();
		
		
		Child2 child2 = new Child2();
		child2.method();
	}
	
}
