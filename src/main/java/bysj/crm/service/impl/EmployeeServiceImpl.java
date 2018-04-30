package bysj.crm.service.impl;

import bysj.crm.dao.EmployeeMapper;
import bysj.crm.dao.UserMapper;
import bysj.crm.domain.Employee;
import bysj.crm.domain.User;
import bysj.crm.service.EmployeeService;
import bysj.crm.util.Page;
import bysj.crm.util.RandomUtil;
import bysj.crm.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String,Object> addEmployee(Employee employee){
        int result = 0;
        long jobNumber = RandomUtil.createJobNumber();
        User user = userMapper.getByJobNumber(jobNumber);
        if(user==null){
            employee.setLevel(0);
            employee.setJobNumber(jobNumber);
        }else{
            for(int i =0;i<5;i++){
                jobNumber = RandomUtil.createJobNumber();
            }
            employee.setLevel(0);
            employee.setJobNumber(jobNumber);
        }
        User newUser = new User();
        newUser.setJobNumber(employee.getJobNumber());
        newUser.setPassword("123456");
        newUser.setDeptName(employee.getDeptName());
        newUser.setRole(employee.getRole());
        newUser.setLevel(employee.getLevel());
        newUser.setName(employee.getName());
        try {
           result = userMapper.addUser(newUser);
           result = employeeMapper.addEmployee(employee);
        }catch (Exception e){
            result = 0;
            e.printStackTrace();
        }
        Map<String ,Object> map = new HashMap<>();
        map.put("result",result);
        if(result==1){
            map.put("jobNumber",jobNumber);
        }
        return map;
    }

    @Override
    public int updateEmployee(Employee employee){
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public int deleteEmployee(int id){
        return employeeMapper.deleteEmployee(id);
    }

    @Override
    public Result<Employee> getAllEmployees(Page page, Employee employee) {
        Result<Employee> result = new Result<>();
        try{
            long count = employeeMapper.getEmployeesCount();
            result.setTotal(count);
            List<Employee> employees = employeeMapper.getEmployeePage(page,employee);
            result.setRows(employees);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
