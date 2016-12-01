package ss.week3.hotel;

import ss.week3.pw.*;

public class Password {
	//public static final String INITIAL = "test123";
	public String password;
	public String factoryPassword;
	public Checker checker;

	public Password(Checker checkerInput) {
		password = checkerInput.generatePassword();
		factoryPassword = checkerInput.generatePassword();
		checker = checkerInput;
	}

	public Password() {
		this(new BasicChecker());
	}

	// @pure
	public boolean testWord(String test) {
		return test.equals(password);

	}

	public boolean setWord(String oldpass, String newpass) {
		if (testWord(oldpass) && checker.acceptable(newpass)) {
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
