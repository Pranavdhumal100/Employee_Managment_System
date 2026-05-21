package com.example.User_Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User createUser(User user) {
        return repo.save(user);
    }

    public Optional<User> getUser(Long id) {
        return repo.findById(id);
    }

    public boolean validateUser(Long id) {
        return repo.existsById(id);
    }
}
