package bysj.crm.service;

import bysj.crm.domain.Customer;

public interface CustomerService {
    int addCustomer(Customer customer);

    int updateCustomer( Customer customer);

    int deleteCustomer( int id);

    Customer getCustomerByName(String name);
}
