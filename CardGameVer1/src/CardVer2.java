
public class CardVer2 extends Card{

	static String[] specialCardColor = {"W_", "Y_"};
	static String[] specialCardShape = {"Joker"};
	
	CardVer2(){
		super();
		init();
	}
	
	CardVer2(int colorIndex, int shapeIndex){
		init(colorIndex, shapeIndex);
	}
	
//	수동으로 카드 생성
	void init(int colorIndex, int shapeIndex) {
		card = specialCardColor[colorIndex] + specialCardShape[shapeIndex];
	}
	
//	자동으로 카드 생성
	void init() {
		int probaility = 0;
		int colorIndex = 0;
		int shapeIndex = 0;
		
		probaility = Card.shapeArr.length * Card.numberArr.length + 2;
		probaility = (int)(probaility * Math.random() + 1);
		
		if(probaility > 52) {
			colorIndex = (int)(Math.random() * specialCardColor.length);
			shapeIndex = (int)(Math.random() * specialCardShape.length);
			
			card = specialCardColor[colorIndex] + specialCardShape[shapeIndex];
		}else {
			super.init();
		}
		
	}
	
	String getCard() {
		return card;
	}
	
	
}
