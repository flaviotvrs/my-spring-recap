package br.com.flaviotvrs.repository;

import java.util.List;

import br.com.flaviotvrs.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}