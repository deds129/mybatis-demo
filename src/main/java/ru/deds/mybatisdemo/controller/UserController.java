package ru.deds.mybatisdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.deds.mybatisdemo.mapper.UserMapper;
import ru.deds.mybatisdemo.model.User;

import java.util.List;

@RestController
@RequestMapping(path="/api/users", produces="application/json")
@RequiredArgsConstructor
public class UserController {
    
    private final UserMapper userMapper;
    
    @GetMapping("{id}")
    public User getUserById(@PathVariable("id") Long id){
        return userMapper.findUserById(id);
    }

    @GetMapping()
    public List<User> getAllUsers(){
        return userMapper.findAllUsers();
    }

    @PostMapping()
    public void addUser(@RequestBody User user){
        userMapper.insertUser(user);
    }

    @DeleteMapping()
    public void deleteUserById(@PathVariable("id") Long id){
        userMapper.deleteUserById(id);
    }
    
}
