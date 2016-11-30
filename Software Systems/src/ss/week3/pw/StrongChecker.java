package ss.week3.pw;

public class StrongChecker extends BasicChecker {
	@Override
	public boolean acceptable(String password) {
		return (super.acceptable(password) && Character.isLetter(password.charAt(0)) && Character.isDigit(password.charAt(password.length()-1)));
		
	}
	@Override
	public String generatePassword() {
		return "testtest123";
	}
	
}
