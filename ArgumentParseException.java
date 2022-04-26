package hr.fer.oop;

public class ArgumentParseException extends Exception {

	private static final long serialVersionUID = 1L;
	private Throwable cause;
	
	public ArgumentParseException(String message, Throwable cause) {
		super(message);
		this.cause = cause;
	}
	
	public Throwable getCause() {
		return this.cause;
	}
}
