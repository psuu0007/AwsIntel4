
public class CardCase {

	int numOfCardArr = Card.shapeArr.length * Card.numberArr.length;
	
	Card cardArr[] = new Card[numOfCardArr];
	
	public CardCase() {
		int totalCnt = 0;
		
		for (int i = 0; i < Card.shapeArr.length; i++) {
			for (int n = 0; n < Card.numberArr.length; n++) {
				cardArr[totalCnt] = new Card(i, n);
				totalCnt++;
			}
		} // i for end
	}
	
	// 지정된 위치 카드 뽑기
	Card pick(int index) {
		return cardArr[index];
	}
	
	Card pick() {
		
		int index = (int)(Math.random() * numOfCardArr);
		
		return pick(index);
	}
	
//	카드 섞기
	void shuffle() {
		int randNum = 0;
		Card tempCard = null; 
				
		for (int i = 0; i < cardArr.length; i++) {
			randNum = (int)(Math.random() * numOfCardArr);
			
			tempCard = cardArr[i];
			cardArr[i] = cardArr[randNum];
			cardArr[randNum] = tempCard;
		}
	}
	
	
//	카드 케이스 카드 보기
	void cardCaseInSide() {
		for (int i = 0; i < numOfCardArr; i++) {
			
			String myCard = "";
			myCard = cardArr[i].getCard();
			
			if(i != numOfCardArr - 1) {
				myCard = myCard + ", ";
			}
			
			System.out.print(myCard);
			if((i + 1) % 13 == 0) {
				System.out.println();
			}
			
			
		}
		System.out.println();
	}
	
}
