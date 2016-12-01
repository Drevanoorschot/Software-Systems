package ss.week2.hotel;
import ss.week3.pw.*;

public class Password {
	public static final String INITIAL = "testtest123";
	public String password;
	public String factoryPassword;
	public Checker checker;
	public Password(Checker checkerInput) {
		factoryPassword = INITIAL;
		checker = checkerInput;
	}
	public Password() {
		new Password(new BasicChecker());
	}
	public boolean acceptable(String suggestion) {
		return !(suggestion.length() <= 6 || suggestion.contains(" "));
	}
	//@pure
	public boolean testWord(String test) {
		return test.equals(password);
		
	}
	public boolean setWord(String oldpass, String newpass) {
		if (testWord(oldpass) && acceptable(newpass)) {
			password = newpass;
			return true;
		} else {
			return false;
		}
	}
	public Checker getChecker() {
		return checker;
	}
	public String getFactoryPassword() {
		return factoryPassword;
	}
	
}
