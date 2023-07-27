package ma.cires.solutions.demo.service;

import lombok.RequiredArgsConstructor;
import ma.cires.solutions.demo.domain.Customer;
import ma.cires.solutions.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerService {


    private final CustomerRepository customerRepository;


    public Customer saveCustomer(Customer customer) {

        // here we can add some business logic

        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomer(String id) {
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    public Customer getCustomerByName(String name) {
        return customerRepository.findByName(name);
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }
}
