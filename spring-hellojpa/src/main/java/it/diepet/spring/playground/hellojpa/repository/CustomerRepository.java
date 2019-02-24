package it.diepet.spring.playground.hellojpa.repository;

import org.springframework.data.repository.CrudRepository;

import it.diepet.spring.playground.hellojpa.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
