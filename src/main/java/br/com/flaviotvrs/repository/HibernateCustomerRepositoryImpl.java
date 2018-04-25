package br.com.flaviotvrs.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import br.com.flaviotvrs.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	/* (non-Javadoc)
	 * @see br.com.flaviotvrs.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		System.out.println("[DEBUG] Querying data from DB using username: " + dbUsername);
		return Arrays.asList(new Customer("Flávio", "Tavares"));
	}
}
