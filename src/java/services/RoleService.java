package services;

import dataaccess.RoleDB;
import java.util.List;
import models.Role;

public class RoleService {
    
    public Role getRole(int roleId) throws Exception {
        RoleDB rdb = new RoleDB();
        Role role = rdb.getRole(roleId);
        return role;
    }
    
    public List<Role> getAllRoles(String roleName) throws Exception {
        RoleDB rdb = new RoleDB();
        List<Role> roles = rdb.getAllRoles(roleName);
        return roles;
    }
}
