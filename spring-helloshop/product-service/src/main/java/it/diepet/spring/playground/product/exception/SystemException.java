package it.diepet.spring.playground.product.exception;

import java.util.UUID;

public class SystemException extends RuntimeException {

	private static final long serialVersionUID = 7547886798332201043L;

	private final String errorId = UUID.randomUUID().toString();

	public SystemException(String message, Throwable cause) {
		super(message, cause);
		checkNullCause();
	}

	public SystemException(Throwable cause) {
		super(cause);
		checkNullCause();
	}

	private void checkNullCause() {
		if (getCause() == null) {
			throw new NullPointerException("A system exception cannot have a null cause");
		}
	}
	
	public String getErrorId() {
		return errorId;
	}

}
