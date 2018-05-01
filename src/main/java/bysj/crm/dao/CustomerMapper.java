package bysj.crm.dao;

import bysj.crm.domain.Customer;
import bysj.crm.util.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerMapper {
    int addCustomer(@Param("customer") Customer customer);

    int updateCustomer(@Param("customer") Customer customer);

    int deleteCustomer(@Param("ids") int[] ids);

    Customer getCustomerByName(@Param("name") String name);

    long getCustomerCount(@Param("customer") Customer customer);

    List<Customer> getCustomerPage(@Param("page") Page page, @Param("customer") Customer customer);

    Customer getCustomerById(@Param("id") long id);
}
