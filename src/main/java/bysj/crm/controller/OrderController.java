package bysj.crm.controller;

import bysj.crm.domain.Order;
import bysj.crm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Map<String,Object> addOrder(Order order){
        Map<String,Object> result = new HashMap<>();
        int i = orderService.addOrder(order);
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
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public Map<String,Object> updateOrder(Order order){
        Map<String,Object> result = new HashMap<>();
        int i = orderService.updateOrder(order);
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
    public Map<String,Object> addOrder(int id){
        Map<String,Object> result = new HashMap<>();
        int i = orderService.deleteOrder(id);
        if(i!=0){
            result.put("result",true);
            result.put("url","");
        }else {
            result.put("result",false);
            result.put("url","");
        }
        return result;
    }
}
