package it.diepet.spring.playground.product.dto.error;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SystemErrorDtoTests {

	@Test
	public void allFieldsPopulated() {
		SystemErrorDto systemErrorDto = SystemErrorDto.builder()
				.errorId("df616cc3-da18-4209-b953-ada5f8fb984b")
				.message("Some message")
				.build();
		assertThat(systemErrorDto.getCode()).isEqualTo("system-error");
		assertThat(systemErrorDto.getErrorId()).isEqualTo("df616cc3-da18-4209-b953-ada5f8fb984b");
		assertThat(systemErrorDto.getMessage()).isEqualTo("Some message");
		
	}

	@Test
	public void messageNullable() {
		SystemErrorDto systemErrorDto = SystemErrorDto.builder()
				.errorId("2b54a6d6-c82a-4fd0-80f9-58616d24c5c8")
				.build();
		assertThat(systemErrorDto.getCode()).isEqualTo("system-error");
		assertThat(systemErrorDto.getErrorId()).isEqualTo("2b54a6d6-c82a-4fd0-80f9-58616d24c5c8");
		assertThat(systemErrorDto.getMessage()).isNull();
		
	}

	@Test(expected = NullPointerException.class)
	public void errorIdNullSafe() {
		SystemErrorDto.builder().build();
	}
		
}
