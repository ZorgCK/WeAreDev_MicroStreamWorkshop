package one.microstream.storage;

import java.util.HashMap;
import java.util.Map;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.NonNull;
import one.microstream.domain.Customer;


@Introspected
public class Data
{
	private Map<String, Customer> customers = new HashMap<>();
	
	@NonNull
	public Map<String, Customer> getCustomers()
	{
		return this.customers;
	}
}
