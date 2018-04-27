package bysj.crm.service.impl;

import bysj.crm.dao.OrderMapper;
import bysj.crm.domain.Order;
import bysj.crm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int addOrder(Order order) {
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
}
