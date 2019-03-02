package it.diepet.spring.playground.hellojpa.shell;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import it.diepet.spring.playground.hellojpa.entity.Customer;
import it.diepet.spring.playground.hellojpa.entity.Location;
import it.diepet.spring.playground.hellojpa.repository.CustomerRepository;
import it.diepet.spring.playground.hellojpa.repository.LocationRepository;

@ShellComponent
public class AppCommands {

	private static final String LOCATION_GROUP = "Location Commands";
	private static final String CUSTOMER_GROUP = "Customer Commands";

	@Autowired
	private LocationRepository locationRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@ShellMethod(value = "Add location", group = LOCATION_GROUP)
	public String addLocation(final String city) {
		final Location location = new Location();
		location.setCity(city);
		final Location locationSaved = locationRepository.save(location);
		return "Created location: " + locationSaved.toString();
	}

	@ShellMethod(value = "List all locations", group = LOCATION_GROUP)
	public String listLocations() {
		final List<Location> locations = new ArrayList<>();
		locationRepository.findAll().forEach(locations::add);
		return locations.stream()
				.map(Object::toString)
				.collect(Collectors.joining("\n"));
	}
	
	@ShellMethod(value = "Add customer", group = CUSTOMER_GROUP)
	public String addCustomer(final String firstName, final String lastName, final String city) {

		final Location location = locationRepository.findByCity(city);
		if (location == null) {
			return "City " + city + " not found";
		}

		final Customer customer = new Customer();
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setLocation(location);
		final Customer customerSaved = customerRepository.save(customer);
		return "Created customer: " + customerSaved.toString();
	}

	@ShellMethod(value = "List all customers", group = CUSTOMER_GROUP)
	public String listCustomers() {
		final List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers.stream()
				.map(customer -> customer.getId() + ": " + customer.getFirstName() + " " + customer.getLastName())
				.collect(Collectors.joining("\n"));
	}

	@ShellMethod(value = "Exit the shell")
	public void exit() {
		System.exit(0);
	}

}
