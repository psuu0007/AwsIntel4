
//VarBasic23

public class VarBasic23 {

	public static void main(String[] args) {
		int x = 10;
		int y = 200;
		
			
		System.out.println("x: " + x + "/ y: " + y);
		
		int temp = 0;
		temp = x;
		x = y;
//		y = x;
		y = temp;
		
		System.out.println("x: " + x + "/ y: " + y);
	}
	
}
