package bysj.crm.service.impl;

import bysj.crm.dao.UserMapper;
import bysj.crm.domain.User;
import bysj.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
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
}
