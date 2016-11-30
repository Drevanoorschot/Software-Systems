package ss.week1;

public class Password {
	public static final String INITIAL = "testtest";
	public String password;
	public Password () {
		password = INITIAL;
	}
	public boolean acceptable(String suggestion) {
		return !(suggestion.length() <= 6 || suggestion.contains(" "));
	}
	public boolean testWord(String test) {
		return test.equals(password);
		
	}
	public boolean setWord(String oldpass, String newpass) {
		if (testWord(oldpass) && acceptable(newpass)) {
			password = newpass;
			return true;
		}
		else {
			return false;
		}
	}
	
}
