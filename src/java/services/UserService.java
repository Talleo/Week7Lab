package services;

import dataaccess.UserDB;
import java.util.List;
import models.Role;
import models.User;

public class UserService {

    public User getUser(String email) throws Exception {
        UserDB udb = new UserDB();
        User user = udb.getUser(email);
        return user;
    }

    public List<User> getAllUsers() throws Exception {
        UserDB udb = new UserDB();
        List<User> users = udb.getAllUsers();
        return users;
    }

    public void insertUser(String email, String firstName, String lastName, String password, int roleId) throws Exception {
        RoleService rs = new RoleService();
        Role role = rs.getRole(roleId);
        User user = new User(email, firstName, lastName, password, role);
        UserDB udb = new UserDB();
        udb.insertUser(user);
    }

    public void updateUser(String email, String firstName, String lastName, String password, int roleId) throws Exception {
        RoleService rs = new RoleService();
        Role role = rs.getRole(roleId);
        User user = new User(email, firstName, lastName, password, role);
        UserDB udb = new UserDB();
        udb.updateUser(user);
    }

    public void deleteUser(String email) throws Exception {
        UserDB udb = new UserDB();
        udb.deleteUser(email);
    }
}
