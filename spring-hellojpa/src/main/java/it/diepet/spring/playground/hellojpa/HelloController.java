package it.diepet.spring.playground.hellojpa;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.diepet.spring.playground.hellojpa.entity.Customer;
import it.diepet.spring.playground.hellojpa.repository.CustomerRepository;

@RestController
public class HelloController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
	private CustomerRepository customerRepository;

    @RequestMapping("/")
    public String index() {
    	
    	this.customerRepository.save(new Customer("AAA", "BBB"));
    	
    	Iterable<Customer> customers = this.customerRepository.findAll();
    	for (Customer customer : customers) {
    		LOGGER.info(customer.toString());
    	}
    	
        return "Greetings from Spring Boot!";
    }

}