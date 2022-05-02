package hr.fer.oop;

public abstract class ParseReadingException extends Exception{

	public ParseReadingException(Throwable cause) {
		this.cause = cause;
	}
	
	public ParseReadingException() {
	}
	
	private Throwable cause;
	public ParseReadingException(String msg, Throwable cause) {
		super(msg);
		this.cause = cause;
	}
	
	
	public Throwable getCause() {
		return cause;
	}
	private static final long serialVersionUID = 1L;
	
	

}
