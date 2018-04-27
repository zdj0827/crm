package bysj.crm.controller;

import bysj.crm.domain.Customer;
import bysj.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @ResponseBody
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Map<String,Object> addCustomer(Customer customer){
        Map<String,Object> result = new HashMap<>();
        int i = customerService.addCustomer(customer);
        if (i != 0) {
            result.put("result",true);
            result.put("url","");
        }else {
            result.put("result",false);
            result.put("url","");
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "delete",method = RequestMethod.GET)
    public Map<String,Object> deleteCustomer(int id){
        Map<String,Object> result = new HashMap<>();
        int i = customerService.deleteCustomer(id);
        if (i != 0) {
            result.put("result",true);
            result.put("url","");
        }else {
            result.put("result",false);
            result.put("url","");
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public Map<String,Object> updateCustomer(Customer customer){
        Map<String,Object> result = new HashMap<>();
        int i = customerService.updateCustomer(customer);
        if (i != 0) {
            result.put("result",true);
            result.put("url","");
        }else {
            result.put("result",false);
            result.put("url","");
        }
        return result;
    }
}
