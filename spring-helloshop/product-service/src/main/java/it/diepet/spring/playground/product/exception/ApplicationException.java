package it.diepet.spring.playground.product.exception;

public abstract class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = 8706141496044634147L;

	public ApplicationException() {
		super();
	}

	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApplicationException(String message) {
		super(message);
	}

	public ApplicationException(Throwable cause) {
		super(cause);
	}

	public abstract String getCode();
	
}
