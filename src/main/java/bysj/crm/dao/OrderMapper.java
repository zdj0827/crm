package bysj.crm.dao;

import bysj.crm.domain.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface OrderMapper {
    int addOrder(@Param("order")Order order);

    int updateOrder(@Param("order")Order order);

    int deleteOrder(@Param("id")int id);
}
