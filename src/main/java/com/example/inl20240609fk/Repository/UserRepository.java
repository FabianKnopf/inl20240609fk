package com.example.inl20240609fk.Repository;

import com.example.inl20240609fk.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
