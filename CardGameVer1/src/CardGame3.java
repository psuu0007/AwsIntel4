
public class CardGame3 {

	public static void main(String[] args) {

		CardVer2 cv = new CardVer2();
		
		cv.init(0, 0);
		
		System.out.println(cv.getCard());
		
		cv.init();
		
		System.out.println(cv.getCard());
		
		CardCaseVer2 ccv = new CardCaseVer2();
		ccv.cardCaseInSide();
		
		ccv.shuffle();
		
		ccv.cardCaseInSide();
		
//		ccv -> ???? 카드 정보를 출력할 수 있나?
//		다이아몬드의 정보를 모두 출력하시오
		
	}
	
	
}
