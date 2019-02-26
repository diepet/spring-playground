package it.diepet.spring.playground.hellojpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.diepet.spring.playground.hellojpa.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	 List<Customer> findByLastName(String lastName);
	
}
