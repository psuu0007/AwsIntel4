
public class Tv2 {
	
	String color;
	boolean power;
	int channel;
	int volume = 0;

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
