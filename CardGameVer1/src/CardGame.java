
public class CardGame {

	public static void main(String[] args) {
		
		Card card = new Card();
		
		String cardStr = "";
		
//		card.init(0, 0);
		cardStr = card.getCard();
		System.out.println(cardStr);
		
		Card card2 = new Card(1, 6);
		
//		card2.init(1, 12);
//		card2.init();
		cardStr = card2.getCard();
		System.out.println(cardStr);
		
	}
	
	
}
