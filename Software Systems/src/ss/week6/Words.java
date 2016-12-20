package ss.week6;

import java.util.Scanner;

public class Words {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean outerloop = true;
		while (outerloop) {
			System.out.println("Line (or \"end\"):");
			int i = 1;
			String line = scanner.nextLine();
			Scanner scan = new Scanner(line);
			if (line.startsWith("end")) {
				outerloop = false;
				System.out.println("End of Programme");
			}
			while (scan.hasNext() && outerloop) {
				String word = scan.next();
				System.out.println("Word " + i + ": " + word);
				i++;
			}
			scan.close();
		}
		scanner.close();
	}
}
