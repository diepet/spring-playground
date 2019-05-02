package it.diepet.spring.playground.product.exception;

public class ProductNotFoundException extends ApplicationException {

	private static final long serialVersionUID = -6993605929420837668L;

	final private long productId;
	
	public ProductNotFoundException(final long productId) {
		super(String.format("Unable to find product having %d as ID", productId));
		this.productId = productId;
	}

	public long getProductId() {
		return productId;
	}
	
	@Override
	public String getCode() {
		return this.getClass().getSimpleName();
	}

}
