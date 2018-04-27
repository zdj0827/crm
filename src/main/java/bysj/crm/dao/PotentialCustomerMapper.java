package bysj.crm.dao;

import bysj.crm.domain.PotentialCustomer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface PotentialCustomerMapper {
    int addPotentialCustomer(@Param("pCustomer")PotentialCustomer potentialCustomer);

    int updatePotentialCustomer(@Param("pCustomer")PotentialCustomer potentialCustomer);

    int deletePotentialCustomer(@Param("id")int id);
}
