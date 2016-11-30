package ss.week2;


public class NewLamp {
//	public static void main(String[] args) {
//		Lamp lamp = new Lamp ();
//		lamp.switchSetting();
//		System.out.println(lamp.getState());
//	}
	private State state;
	public enum State {
		OFF, LOW, MEDIUM, HIGH
	}
	
	//@ ensures  getState() == State.OFF;
	public NewLamp() {
		state = State.OFF;
	}
	/*@
	 ensures \old(getState()) == State.OFF ==> getState() == State.LOW;
	 ensures \old(getState()) == State.LOW ==> getState() == State.MEDIUM;
	 ensures \old(getState()) == State.MEDIUM ==> getState() == State.HIGH;
	 ensures \old(getState()) == State.HIGH ==> getState() == State.OFF;
	 */
	public void switchSetting() {
		switch (state) {
			case OFF: 
				state = State.LOW;
				break;
			case LOW:
				state = State.MEDIUM;
				break;
			case MEDIUM : 
				state = State.HIGH;
				break;
			case HIGH:
				state = State.OFF;
				break;
			default:
				assert false;
		}
	}
	//@ ensures getState() == State.OFF;
	public void reset() {
		state = State.OFF;
	}
	
	/*@ensures getState() == State.LOW ||
	  getState() == State.OFF ||
	  getState() == State.MEDIUM ||
	  getState() == State.HIGH;
	 */
	//@pure
	public State getState() {
		return this.state;
	}
}
