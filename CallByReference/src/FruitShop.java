
public class FruitShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit apple = new Fruit();
		apple.name = "사과";
		
		People psu = new People();
		String str = "";
		
		psu.name = "박성욱";
		
		psu.getFruit(apple);
		
		str = psu.toString();
		
		System.out.println(str);
		
		//중요한 점
		System.out.println(apple.name);
	}

}
