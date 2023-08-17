package com.JwtWebToken.Service;

import com.JwtWebToken.Model.AppUser;
import com.JwtWebToken.Model.Role;

import java.util.List;

public interface AppuserService {
    AppUser createUser(AppUser user);

    Role createRole(Role role);

    void AddRoleToUser(String username, String roleName);

    AppUser getUser(String username);

    List<AppUser> getallusers();
}
