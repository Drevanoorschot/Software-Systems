package ss.week1;

public class TestLamp {
	public static void main(String[] args) {
		new TestLamp().runTest();
	}
	private void runTest() {
		lamp = new Lamp();
		testInitialState();
		testSwitchSetting();
		testReset();
	}
	public Lamp lamp;
	private void testInitialState() {
		System.out.println("testInitialState:");
		System.out.println(
				lamp.getState() == "OFF");
	}
	private void testSwitchSetting() {
		lamp.switchSetting();
		System.out.println("testSwitchSetting:");
		System.out.println(
				lamp.getState() == "LOW");
	}
	private void testReset() {
		lamp.reset();
		System.out.println("testReset:");
		System.out.println(
				lamp.getState() == "OFF");
	}
}
