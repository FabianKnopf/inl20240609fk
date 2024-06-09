package com.example.inl20240609fk.Controller;

import com.example.inl20240609fk.Entities.User;
import com.example.inl20240609fk.Services.UserService;
import com.example.inl20240609fk.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    @PreAuthorize("hasRole('client_ADMIN')")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    @PreAuthorize("hasRole('client_ADMIN')")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
    }

    @PostMapping("/newuser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}