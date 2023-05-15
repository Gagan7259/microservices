package com.UserRating.Service;

import com.UserRating.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    //create user
    User createuser(User user);

    //getall users
    List<User> getallusers();

    //get singleuser
    User getsingleuser(String userrid);

}
