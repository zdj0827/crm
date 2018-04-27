package bysj.crm.controller;

import bysj.crm.domain.Employee;
import bysj.crm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @ResponseBody
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Map<String,Object> addEmployee(Employee employee){
        Map<String,Object> result = new HashMap<>();
        int i = employeeService.addEmployee(employee);
        if(i!=0){
            result.put("result",true);
            result.put("url","");
        }else{
            result.put("result",false);
            result.put("url","");
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public Map<String,Object> updateEmployee(Employee employee){
        Map<String,Object> result = new HashMap<>();
        int i = employeeService.updateEmployee(employee);
        if(i!=0){
            result.put("result",true);
            result.put("url","");
        }else{
            result.put("result",false);
            result.put("url","");
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "delete",method = RequestMethod.GET)
    public Map<String,Object> deleteEmployee(int id){
        Map<String,Object> result = new HashMap<>();
        int i = employeeService.deleteEmployee(id);
        if(i!=0){
            result.put("result",true);
            result.put("url","");
        }else{
            result.put("result",false);
            result.put("url","");
        }
        return result;
    }

}