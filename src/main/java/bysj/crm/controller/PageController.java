package bysj.crm.controller;

import bysj.crm.domain.*;
import bysj.crm.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PageController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private PotentialCustomerService potentialCustomerService;
    @Autowired
    private UserService userService;
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

    @RequestMapping(value = "updateAdminPage/{id}",method = RequestMethod.GET)
    public String toUpdateAdminPage(@PathVariable("id")long id,HttpServletRequest request,HttpServletResponse response){
        Admin admin = adminService.getAdminById(id);
        if(admin!=null){
            request.getSession().setAttribute("admin",admin);
        }
        return "updateAdmin";
    }

    @RequestMapping(value = "updateEmployeePage/{id}",method = RequestMethod.GET)
    public String toUpdateEmployeePage(@PathVariable("id")long id,HttpServletRequest request,HttpServletResponse response){
        Employee employee = employeeService.getEmployeeById(id);
        if(employee!=null){
            request.getSession().setAttribute("employee",employee);
        }
        return "updateEmployee";
    }

    @RequestMapping(value = "updateCustomerPage/{id}",method = RequestMethod.GET)
    public String toUpdateCustomerPage(@PathVariable("id")long id,HttpServletRequest request,HttpServletResponse response){
        Customer customer = customerService.getCustomerBId(id);
        if(customer!=null){
            request.getSession().setAttribute("customer",customer);
        }
        return "updateCustomer";
    }

    @RequestMapping(value = "updateOrderPage/{id}",method = RequestMethod.GET)
    public String toUpdateOrderPage(@PathVariable("id")long id,HttpServletRequest request,HttpServletResponse response){
        Order order = orderService.getOrderById(id);
        if(order!=null){
            request.getSession().setAttribute("order",order);
        }
        return "updateOrder";
    }

    @RequestMapping(value = "updatePotentialCustomerPage/{id}",method = RequestMethod.GET)
    public String toUpdatePotentialCustomerPagePage(@PathVariable("id")long id,HttpServletRequest request,HttpServletResponse response){
        PotentialCustomer potentialCustomer = potentialCustomerService.getPotentialCustomerById(id);
        if(potentialCustomer!=null){
            request.getSession().setAttribute("pCustomer",potentialCustomer);
        }
        return "updatePotentialCustomer";
    }

    @RequestMapping(value = "updateUserPage/{id}",method = RequestMethod.GET)
    public String toUpdateUserPage(@PathVariable("id") int id,HttpServletRequest request,HttpServletResponse response){
        User user = userService.getUserById(id);
        if(user!=null){
            request.getSession().setAttribute("user",user);
        }
        return "updateUser";
    }
}
