package it.diepet.spring.playground.product.dto;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductDTOTests {

	@Test
	public void populateAllFields() {
		final ProductDTO productDTO = ProductDTO.builder().code("AA").description("BB").build();
		assertEquals("AA", productDTO.getCode());
		assertEquals("BB", productDTO.getDescription());
	}
	
	@Test(expected = NullPointerException.class)
	public void codeNullSafe() {
		ProductDTO.builder().code("AA").build();
	}

	@Test(expected = NullPointerException.class)
	public void descriptionNullSafe() {
		ProductDTO.builder().description("BB").build();
	}

}
