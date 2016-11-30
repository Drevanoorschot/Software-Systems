package ss.week3.pw;

public class BasicChecker implements Checker {
	public boolean acceptable(String password) {
		return (password.length() > 5 && !(password.contains(" ")));
	}
	public String generatePassword() {
		return "testtest";
	}
}
