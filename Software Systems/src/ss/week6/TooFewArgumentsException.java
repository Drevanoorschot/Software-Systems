package ss.week6;

public class TooFewArgumentsException extends WrongArgumentException {
	
	public TooFewArgumentsException(String msg) {
		super(msg);
	}
	public TooFewArgumentsException() {
		super("Too few arguements");
	}
}
