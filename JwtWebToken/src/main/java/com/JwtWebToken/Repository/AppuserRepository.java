package com.JwtWebToken.Repository;

import com.JwtWebToken.Model.AppUser;
import com.JwtWebToken.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppuserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);

}
