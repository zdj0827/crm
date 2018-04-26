package bysj.crm.service.impl;

import bysj.crm.dao.AdminMapper;
import bysj.crm.domain.Admin;
import bysj.crm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public int addAdmin(Admin admin) {
        return adminMapper.addAdmin(admin);
    }

    @Override
    public int update(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }

    @Override
    public Admin getAdminById(long id) {
        return adminMapper.getAdminById(id);
    }

    @Override
    public Admin getAdminByName(String name) {
        return adminMapper.getAdminByName(name);
    }

    @Override
    public boolean isMatch(String password, Admin admin) {
        if(admin.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
