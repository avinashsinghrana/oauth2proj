package com.auth.credential.service;

import com.auth.credential.dto.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> users = new ArrayList<>();

    public UserService() {
        this.users.add(new User("Avinash", "avinash.rana@gmail.com", "9878655654"));
        this.users.add(new User("Adarsh", "adarsh.kumar@gmail.com", "8767656543"));
    }

    public List<User> getAllUsers() {
        return this.users;
    }

    public User getSpecificUsers(String username) {
        return users.stream().filter(u -> u.email.equals(username)).findAny().orElse(null);
    }


    public String addUser(User user) {
        users.add(user);
        return "User created successfully";
    }
}
