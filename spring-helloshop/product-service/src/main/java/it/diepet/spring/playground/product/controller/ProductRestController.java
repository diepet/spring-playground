package it.diepet.spring.playground.product.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.diepet.spring.playground.product.entity.Product;
import it.diepet.spring.playground.product.exception.ProductNotFoundException;
import it.diepet.spring.playground.product.repository.ProductRepository;

@RestController
public class ProductRestController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping("/product")
	public List<Product> listAll() {
		return StreamSupport.stream(productRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}
	
	@RequestMapping("/product/{productId}")
	public Product getProduct(@PathVariable("productId") final long productId) {
		final Optional<Product> product = productRepository.findById(productId);
		return product.orElseThrow(() -> new ProductNotFoundException(String.format("Unable to find product having %d as ID", productId)));
	}
	
}
