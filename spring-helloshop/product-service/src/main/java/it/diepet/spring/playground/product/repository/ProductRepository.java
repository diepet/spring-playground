package it.diepet.spring.playground.product.repository;

import org.springframework.data.repository.CrudRepository;

import it.diepet.spring.playground.product.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
