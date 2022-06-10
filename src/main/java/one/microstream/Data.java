package one.microstream;

import java.util.HashMap;
import java.util.Map;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.NonNull;


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
