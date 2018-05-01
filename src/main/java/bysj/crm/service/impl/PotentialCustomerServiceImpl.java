package bysj.crm.service.impl;

import bysj.crm.dao.PotentialCustomerMapper;
import bysj.crm.domain.PotentialCustomer;
import bysj.crm.service.PotentialCustomerService;
import bysj.crm.util.Page;
import bysj.crm.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public int deletePotentialCustomer(int[] ids) {
        return potentialCustomerMapper.deletePotentialCustomer(ids);
    }

    @Override
    public Result<PotentialCustomer> getAllPotentialCustomers(Page page, PotentialCustomer potentialCustomer) {
        Result<PotentialCustomer> result = new Result<>();
        try{
            long count = potentialCustomerMapper.getPotentialCustomerCount(potentialCustomer);
            result.setTotal(count);
            List<PotentialCustomer> potentialCustomers = potentialCustomerMapper.getPotentialCustomerPage(page,potentialCustomer);
            result.setRows(potentialCustomers);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public PotentialCustomer getPotentialCustomerById(long id) {
        return potentialCustomerMapper.getPotentialCustomerById(id);
    }
}
