package bysj.crm.service.impl;

import bysj.crm.dao.EmployeeMapper;
import bysj.crm.domain.Employee;
import bysj.crm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public int addEmployee(Employee employee){
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public int updateEmployee(Employee employee){
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public int deleteEmployee(int id){
        return employeeMapper.deleteEmployee(id);
    }
}
