package com.JwtWebToken.Controller;

import com.JwtWebToken.Model.AppUser;
import com.JwtWebToken.Model.Role;
import com.JwtWebToken.Service.Impl.AppuserServiceImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AppUserController {

    private final AppuserServiceImpl appuserService;

    @GetMapping("/users")
    public ResponseEntity<List<AppUser>> getallappusers() {
        return ResponseEntity.ok().body(appuserService.getallusers());
    }

    @PostMapping("/user/save")
    public ResponseEntity<AppUser> createAppusers(@RequestBody AppUser user) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
        return ResponseEntity.created(uri).body(appuserService.createUser(user));
    }

    @PostMapping("/role/save")
    public ResponseEntity<Role> CreateRoles(@RequestBody Role role) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/Role/save").toUriString());
        return ResponseEntity.created(uri).body(appuserService.createRole(role));
    }

    @PostMapping("/role/addtouser")
    public ResponseEntity<?> saveRoleTousers(@RequestBody AddRoleTOUserForm form) {
        appuserService.AddRoleToUser(form.getUsername(), form.getRolename());
        return ResponseEntity.ok().build();
    }

}

@Data
class AddRoleTOUserForm {
    private String username;
    private String rolename;
}