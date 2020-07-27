package com.rk.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    UserRepo userRepo;

    @GetMapping(path="/test")
    public String test(){
        return "Hello guys!!";
    }


    @GetMapping(path="/users")
    public @ResponseBody Iterable<User> getUsers(){
        return userRepo.findAll();
    }
}
