package com.devtiro.blog.controllers;

import com.devtiro.blog.domain.dtos.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/posts")
@RequiredArgsConstructor
public class PostController {

    @GetMapping
    public ResponseEntity<List<PostDto>> getAllPosts() {
        return null;
    }
}
