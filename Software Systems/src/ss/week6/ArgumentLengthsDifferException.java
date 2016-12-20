package ss.week6;

public class ArgumentLengthsDifferException extends WrongArgumentException {
	public ArgumentLengthsDifferException(String msg) {
		super(msg);
	}
	public ArgumentLengthsDifferException(int i, int j) {
		super("argument 1: " + i + "argument 2: " + j);
	}
}
