package three68.basic;

public class Buyer {

	public int money = 1000;
	public int bonusPoint = 0;
	
//	모든 제품 구매
	public void buy(Product pro) {
		
		if(money < pro.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= pro.price;
		bonusPoint = bonusPoint + pro.bonusPoint;
		
		System.out.println(pro.toString() + "을/를 구입하셨습니다.");
	}
	
	
	
}
