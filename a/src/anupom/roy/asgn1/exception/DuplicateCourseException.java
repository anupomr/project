package anupom.roy.asgn1.exception;

public class DuplicateCourseException extends Exception {
	private static final long serialVersionUID = 1L;

	public DuplicateCourseException() {

	}

	public DuplicateCourseException(String message) {
		super(message);

	}

	public DuplicateCourseException(Throwable cause) {
		super(cause);

	}

	public DuplicateCourseException(String message, Throwable cause) {
		super(message, cause);

	}

	public DuplicateCourseException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
