package ss.week7.threads;

public class TestConsole extends Thread {
	private String name;
	public static void main(String[] args) {
		TestConsole console1 = new TestConsole("1");
		TestConsole console2 = new TestConsole("2");
		console1.start();
		console2.start();
		

	}
	
	public TestConsole(String cn) {
		name = cn;
	}
	
	public void run() {
		sum();
	}
	private void sum() {
		int one = Console.readInt(getName() + ": get number 1?");
		int two = Console.readInt(getName() + ": get number 2?");
		int answer = one + two;
		Console.println(getName() + ": " + one + " + " + two + " = " + answer);
	}
}
