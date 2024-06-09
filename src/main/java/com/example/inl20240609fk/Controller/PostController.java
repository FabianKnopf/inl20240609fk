package com.example.inl20240609fk.Controller;
import com.example.inl20240609fk.Entities.Post;
import com.example.inl20240609fk.Services.PostService;
import com.example.inl20240609fk.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    @PreAuthorize("isAuthenticated()")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping("/posts/{id}")
    public Post getPostById(@PathVariable Long id) {
        return postService.getPostById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
    }

    @PostMapping("/newpost")
    @PreAuthorize("isAuthenticated()")
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @PutMapping("/updatepost/{id}")
    @PreAuthorize("isAuthenticated()")
    public Post updatePost(@PathVariable Long id, @RequestBody Post postDetails) {
        return postService.updatePost(id, postDetails);
    }

    @DeleteMapping("/deletepost/{id}")
    @PreAuthorize("isAuthenticated()")
    public ResponseEntity<String> deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return new ResponseEntity<>("Bloggpost " + id + " was deleted!", HttpStatus.OK);
    }
}
