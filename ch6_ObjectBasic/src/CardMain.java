
public class CardMain {

	public static void main(String[] args) {
		
		System.out.println("카드.witdh: " + Card.width);
		System.out.println("카드.height: " + Card.height);
		
		Card c1 = new Card();
		
		c1.kind = "heart";
		c1.number = 7;
		
		Card c2 = new Card();
		
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.print("c1은 " + c1.kind + ", " + c1.number + "이며 ");
		System.out.println("크기는 " + c1.width + ", " + c1.height);
		System.out.print("c2은 " + c2.kind + ", " + c2.number + "이며 ");
		System.out.println("크기는 " + c2.width + ", " + c2.height);
		
		c1.width = 50;
		Card.height = 80;
		
		System.out.println();
		System.out.print("c1은 " + c1.kind + ", " + c1.number + "이며 ");
		System.out.println("크기는 " + c1.width + ", " + c1.height);
		System.out.print("c2은 " + c2.kind + ", " + c2.number + "이며 ");
		System.out.println("크기는 " + c2.width + ", " + c2.height);
		
	}
	
	
}
