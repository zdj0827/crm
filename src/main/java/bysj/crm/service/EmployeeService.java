package bysj.crm.service;

import bysj.crm.domain.Employee;

public interface EmployeeService {

    int addEmployee(Employee employee);

    int updateEmployee(Employee employee);

    int deleteEmployee(int id);
}
