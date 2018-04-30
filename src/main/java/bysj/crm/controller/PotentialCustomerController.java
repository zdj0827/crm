package bysj.crm.controller;

import bysj.crm.domain.PotentialCustomer;
import bysj.crm.service.PotentialCustomerService;
import bysj.crm.util.Page;
import bysj.crm.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "potentialCustomer")
public class PotentialCustomerController {
    @Autowired
    private PotentialCustomerService potentialCustomerService;

    @ResponseBody
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public Map<String ,Object> updatePotentialCustomer(PotentialCustomer potentialCustomer){
        Map<String,Object> result = new HashMap<>();
        int i = potentialCustomerService.updatePotentialCustomer(potentialCustomer);
        if(i!=0){
            result.put("result",true);
            result.put("url","");
        }else {
            result.put("result",false);
            result.put("url","");
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public Map<String ,Object> deletePotentialCustomer(int id){
        Map<String,Object> result = new HashMap<>();
        int i = potentialCustomerService.deletePotentialCustomer(id);
        if(i!=0){
            result.put("result",true);
            result.put("url","");
        }else {
            result.put("result",false);
            result.put("url","");
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Map<String ,Object> addPotentialCustomer(PotentialCustomer potentialCustomer){
        Map<String,Object> result = new HashMap<>();
        int i = potentialCustomerService.addPotentialCustomer(potentialCustomer);
        if(i!=0){
            result.put("result",true);
            result.put("url","");
        }else {
            result.put("result",false);
            result.put("url","");
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "allPotentialCustomers",method = RequestMethod.POST)
    public Result<PotentialCustomer> getAllPotentialCustomers(Page page,PotentialCustomer potentialCustomer){
        Result<PotentialCustomer> result = potentialCustomerService.getAllPotentialCustomers(page,potentialCustomer);
        return result;
    }
}
