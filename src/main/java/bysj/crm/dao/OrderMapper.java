package bysj.crm.dao;

import bysj.crm.domain.Order;
import bysj.crm.util.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrderMapper {
    int addOrder(@Param("order")Order order);

    int updateOrder(@Param("order")Order order);

    int deleteOrder(@Param("id")int id);

    long getOrderCount();

    List<Order> getOrderPage(@Param("page") Page page, @Param("order") Order order);
}
