package bysj.crm.service.impl;

import bysj.crm.dao.PotentialCustomerMapper;
import bysj.crm.domain.PotentialCustomer;
import bysj.crm.service.PotentialCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PotentialCustomerServiceImpl implements PotentialCustomerService{
    @Autowired
    private PotentialCustomerMapper potentialCustomerMapper;
    @Override
    public int addPotentialCustomer(PotentialCustomer potentialCustomer) {
        return potentialCustomerMapper.addPotentialCustomer(potentialCustomer);
    }

    @Override
    public int updatePotentialCustomer(PotentialCustomer potentialCustomer) {
        return potentialCustomerMapper.updatePotentialCustomer(potentialCustomer);
    }

    @Override
    public int deletePotentialCustomer(int id) {
        return potentialCustomerMapper.deletePotentialCustomer(id);
    }
}
