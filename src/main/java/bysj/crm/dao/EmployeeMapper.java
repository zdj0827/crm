package bysj.crm.dao;

import bysj.crm.domain.Employee;
import bysj.crm.util.Page;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeMapper {
    int addEmployee(@Param("employee")Employee employee);

    int updateEmployee(@Param("employee")Employee employee);

    int deleteEmployee(@Param("id")int id);

    long getEmployeesCount();

    List<Employee> getEmployeePage(@Param("page") Page page, @Param("employee") Employee employee);
}