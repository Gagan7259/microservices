package com.UserRating.Service.Impl;

import com.UserRating.Entity.User;
import com.UserRating.Exception.ResourceNotfoundException;
import com.UserRating.Respository.UserRepository;
import com.UserRating.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createuser(User user) {
        String radomid = UUID.randomUUID().toString();
        user.setUserId(radomid);
        return userRepository.save(user);
    }

    @Override
    public List<User> getallusers() {
        return userRepository.findAll();
    }

    @Override
    public User getsingleuser(String userrid) {
        return userRepository.findById(userrid).orElseThrow(() -> new ResourceNotfoundException());
    }
}
