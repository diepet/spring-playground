package it.diepet.spring.playground.product.dto.error;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor(force = true, access = AccessLevel.PROTECTED)
@ToString
@EqualsAndHashCode(callSuper = true)
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Getter
@SuperBuilder(toBuilder = true)
public class ProductNotFoundErrorDto extends ApplicationErrorDto {

	private static final long serialVersionUID = -2369854438682213949L;

	String code = "product-not-found";
	
	long productId;
	
}
