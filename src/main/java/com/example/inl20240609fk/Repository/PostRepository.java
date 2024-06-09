package com.example.inl20240609fk.Repository;

import com.example.inl20240609fk.Entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {}