package com.JwtWebToken;

import com.JwtWebToken.Model.AppUser;
import com.JwtWebToken.Model.Role;
import com.JwtWebToken.Service.AppuserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class JwtWebTokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtWebTokenApplication.class, args);
    }

    @Bean
    CommandLineRunner run(AppuserService appuserService) {
        return args -> {
            appuserService.createRole(new Role(null, "USER"));
            appuserService.createRole(new Role(null, "MANAGER"));
            appuserService.createRole(new Role(null, "ROLE_ADMIN"));
            appuserService.createRole(new Role(null, "ROLE_SUPER_ADMIN"));

            appuserService.createUser(new AppUser(null, "Gagan Kumar", "Gagan", "1234", new ArrayList<>()));
            appuserService.createUser(new AppUser(null, "Manoj Kumar", "Manoj", "4567", new ArrayList<>()));
            appuserService.createUser(new AppUser(null, "Sai Kumar", "Sai", "7890", new ArrayList<>()));
            appuserService.createUser(new AppUser(null, "JaYaram", "Jai", "0123", new ArrayList<>()));

            appuserService.AddRoleToUser("Gagan", "USER");
            appuserService.AddRoleToUser("Manoj", "ROLE_ADMIN");
            appuserService.AddRoleToUser("Sai", "MANAGER");
            appuserService.AddRoleToUser("Jai", "ROLE_SUPER_ADMIN");

        };
    }
}
