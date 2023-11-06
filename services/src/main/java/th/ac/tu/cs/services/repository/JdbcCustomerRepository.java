package th.ac.tu.cs.services.repository;

import org.springframework.stereotype.Repository;
import th.ac.tu.cs.services.model.Customer;

import java.util.List;
@Repository
public class JdbcCustomerRepository implements CustomerRepository{
    @Override
    public int save(Customer customer) {
        return 0;
    }

    @Override
    public int update(Customer customer) {
        return 0;
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        return null;
    }

    @Override
    public List<Customer> findByEmail(String email) {
        return null;
    }

    @Override
    public int deleteAll() {
        return 0;
    }
}
