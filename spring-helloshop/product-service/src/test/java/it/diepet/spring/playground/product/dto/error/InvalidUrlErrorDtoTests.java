package it.diepet.spring.playground.product.dto.error;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class InvalidUrlErrorDtoTests {

	@Test
	public void allFieldsPopulated() {
		InvalidUrlErrorDto invalidUrlErrorDto = InvalidUrlErrorDto.builder()
				.method("POST")
				.url("/someurl")
				.message("Some message")
				.build();
		assertThat(invalidUrlErrorDto.getCode()).isEqualTo("invalid-url");
		assertThat(invalidUrlErrorDto.getMethod()).isEqualTo("POST");		
		assertThat(invalidUrlErrorDto.getUrl()).isEqualTo("/someurl");		
		assertThat(invalidUrlErrorDto.getMessage()).isEqualTo("Some message");		
	}

	@Test
	public void nullableFields() {
		InvalidUrlErrorDto invalidUrlErrorDto = InvalidUrlErrorDto.builder()
				.build();
		assertThat(invalidUrlErrorDto.getCode()).isEqualTo("invalid-url");
		assertThat(invalidUrlErrorDto.getMethod()).isNull();
		assertThat(invalidUrlErrorDto.getUrl()).isNull();	
		assertThat(invalidUrlErrorDto.getMessage()).isNull();
	}
	
}
