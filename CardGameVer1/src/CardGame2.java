
public class CardGame2 {

	public static void main(String[] args) {
		
		CardCase cardCase = new CardCase();
		
		Card card = null;
		
		card = cardCase.pick(0);
		
//		System.out.println(card.getCard());
		
		Card card2 = null;
		
		card2 = cardCase.pick(51);
		
//		System.out.println(card2.getCard());
		
		cardCase.cardCaseInSide();
		
		cardCase.shuffle();
		
		cardCase.cardCaseInSide();
	}
	
	
}
