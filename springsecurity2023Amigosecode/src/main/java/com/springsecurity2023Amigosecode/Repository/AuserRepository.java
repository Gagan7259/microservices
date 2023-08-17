package com.springsecurity2023Amigosecode.Repository;

import com.springsecurity2023Amigosecode.Model.AUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuserRepository extends JpaRepository<AUser, Integer> {
    Optional<AUser> findByEmail(String email);
}
