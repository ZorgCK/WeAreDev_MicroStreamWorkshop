package one.microstream;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import jakarta.inject.Singleton;
import one.microstream.concurrency.XThreads;
import one.microstream.storage.types.StorageManager;


@Singleton
public class CustomerAccessImpl implements CustomerAccess
{
	private final StorageManager storageManager;
	
	public CustomerAccessImpl(StorageManager storageManager)
	{
		this.storageManager = storageManager;
	}
	
	@Override
	public Collection<Customer> findAll()
	{
		return data().getCustomers().values();
	}
	
	@Override
	public Customer insert(@NotNull @Valid Customer customer)
	{
		return XThreads.executeSynchronized(() ->
		{
			String id = UUID.randomUUID().toString();
			data().getCustomers().put(id, customer);
			storageManager.store(data().getCustomers()); //
			return customer;
		});
	}
	
	@Override
	public void update(@NotBlank String id, @NotNull @Valid Customer customer)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Optional<Customer> findById(@NotBlank String id)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void deleteById(@NotBlank String id)
	{
		// TODO Auto-generated method stub
		
	}
	
	private Data data()
	{
		return (Data)storageManager.root();
	}
}
