package it.diepet.spring.playground.product.exception;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ProductNotFoundExceptionTests {

	@Test
	public void constructors() {
		ProductNotFoundException ex;
		NullPointerException npe;
		
		ex = new ProductNotFoundException();
		assertThat(ex.getMessage()).isNull();
		assertThat(ex.getCause()).isNull();
		assertThat(ex.getCode()).isEqualTo("ProductNotFoundException");
		
		ex = new ProductNotFoundException("some message");
		assertThat(ex.getMessage()).isEqualTo("some message");
		assertThat(ex.getCause()).isNull();
		assertThat(ex.getCode()).isEqualTo("ProductNotFoundException");
		
		npe = new NullPointerException("test (message, cause) constructor");
		ex = new ProductNotFoundException("some other message", npe);
		assertThat(ex.getMessage()).isEqualTo("some other message");
		assertThat(ex.getCause()).isEqualTo(npe);
		assertThat(ex.getCode()).isEqualTo("ProductNotFoundException");

		npe = new NullPointerException("test (cause) constructor");
		ex = new ProductNotFoundException(npe);
		assertThat(ex.getCause()).isEqualTo(npe);
		assertThat(ex.getCode()).isEqualTo("ProductNotFoundException");
		
	}

}
