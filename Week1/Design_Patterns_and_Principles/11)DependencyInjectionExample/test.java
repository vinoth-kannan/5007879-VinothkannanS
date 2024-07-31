public class test {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImplementation();
        CustomerService customerService = new CustomerService(customerRepository);
        customerService.addCustomer(new Customer("400", "Vinoth"));
        customerService.addCustomer(new Customer("250", "Kannan"));
        customerService.addCustomer(new Customer("125", "Saravanan"));
        Customer customer1 = customerService.getCustomerById("172");
        System.out.println(customer1);
        Customer customer2 = customerService.getCustomerById("400");
        System.out.println(customer2);
        Customer customer3 = customerService.getCustomerById("350");
        System.out.println(customer3);
        Customer customer4 = customerService.getCustomerById("250");
        System.out.println(customer4);
    }
}