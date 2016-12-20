package ss.week6;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What are your names?");
		while (in.hasNext()) {
			System.out.println("Hello " + in.next());
		}
	}
}
