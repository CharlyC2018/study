package exception;

@SuppressWarnings("serial")
public class IllegalAgeException extends Exception {
	public IllegalAgeException() {
	}

	public IllegalAgeException(String message) {
		super(message);
	}
}