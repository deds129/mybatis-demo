package ru.deds.mybatisdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.deds.mybatisdemo.model.User;

@RestController("/batis-api/users/")
public class UserController {
    
    @GetMapping("{id}")
    public User getUserById(@PathVariable("id") Long id){
        return null;
    }

    @GetMapping()
    public User getAllUsers(){
        return null;
    }

    @PostMapping()
    public User addUser(@RequestBody User user){
        return null;
    }

    @DeleteMapping()
    public User deleteUserById(@PathVariable("id") Long id){
        return null;
    }
    
}
