package one.microstream;

import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.micronaut.core.annotation.NonNull;


public interface CustomerAccess
{
	Collection<Customer> findAll();
	
	@NonNull
	Customer insert(@NonNull @NotNull @Valid Customer customer);
	
	void update(
		@NonNull @NotBlank String id,
		@NonNull @NotNull @Valid Customer customer);
	
	@NonNull
	Optional<Customer> findById(@NonNull @NotBlank String id);
	
	void deleteById(@NonNull @NotBlank String id);
}
