package it.diepet.spring.playground.product.dto;

import java.io.Serializable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(toBuilder = true)
public class ProductDto implements Serializable {

	private static final long serialVersionUID = -5388628403814971317L;

	@NonNull
	private String code;

	@NonNull
	private String description;

}
