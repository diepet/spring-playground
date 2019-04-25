package it.diepet.spring.playground.product.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import it.diepet.spring.playground.product.dto.ProductDto;
import it.diepet.spring.playground.product.entity.Product;

@Mapper
public interface ProductMapper {

	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
	
	Product productDtoToProduct(ProductDto productDto);

	default ProductDto productToProductDto(Product p) {
		if (p == null)
			return null;
		return ProductDto.builder().code(p.getCode()).description(p.getDescription()).build();
	}

}
