package bysj.crm.service;

import bysj.crm.domain.Order;

public interface OrderService {
    int addOrder(Order order);

    int updateOrder(Order order);

    int deleteOrder(int id);
}
