package one.microstream.controller;

import java.util.Collection;
import java.util.UUID;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import one.microstream.dal.CustomerAccess;
import one.microstream.domain.Customer;


@Controller("/customer")
public class CustomerController
{
	@Inject
	CustomerAccess customerAccess;
	
	@Get("/list")
	public Collection<Customer> list()
	{
		return customerAccess.findAll();
	}
	
	@Get("/create")
	public HttpResponse<?> createCustomer()
	{
		customerAccess.insert(new Customer(UUID.randomUUID().toString(), "Christian", "Kümmel"));
		customerAccess.insert(new Customer(UUID.randomUUID().toString(), "Markus", "Kett"));
		customerAccess.insert(new Customer(UUID.randomUUID().toString(), "Sebastian", "Bock"));
		customerAccess.insert(new Customer(UUID.randomUUID().toString(), "Sebastian", "Späth"));
		
		return HttpResponse.ok("Customer successfully created!");
	}
}
