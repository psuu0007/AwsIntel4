package three15;

public class Tv {
	// TV 속성들(인스턴스 변수)
	boolean power;	//전원 상태 (on/off)
	int channel;

	
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
