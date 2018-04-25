package br.com.flaviotvrs.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.flaviotvrs.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see br.com.flaviotvrs.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return Arrays.asList(new Customer("Flávio", "Tavares"));
	}
}
