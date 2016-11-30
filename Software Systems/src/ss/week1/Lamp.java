package ss.week1;


public class Lamp {
//	public static void main(String[] args) {
//		Lamp lamp = new Lamp ();
//		lamp.switchSetting();
//		System.out.println(lamp.getState());
//	}
	private int state;
	public Lamp() {
		state = 0;
	}
	public void switchSetting() {
		state++;
		state = state % 4;
	}
	public void reset() {
		state = 0;
	}
	public String getState() {
		switch (state) {
			case 0: 
				return "OFF";
			case 1: 
				return "LOW";
			case 2: 
				return "MEDIUM";
			case 3: 
				return "HIGH";
			default:
				return "no state";
		}
	}
}
