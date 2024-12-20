
public class Card {

	static String[] shapeArr = {"♥", "◆", "♠", "♣"};
	static String[] numberArr = {
		"A", "2", "3", "4", "5", "6", "7", "8", "9"
		, "T", "J", "Q", "K"   	
	};
	
	String card = "";
	
	Card(){
		init();
	}
	
	Card(int shapeIndex, int numberIndex){
		init(shapeIndex, numberIndex);
	}
	
//	수동으로 카드 생성
	void init(int shapeIndex, int numberIndex) {
		card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}
	
//	자동으로 카드 생성
	void init() {
		int shapeIndex = (int)(Math.random() * shapeArr.length); // 모양 랜덤 선택
		int numberIndex = (int)(Math.random() * numberArr.length); // 숫자 랜덤 선택
		
		card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}
	
	String getCard() {
		return card;
	}
	
	
}
