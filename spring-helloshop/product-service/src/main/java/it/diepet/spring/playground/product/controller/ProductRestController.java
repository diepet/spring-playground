package it.diepet.spring.playground.product.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.diepet.spring.playground.product.entity.Product;
import it.diepet.spring.playground.product.repository.ProductRepository;

@RestController
public class ProductRestController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping("/product")
	public List<Product> listAll() {
		return StreamSupport.stream(productRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

}
