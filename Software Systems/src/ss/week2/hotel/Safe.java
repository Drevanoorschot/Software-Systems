package ss.week2.hotel;

public class Safe {
	public Password password;
	private boolean open;
	private boolean active;
	public  Safe safe;
	
	public Safe() {
		open = false;
		active = false;
		password = new Password();
	}
	//@ requires password != null;
	//@ ensures password.testWord(input) || \old(isActive()) ==> isActive() == true;
	public void activate(String input) {
		//assert password.testWord(input) == true;
		if (getPassword().testWord(input)) {
			active = true;
		} else {
			return;
		}
	}
	//@ ensures isOpen() == false && isActive() == false;
	public void deactivate() {
		active = false;
	}
	//@ requires password != null;
	/*@ ensures (\old(isActive()) == true && getPassword().testWord(pw) == true) || 
	  isOpen() == true ==> isOpen() == true;
	 */
	public void open(String pw) {
		//assert isActive() == true;
		if (isActive() && getPassword().testWord(pw)) {
			open = true;
		} else {
			return;
		}
	}
	//@ ensures isOpen() == false;
	public void close() {
		open = false;
	}
	//@ pure
	public boolean isActive() {
		return active;
	}
	//@ pure
	public boolean isOpen() {
		return open;
	}
	//@ pure
	public Password getPassword() {
		return password;
	}
	
}
