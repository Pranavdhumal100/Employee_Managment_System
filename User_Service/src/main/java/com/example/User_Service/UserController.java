package com.example.User_Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return service.getUser(id).orElse(null);
    }

    @GetMapping("/validate/{id}")
    public boolean validateUser(@PathVariable Long id) {
        return service.validateUser(id);
    }
}