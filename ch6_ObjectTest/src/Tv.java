
public class Tv {
	// TV 속성들(멤버변수)
	String color;
	boolean power;
	int channel;

	// TV 기능들
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
}
