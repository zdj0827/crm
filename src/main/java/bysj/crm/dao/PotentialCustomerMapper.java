package bysj.crm.dao;

import bysj.crm.domain.PotentialCustomer;
import bysj.crm.util.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PotentialCustomerMapper {
    int addPotentialCustomer(@Param("pCustomer")PotentialCustomer potentialCustomer);

    int updatePotentialCustomer(@Param("pCustomer")PotentialCustomer potentialCustomer);

    int deletePotentialCustomer(@Param("id")int id);

    long getPotentialCustomerCount(@Param("pCustomer") PotentialCustomer potentialCustomer);

    List<PotentialCustomer> getPotentialCustomerPage(@Param("page") Page page, @Param("pCustomer") PotentialCustomer potentialCustomer);

    PotentialCustomer getPotentialCustomerById(@Param("id") long id);
}
