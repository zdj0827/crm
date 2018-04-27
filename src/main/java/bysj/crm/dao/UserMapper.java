package bysj.crm.dao;

import bysj.crm.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    int addUser(@Param("user") User user);

    int updateUser(@Param("user") User user);

    int deleteUser(@Param("id") int id);
}
