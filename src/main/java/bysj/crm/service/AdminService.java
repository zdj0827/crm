package bysj.crm.service;


import bysj.crm.domain.Admin;

public interface AdminService {
    int addAdmin(Admin admin);

    int update(Admin admin);

    Admin getAdminById(long id);

    Admin getAdminByName(String name);

    boolean isMatch(String password, Admin admin);
}
