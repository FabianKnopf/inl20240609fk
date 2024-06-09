package com.example.inl20240609fk.Services;

import com.example.inl20240609fk.Entities.Post;

import java.util.List;
import java.util.Optional;

public interface PostServiceInterface {
    void deletePost(Long id);
    Optional<Post> getPostById(Long id);
    List<Post> getAllPosts();
    Post createPost(Post post);
    Post updatePost(Long id, Post postDetails);

}

