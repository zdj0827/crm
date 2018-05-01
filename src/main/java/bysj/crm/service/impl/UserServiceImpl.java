package bysj.crm.service.impl;

import bysj.crm.dao.UserMapper;
import bysj.crm.domain.Employee;
import bysj.crm.domain.User;
import bysj.crm.service.EmployeeService;
import bysj.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private EmployeeService employeeService;
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        Employee employee = employeeService.getEmployeeByJobNumber(user.getJobNumber());
        employee.setDeptName(user.getDeptName());
        employee.setRole(user.getRole());
        int i = employeeService.updateEmployee(employee);
        i+= userMapper.updateUser(user);
        return i;
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User getByJobNumber(long jobNumber) {
        return userMapper.getByJobNumber(jobNumber);
    }

    @Override
    public boolean isMatch(String password, User userFind) {
        return userFind.getPassword().equals(password);
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
