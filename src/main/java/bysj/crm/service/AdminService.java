package bysj.crm.service;


import bysj.crm.domain.Admin;
import bysj.crm.util.Page;
import bysj.crm.util.Result;

public interface AdminService {
    int addAdmin(Admin admin);

    int update(Admin admin);

    Admin getAdminById(long id);

    Admin getAdminByName(String name);

    boolean isMatch(String password, Admin admin);

    Result<Admin> getAllAdmins(Page page, Admin admin);
}
