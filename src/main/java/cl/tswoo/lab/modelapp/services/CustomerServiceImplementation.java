package cl.tswoo.lab.modelapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tswoo.lab.modelapp.models.Customer;
import cl.tswoo.lab.modelapp.repositories.CustomerRepository;

@Service
public class CustomerServiceImplementation implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> listAll() {
		return customerRepository.findAll();
	}

}
