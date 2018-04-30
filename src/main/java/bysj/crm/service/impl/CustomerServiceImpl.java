package bysj.crm.service.impl;

import bysj.crm.dao.CustomerMapper;
import bysj.crm.domain.Customer;
import bysj.crm.service.CustomerService;
import bysj.crm.util.Page;
import bysj.crm.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Result<Customer> getAllCustomers(Page page, Customer customer) {
        Result<Customer> result = new Result<>();
        try{
            long count = customerMapper.getCustomerCount();
            result.setTotal(count);
            List<Customer> customers = customerMapper.getCustomerPage(page,customer);
            result.setRows(customers);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
