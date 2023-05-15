package com.UserRating.Controller;

import com.UserRating.Entity.User;
import com.UserRating.Service.Impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceimpl userServiceimpl;

    //create user in api
    @PostMapping
    public ResponseEntity<User> createuser(@RequestBody User user) {
        User user1 = userServiceimpl.createuser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //get all users
    @GetMapping
    public ResponseEntity<List<User>> getallusers() {
        List<User> user = userServiceimpl.getallusers();
        return ResponseEntity.ok(user);
    }

    //get single user
    @GetMapping("/{userId}")
    public ResponseEntity<User> getsinleuser(@PathVariable String userId) {
        User user = userServiceimpl.getsingleuser(userId);
        return ResponseEntity.ok(user);
    }
}
