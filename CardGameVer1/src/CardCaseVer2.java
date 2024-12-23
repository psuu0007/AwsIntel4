
public class CardCaseVer2 extends CardCase{

	public CardCaseVer2() {
		
		numOfCardArr = (Card.shapeArr.length * Card.numberArr.length) 
			+ (CardVer2.specialCardColor.length * CardVer2.specialCardShape.length);
		
		cardArr = new Card[numOfCardArr];
		
		init();
		
	}
	
	void init() {
		int totalCnt = 0;
		
		for (int i = 0; i < Card.shapeArr.length; i++) {
			for (int n = 0; n < Card.numberArr.length; n++) {
				cardArr[totalCnt++] = new Card(i, n);
			}
		}
		
		for (int i = 0; i < CardVer2.specialCardColor.length; i++) {
			for (int n = 0; n < CardVer2.specialCardShape.length; n++) {
				cardArr[totalCnt] = new CardVer2(i, n);
				totalCnt++;
				
			}
		}
	}
	
//	카드 케이스 카드 보기
	void cardCaseInSide() {
		for (int i = 0; i < cardArr.length - 1; i++) {
			
			System.out.print(cardArr[i].getCard() + ", ");
			
			if((i+1) % 13 == 0) {
				System.out.println();
			}
			
		}
		
		System.out.println(cardArr[cardArr.length-1].getCard());
		
		System.out.println();
	}
	
}
