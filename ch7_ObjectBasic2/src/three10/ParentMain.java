package three10;

public class ParentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Parent();
		Child c = new Child();
		Child2 c2 = new Child2();
		
		p.age = 1;
		
		c.age = 2;
//		c.name = "";
		System.out.println(c.age);
		
//		System.out.println(c.name);
		c.play();
		
		c2.age = 3;
		c2.name = "child2임";
		c2.play();
		
		GrandChild gc = new GrandChild();
		
		gc.age = 4;
		gc.play();
		
	}

}
