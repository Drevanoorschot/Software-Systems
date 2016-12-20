package ss.week6;

public class WrongArgumentException extends Exception {
	public WrongArgumentException(String msg) {
		super(msg);
	}
	public WrongArgumentException() {
		super();
	}
}
