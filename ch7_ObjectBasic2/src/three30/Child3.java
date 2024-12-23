package three30;

public class Child3 extends Parent{

//*	super() - 부모 클래스의 생성자 호출
//	this()와 마찬가지로 super() 역시 생성자이다. 
//	this()는 같은 클래스의 다른 생성자를 호출하는 용도라면
//	super()는 조상 클래스를 호출하는데 사용된다
//	
//	생성자의 첫줄에서 부모 클래스의 생성자를 호출할 수 있는데
//	이유는 자식 클래스의 멤버가 부모 클래스의 멤버를 사용할 수도 있으므로
//	부모의 멤버들이 먼저 초기화되어 있어야 하기 때문이다
//	
//	Object 클래스를 제외한 모든 클래스의 생성자 첫 줄에는 생성자, this() 또는
//	super()을 호출해야 한다. 그렇지 않으면 컴파일러가 자동적으로
//	super()를 생성자의 첫 줄에 삽입한다
	
	
	
	int x = 20;
	
	Child3(){
		super();
	}
	
	void method() {
		System.out.println("x= " + x);
		System.out.println("this.x= " + this.x);
		System.out.println("super.x= " + super.x);
	}
	
}
