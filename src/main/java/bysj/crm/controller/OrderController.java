package bysj.crm.controller;

import bysj.crm.domain.Order;
import bysj.crm.service.OrderService;
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
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Map<String,Object> addOrder(Order order){
        Map<String,Object> result = new HashMap<>();
        int i = orderService.addOrder(order);
        if(i==1){
            result.put("result",true);
            result.put("url","");
        }else if(i==-1){
            result.put("result",false);
            result.put("code",-1);
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
        if(i==1){
            result.put("result",true);
            result.put("url","");
        }else if(i==-1){
            result.put("result",false);
            result.put("code",-1);
        }else {
            result.put("result",false);
            result.put("url","");
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public Map<String,Object> deleteOrder(int[] ids){
        Map<String,Object> result = new HashMap<>();
        int i = orderService.deleteOrder(ids);
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
    @RequestMapping(value = "allOrders",method = RequestMethod.POST)
    public Result<Order> getAllOrders(Page page,Order order){
        Result<Order> result = orderService.getAllOrders(page,order);
        return result;
    }
}
