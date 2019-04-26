package it.diepet.spring.playground.product.exception;

public class ProductNotFoundException extends ApplicationException {

	private static final long serialVersionUID = -6993605929420837668L;

	public ProductNotFoundException() {
		super();
	}

	public ProductNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProductNotFoundException(String message) {
		super(message);
	}

	public ProductNotFoundException(Throwable cause) {
		super(cause);
	}

	@Override
	public String getCode() {
		return this.getClass().getSimpleName();
	}

}
