package bysj.crm.service;

import bysj.crm.domain.Employee;
import bysj.crm.util.Page;
import bysj.crm.util.Result;

import java.util.Map;

public interface EmployeeService {

    Map<String,Object> addEmployee(Employee employee);

    int updateEmployee(Employee employee);

    int deleteEmployee(int id);

    Result<Employee> getAllEmployees(Page page, Employee employee);

    Employee getEmployeeById(long id);
}
