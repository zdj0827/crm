package bysj.crm.controller;

import bysj.crm.domain.User;
import bysj.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Map<String,Object> addUser(User user){
        Map<String,Object> result = new HashMap<>();
        int i = userService.addUser(user);
        if(i!=0){
            result.put("result",true);
            result.put("url","");
        }else {
            result.put("result",false);
            result.put("url","");
        }
        return  result;
    }

    @ResponseBody
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public Map<String,Object> updateUser(User user){
        Map<String,Object> result = new HashMap<>();
        int i = userService.updateUser(user);
        if(i!=0){
            result.put("result",true);
            result.put("url","");
        }else {
            result.put("result",false);
            result.put("url","");
        }
        return  result;
    }

    @ResponseBody
    @RequestMapping(value = "delete",method = RequestMethod.GET)
    public Map<String,Object> deleteUser(int id){
        Map<String,Object> result = new HashMap<>();
        int i = userService.deleteUser(id);
        if(i!=0){
            result.put("result",true);
            result.put("url","");
        }else {
            result.put("result",false);
            result.put("url","");
        }
        return  result;
    }
}
