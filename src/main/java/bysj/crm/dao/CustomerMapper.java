package bysj.crm.dao;

import bysj.crm.domain.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface CustomerMapper {
    int addCustomer(@Param("customer") Customer customer);

    int updateCustomer(@Param("customer") Customer customer);

    int deleteCustomer(@Param("id") int id);
}
