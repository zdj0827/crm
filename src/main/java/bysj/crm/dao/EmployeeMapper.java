package bysj.crm.dao;

import bysj.crm.domain.Employee;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeMapper {
    int addEmployee(@Param("employee")Employee employee);

    int updateEmployee(@Param("employee")Employee employee);

    int deleteEmployee(@Param("id")int id);
}