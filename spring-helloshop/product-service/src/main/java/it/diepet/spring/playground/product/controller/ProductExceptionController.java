package it.diepet.spring.playground.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import it.diepet.spring.playground.product.dto.error.InvalidUrlErrorDto;
import it.diepet.spring.playground.product.dto.error.ProductNotFoundErrorDto;
import it.diepet.spring.playground.product.exception.ProductNotFoundException;

@ControllerAdvice
public class ProductExceptionController {

	@ExceptionHandler(ProductNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public ProductNotFoundErrorDto productNotFoundHandler(ProductNotFoundException ex) {
		return ProductNotFoundErrorDto.builder()
				.productId(ex.getProductId())
				.message(ex.getMessage())
				.build();
	}
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public InvalidUrlErrorDto noHandlerFoundHandler(NoHandlerFoundException ex) {
		return InvalidUrlErrorDto.builder()
				.url(ex.getRequestURL()).method(ex.getHttpMethod())
				.message(String.format("Invalid URL [%s %s]", ex.getHttpMethod(), ex.getRequestURL()))
				.build();
	}

}
