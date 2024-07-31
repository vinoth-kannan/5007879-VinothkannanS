public class CustomerService {
    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public Customer getCustomerById(String id) {
        return customerRepository.findCustomerById(id);
    }
    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }
}