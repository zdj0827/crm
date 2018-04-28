package bysj.crm.service.impl;

import bysj.crm.dao.CustomerMapper;
import bysj.crm.domain.Customer;
import bysj.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public int addCustomer(Customer customer) {
        return customerMapper.addCustomer(customer);
    }

    @Override
    public int updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer);
    }

    @Override
    public int deleteCustomer(int id) {
        return deleteCustomer(id);
    }

    @Override
    public Customer getCustomerByName(String name) {
        return customerMapper.getCustomerByName(name);
    }
}
