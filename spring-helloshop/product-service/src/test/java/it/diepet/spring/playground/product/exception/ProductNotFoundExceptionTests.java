package it.diepet.spring.playground.product.exception;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ProductNotFoundExceptionTests {

	@Test
	public void constructors() {
		ProductNotFoundException ex = new ProductNotFoundException(123L);
		assertThat(ex.getMessage()).isEqualTo("Unable to find product having 123 as ID");
		assertThat(ex.getCause()).isNull();
		assertThat(ex.getCode()).isEqualTo("ProductNotFoundException");
		assertThat(ex.getProductId()).isEqualTo(123L);
	}

}
