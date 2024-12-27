package five85;

public class Tv {
	// TV 속성들(멤버변수)
	public String color;
	public boolean power;
	public int channel;

	// TV 기능들
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
	
}
