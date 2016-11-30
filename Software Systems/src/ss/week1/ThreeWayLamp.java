
package ss.week1;

//import static ss.week1.ThreeWayLamp.State.*;

public class ThreeWayLamp {
	public static void main(String[] args) {
		ThreeWayLamp lamp = new ThreeWayLamp ();
		System.out.println(lamp.getState());
	}
	public ThreeWayLamp () {
		currentState = State.OFF;
	}
	public static enum State {
		OFF, LOW, MEDIUM, HIGH
	}
	public State currentState;
	public void changeState (State input) {
		currentState = input;
	}
	public void reset () {
		currentState = State.OFF;
	}
	public State getState () {
		return (currentState);
	}
	
	
	//public int number = 9;
	//public int state = number % 4;
}
