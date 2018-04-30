package bysj.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PageController {
    /*跳转到admin首页*/
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response){
        if(request.getSession().getAttribute("user")==null){
            return "login";
        }
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

    @ResponseBody
    @RequestMapping(value = "logout",method = RequestMethod.POST)
    public Map<String,Object> logout(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> result = new HashMap<>();
        try{
            request.getSession().removeAttribute("user");
        }catch (Exception e){
            result.put("result",false);
            return result;
        }
        result.put("result",true);
        return result;
    }

    @RequestMapping(value = "adminList",method = RequestMethod.GET)
    public String toAdminList(){
        return "adminList";
    }

    @RequestMapping(value = "employeeList",method = RequestMethod.GET)
    public String toEmployeeList(){
        return "employeeList";
    }

    @RequestMapping(value = "customerList",method = RequestMethod.GET)
    public String toCustomerList(){
        return "customerList";
    }

    @RequestMapping(value = "potentialCustomerList",method = RequestMethod.GET)
    public String toPotentialCustomerList(){
        return "potentialList";
    }

    @RequestMapping(value = "orderList",method = RequestMethod.GET)
    public String toOrderList(){
        return "orderList";
    }
}
