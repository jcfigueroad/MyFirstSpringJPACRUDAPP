package cl.tswoo.lab.modelapp.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import cl.tswoo.lab.modelapp.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	//List<Customer> finByLastName(String lastName, Pageable pageable);
}
