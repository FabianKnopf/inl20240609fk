
package com.example.inl20240609fk.Services;

import com.example.inl20240609fk.Entities.User;
import java.util.List;
import java.util.Optional;

public interface UserServiceInterface {
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    User createUser(User user);
}