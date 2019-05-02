package it.diepet.spring.playground.product.dto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ProductDtoTests {

	@Test
	public void allFieldsPopulated() {
		ProductDto productDto = ProductDto.builder().code("AA").description("BB").build();
		assertThat(productDto).isNotNull();
		assertThat(productDto.getCode()).isEqualTo("AA");
		assertThat(productDto.getDescription()).isEqualTo("BB");
	}
	
	@Test
	public void copyFromToBuilder() {
		ProductDto productDto = ProductDto.builder().code("AA").description("BB").build();
		ProductDto productDtoCopy = productDto.toBuilder().build();
		assertThat(productDtoCopy).isNotNull();
		assertThat(productDtoCopy.getCode()).isEqualTo("AA");
		assertThat(productDtoCopy.getDescription()).isEqualTo("BB");
		
	}
	
	@Test(expected = NullPointerException.class)
	public void allMandatoryFieldsNullSafe() {
		ProductDto.builder().build();
	}
	
	@Test(expected = NullPointerException.class)
	public void codeNullSafe() {
		ProductDto.builder().code("AA").build();
	}

	@Test(expected = NullPointerException.class)
	public void descriptionNullSafe() {
		ProductDto.builder().description("BB").build();
	}

	
}
