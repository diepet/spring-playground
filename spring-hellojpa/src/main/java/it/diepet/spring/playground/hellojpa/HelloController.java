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
    	
    	final Customer customer = new Customer();
    	customer.setFirstName("AAA");
    	customer.setLastName("BBB");
    	this.customerRepository.save(customer);
    	
    	Iterable<Customer> customers = this.customerRepository.findAll();
    	for (Customer currentCustomer : customers) {
    		LOGGER.info(currentCustomer.toString());
    	}
    	
        return "Greetings from Spring Boot!";
    }

}