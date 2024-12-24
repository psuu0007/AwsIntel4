package three68.basic;

public class Aircon extends Product{
	public Aircon() {
		super(500);
	}

//	어노테이션
	@Override
	public String toString() {
		return "에어콘";
	}
	
}
