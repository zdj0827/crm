package bysj.crm.service;

import bysj.crm.domain.PotentialCustomer;
import bysj.crm.util.Page;
import bysj.crm.util.Result;

public interface PotentialCustomerService {
    int addPotentialCustomer(PotentialCustomer potentialCustomer);

    int updatePotentialCustomer(PotentialCustomer potentialCustomer);

    int deletePotentialCustomer(int[] ids);

    Result<PotentialCustomer> getAllPotentialCustomers(Page page, PotentialCustomer potentialCustomer);

    PotentialCustomer getPotentialCustomerById(long id);
}
