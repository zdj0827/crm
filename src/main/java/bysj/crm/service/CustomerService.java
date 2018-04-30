package bysj.crm.service;

import bysj.crm.domain.Customer;
import bysj.crm.util.Page;
import bysj.crm.util.Result;

public interface CustomerService {
    int addCustomer(Customer customer);

    int updateCustomer( Customer customer);

    int deleteCustomer( int id);

    Customer getCustomerByName(String name);

    Result<Customer> getAllCustomers(Page page, Customer customer);
}
