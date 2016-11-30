package ss.week1;

public class Student {

	public static void main(String[] args) {
		Student student = new Student ();
		System.out.println(student.score);
		student.passed ();
	}
	private int score;
	public Student () {
		System.out.println("Score:");
		score = 70;
	}
	public boolean passed () {
		return score >= 70;
	}
		
}
