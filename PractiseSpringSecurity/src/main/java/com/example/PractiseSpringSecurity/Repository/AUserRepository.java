package com.example.PractiseSpringSecurity.Repository;

import com.example.PractiseSpringSecurity.Model.Auser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AUserRepository extends JpaRepository<Auser, Integer> {
    Optional<Auser> findByemail(String email);
}
