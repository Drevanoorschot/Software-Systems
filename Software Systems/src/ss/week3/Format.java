package ss.week3;

public class Format {
	public static void main(String[] args) {
		printLine("test", 45.32);
		printLine("tet", 45.32);
		printLine("tes", 5.32);
		printLine("test3", 445.32);
		printLine("tsadfst", 4345.32);
		printLine("tett", 45.32);
	}
	
	public static void printLine(String text, double amount) {
		System.out.println(String.format("%1$-20s %2$8s", text, amount));
	}
}
