package bysj.crm.service.impl;

import bysj.crm.dao.OrderMapper;
import bysj.crm.domain.Customer;
import bysj.crm.domain.Order;
import bysj.crm.service.CustomerService;
import bysj.crm.service.OrderService;
import bysj.crm.util.Page;
import bysj.crm.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private CustomerService customerService;
    @Override
    public int addOrder(Order order) {
        Customer customer = customerService.getCustomerByName(order.getCustomerName());
        if(customer==null){
            return -1;
        }
        order.setCustomerId(customer.getId());
        return orderMapper.addOrder(order);
    }

    @Override
    public int updateOrder(Order order) {
        return orderMapper.updateOrder(order);
    }

    @Override
    public int deleteOrder(int id) {
        return orderMapper.deleteOrder(id);
    }

    @Override
    public Result<Order> getAllOrders(Page page, Order order) {
        Result<Order> result = new Result<>();
        try{
            long count = orderMapper.getOrderCount();
            result.setTotal(count);
            List<Order> orders = orderMapper.getOrderPage(page,order);
            result.setRows(orders);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
