package bysj.crm.controller;

import bysj.crm.domain.Admin;
import bysj.crm.domain.User;
import bysj.crm.service.AdminService;
import bysj.crm.util.Page;
import bysj.crm.util.Result;
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

    @ResponseBody
    @RequestMapping(value = "delete",method = RequestMethod.GET)
    public Map<String,Object> deleteAdmin(int[] ids){
        return null;
    }
    /*修改管理员信息*/
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Map<String,Object> updateAdmin(Admin admin){
        Map<String,Object> result = new HashMap<>();
        int isSuccess = adminService.update(admin);
        if(isSuccess==1){
            result.put("result",true);
            result.put("url","");
        }else{
            result.put("result",false);
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
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Map<String,Object> login(Admin admin, HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> result = new HashMap<>();
        Admin adminFind = adminService.getAdminByName(admin.getName());
        if(admin==null){
            result.put("result",false);
            result.put("url","");
            return result;
        }
        boolean isMatch = adminService.isMatch(admin.getPassword(),adminFind);
        if(isMatch){
            request.getSession().setAttribute("user",adminFind);
            result.put("result",true);
            result.put("url","");
        }else{
            result.put("result",false);
            result.put("url","");
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "allAdmins",method = RequestMethod.POST)
    public Result<Admin> getAllAdmins(Page page,Admin admin){
        Result<Admin> result = adminService.getAllAdmins(page,admin);
        return result;
    }

}
