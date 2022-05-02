package hr.fer.oop;

public class ReadingFormatException extends ParseReadingException {

	private static final long serialVersionUID = 1L;
	
	public ReadingFormatException() {
	}
	
	public ReadingFormatException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
	public ReadingFormatException(Throwable cause) {
		super(cause);
	}

}
