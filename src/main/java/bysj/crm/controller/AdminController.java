package bysj.crm.controller;

import bysj.crm.domain.Admin;
import bysj.crm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    /*添加管理员*/
    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Map<String,Object> addAdmin(Admin admin){
        Map<String,Object> result = new HashMap<>();
        int isSuccess = adminService.addAdmin(admin);
        if(isSuccess==1){
            result.put("msg","Add Admin Success");
            result.put("url","");
        }else{
            result.put("msg","Add Admin Failed");
        }
        return result;
    }
    /*修改管理员信息*/
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> updateAdmin(Admin admin){
        Map<String,Object> result = new HashMap<>();
        int isSuccess = adminService.update(admin);
        if(isSuccess==1){
            result.put("msg","update Admin Success");
            result.put("url","");
        }else{
            result.put("msg","update Admin Failed");
        }
        return result;
    }
    /*id查询管理员*/
    @ResponseBody
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Map<String,Object> getAdminById(@PathVariable("id") long id){
        Map<String,Object> result = new HashMap<>();
        Admin admin = adminService.getAdminById(id);
        if(admin!=null){
            result.put("msg","success");
            result.put("url","");
        }else{
            result.put("msg","no such admin");
            result.put("url","");
        }
        return result;
    }
    /*管理员登录*/
    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public Map<String,Object> login(String name,String password){
        Map<String,Object> result = new HashMap<>();
        Admin admin = adminService.getAdminByName(name);
        if(admin==null){
            result.put("result",false);
            result.put("url","");
            return result;
        }
        boolean isMatch = adminService.isMatch(password,admin);
        if(isMatch){
            result.put("result",true);
            result.put("url","");
        }else{
            result.put("result",false);
            result.put("url","");
        }
        return result;
    }

}
