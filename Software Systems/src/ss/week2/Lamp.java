package ss.week2;


public class Lamp {
//	public static void main(String[] args) {
//		Lamp lamp = new Lamp ();
//		lamp.switchSetting();
//		System.out.println(lamp.getState());
//	}
	private int state;
	//@ ensures  getState() == "OFF";
	public Lamp() {
		state = 0;
	}
	//@ ensures getState() == getState() + 1;
	/*@ ensures getState() == "OFF" || getState() == "LOW" 
	 || getState() == "MEDIUM" ||getState() == "HIGH";
	 */
	public void switchSetting() {
		state++;
		state = state % 4;
	}
	//@ ensures getState() == "OFF";
	public void reset() {
		state = 0;
	}
	//@pure
	//ensures 0 == "OFF";
	//ensures 1 == "LOW";
	//ensures 2 == "MEDIUM";
	//ensures 3 == "HIGH";
	//ensures "no state" >= 4 && "no state" <= -1;
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
