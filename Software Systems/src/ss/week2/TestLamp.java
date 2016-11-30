package ss.week2;


public class TestLamp {
	public static void main(String[] args) {
		new TestLamp().runTest();
	}
	private void runTest() {
		lamp = new NewLamp();
		testInitialState();
		testSwitchSetting();
		testReset();
	}
	public NewLamp lamp;
	private void testInitialState() {
		System.out.println("testInitialState:");
		System.out.println(
				lamp.getState() == NewLamp.State.OFF);
	}
	private void testSwitchSetting() {
		lamp.switchSetting();
		System.out.println("testSwitchSetting:");
		System.out.println(
				lamp.getState() == NewLamp.State.LOW);
	}
	private void testReset() {
		lamp.reset();
		System.out.println("testReset:");
		System.out.println(
				lamp.getState() == NewLamp.State.OFF);
	}
}
