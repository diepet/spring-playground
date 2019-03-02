package it.diepet.spring.playground.hellojpa.repository;

import org.springframework.data.repository.CrudRepository;

import it.diepet.spring.playground.hellojpa.entity.Location;

public interface LocationRepository extends CrudRepository<Location, Long> {
	
	Location findByCity(String city);

}
