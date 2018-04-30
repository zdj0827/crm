package bysj.crm.service;

import bysj.crm.domain.Order;
import bysj.crm.util.Page;
import bysj.crm.util.Result;

public interface OrderService {
    int addOrder(Order order);

    int updateOrder(Order order);

    int deleteOrder(int id);

    Result<Order> getAllOrders(Page page, Order order);
}
