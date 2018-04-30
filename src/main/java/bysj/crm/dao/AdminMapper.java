package bysj.crm.dao;


import bysj.crm.domain.Admin;
import bysj.crm.util.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AdminMapper {
    int addAdmin(@Param("admin") Admin admin);

    int updateAdmin(@Param("admin")Admin admin);

    Admin getAdminById(@Param("id")long id);

    Admin getAdminByName(@Param("name")String name);

    long getAdminCount();

    List<Admin> getAdminPage(@Param("page") Page page, @Param("admin") Admin admin);
}
