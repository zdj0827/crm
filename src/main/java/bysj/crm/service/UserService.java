package bysj.crm.service;

import bysj.crm.domain.User;

public interface UserService {
    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    User getByJobNumber(long jobNumber);

    boolean isMatch(String password, User userFind);

    User getUserById(int id);
}
