package com.auth.credential.controller;

import com.auth.credential.dto.User;
import com.auth.credential.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/all")
//    @PreAuthorize("hasRole('ADMIN')") // if we don't want to use antMatcher then we can perform this approach
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{username}")
    public User getSpecificUsers(@PathVariable String username) {
        return userService.getSpecificUsers(username);
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
