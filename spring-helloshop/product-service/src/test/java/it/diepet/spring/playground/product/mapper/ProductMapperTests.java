package it.diepet.spring.playground.product.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.mapstruct.factory.Mappers;

import it.diepet.spring.playground.product.dto.ProductDto;
import it.diepet.spring.playground.product.entity.Product;

public class ProductMapperTests {
	
	@Test
	public void mapProductDtoToProduct() {
		ProductDto productDto = ProductDto.builder().code("AA").description("BB").build();
		Product product = ProductMapper.INSTANCE.productDtoToProduct(productDto);
		assertThat(product).isNotNull();
		assertThat(product.getCode()).isEqualTo("AA");
		assertThat(product.getDescription()).isEqualTo("BB");
	}
	
	@Test
	public void mapProductToProductDto() {
		Product product = new Product();
		product.setId(1L);
		product.setCode("AA");
		product.setDescription("BB");
		ProductDto productDto = ProductMapper.INSTANCE.productToProductDto(product);
		assertThat(productDto).isNotNull();
		assertThat(productDto.getCode()).isEqualTo("AA");
		assertThat(productDto.getDescription()).isEqualTo("BB");
	}
	
	@Test 
	public void mapNullProductDtoToNullProduct() {
		assertThat(ProductMapper.INSTANCE.productDtoToProduct(null)).isNull();
	}
	
	@Test 
	public void mapNullProductToNullProductDto() {
		assertThat(ProductMapper.INSTANCE.productToProductDto(null)).isNull();
	}
		
}
