package it.diepet.spring.playground.product.controller;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.diepet.spring.playground.product.repository.ProductRepository;

@RestController
public class ProductRestController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping("/")
	public String index() {
		return "Greetings from Product Service!";
	}

	@RequestMapping("/product")
	public String listAll() {
		String products = StreamSupport.stream(productRepository.findAll().spliterator(), false).map(product -> product.toString())
				.collect(Collectors.joining(",", "[", "]"));
		return products;
	}

}
