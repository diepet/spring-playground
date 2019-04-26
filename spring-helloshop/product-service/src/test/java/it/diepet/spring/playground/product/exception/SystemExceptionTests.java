package it.diepet.spring.playground.product.exception;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SystemExceptionTests {
	
	@Test
	public void constructors() {
		NullPointerException npe;
		SystemException sex;
		
		npe = new NullPointerException("test (cause) constructor");
		sex = new SystemException(npe);
		assertThat(sex.getCause()).isEqualTo(npe);
		assertThat(sex.getErrorId()).isNotNull().matches("[0-9a-f]{8}-[0-9a-f]{4}-[34][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}");

		npe = new NullPointerException("test (message,cause) constructor");
		sex = new SystemException("some message", npe);
		assertThat(sex.getMessage()).isEqualTo("some message");
		assertThat(sex.getCause()).isEqualTo(npe);
		assertThat(sex.getErrorId()).isNotNull().matches("[0-9a-f]{8}-[0-9a-f]{4}-[34][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}");
				
	}
	
	@Test(expected = NullPointerException.class) 
	public void nullCauseForConstructorHavingCauseArg() {
		new SystemException(null);
	}

	@Test(expected = NullPointerException.class) 
	public void nullCauseForConstructorHavingMessageCauseArgs() {
		new SystemException("some message", null);
	}
	
}
