package com.JwtWebToken.Service.Impl;

import com.JwtWebToken.Model.AppUser;
import com.JwtWebToken.Model.Role;
import com.JwtWebToken.Repository.AppuserRepository;
import com.JwtWebToken.Repository.RoleRepository;
import com.JwtWebToken.Service.AppuserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AppuserServiceImpl implements AppuserService {

    private final AppuserRepository appuserRepository;
    private final RoleRepository roleRepository;


    @Override
    public AppUser createUser(AppUser user) {

        return appuserRepository.save(user);
    }

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void AddRoleToUser(String username, String roleName) {
        AppUser user = appuserRepository.findByUsername(username);
        Role r = roleRepository.findByName(roleName);
        user.getRoles().add(r);

    }

    @Override
    public AppUser getUser(String username) {
        return appuserRepository.findByUsername(username);
    }

    @Override
    public List<AppUser> getallusers() {
        return appuserRepository.findAll();
    }
}
