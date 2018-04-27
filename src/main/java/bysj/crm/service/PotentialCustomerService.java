package bysj.crm.service;

import bysj.crm.domain.PotentialCustomer;

public interface PotentialCustomerService {
    int addPotentialCustomer(PotentialCustomer potentialCustomer);

    int updatePotentialCustomer(PotentialCustomer potentialCustomer);

    int deletePotentialCustomer(int id);
}
