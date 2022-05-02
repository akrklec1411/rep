package hr.fer.oop;

public class IncorrectArgumentNumberException extends ParseReadingException {
	
	public IncorrectArgumentNumberException() {
	}
	
	public IncorrectArgumentNumberException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public IncorrectArgumentNumberException(Throwable cause) {
		super(cause);
	}

	private static final long serialVersionUID = 1L;
	
	
}
