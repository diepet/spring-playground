package it.diepet.spring.playground.product.dto.error;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ProductNotFoundErrorDtoTests {

	@Test
	public void allFieldsPopulated() {
		ProductNotFoundErrorDto productNotFoundErrorDto = ProductNotFoundErrorDto.builder()
				.productId(1L)
				.message("Some message")
				.build();
		assertThat(productNotFoundErrorDto.getCode()).isEqualTo("product-not-found");		
		assertThat(productNotFoundErrorDto.getProductId()).isEqualTo(1L);		
		assertThat(productNotFoundErrorDto.getMessage()).isEqualTo("Some message");		
	}

	@Test
	public void messageNullable() {
		ProductNotFoundErrorDto productNotFoundErrorDto = ProductNotFoundErrorDto.builder()
				.productId(1L)
				.build();
		assertThat(productNotFoundErrorDto.getCode()).isEqualTo("product-not-found");		
		assertThat(productNotFoundErrorDto.getProductId()).isEqualTo(1L);		
		assertThat(productNotFoundErrorDto.getMessage()).isNull();		
	}

	@Test
	public void productIdDefaultValue() {
		ProductNotFoundErrorDto productNotFoundErrorDto = ProductNotFoundErrorDto.builder()
				.build();
		assertThat(productNotFoundErrorDto.getProductId()).isEqualTo(0L);		
	}
	
}
