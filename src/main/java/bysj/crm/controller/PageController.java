package bysj.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
    /*跳转到admin首页*/
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    /*跳转到添加admin页面*/
    @RequestMapping(value = "addAdminPage",method = RequestMethod.GET)
    public String addAdminPage(){
        return "addAdmin";
    }

    @RequestMapping(value = "addEmployeePage",method = RequestMethod.GET)
    public String addEmployeePage(){
        return "addEmployee";
    }

    @RequestMapping(value = "addCustomerPage",method = RequestMethod.GET)
    public String addCustomerPage(){
        return "addCustomer";
    }

    @RequestMapping(value = "addPotentialCustomerPage",method = RequestMethod.GET)
    public String addPotentialCustomerPage(){
        return "addPotentialCustomer";
    }

    @RequestMapping(value = "addOrderPage",method = RequestMethod.GET)
    public String addOrderPage(){
        return "addOrder";
    }
}
