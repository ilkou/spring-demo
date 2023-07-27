package ma.cires.solutions.demo.web;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import ma.cires.solutions.demo.domain.Customer;
import ma.cires.solutions.demo.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping
    public Customer createCustomer(@Valid @RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable String id) {
        customerService.deleteCustomer(id);
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable String id) {
        return customerService.getCustomer(id);
    }

    @GetMapping("/name/{name}")
    public Customer getCustomerByName(@PathVariable String name) {
        return customerService.getCustomerByName(name);
    }
}
