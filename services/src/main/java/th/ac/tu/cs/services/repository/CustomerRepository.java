package th.ac.tu.cs.services.repository;

import th.ac.tu.cs.services.model.Customer;
import th.ac.tu.cs.services.model.Tutorial;

import java.util.List;

public interface  CustomerRepository {
    int save(Customer customer);

    int update(Customer customer);

    Customer findById(Long id);

    int deleteById(Long id);

    List<Customer> findAll();

    List<Customer> findByName(String name);

    List<Customer> findByEmail(String email);

    int deleteAll();
}
