package com.devtiro.blog.controllers;

import com.devtiro.blog.domain.dtos.CreateTagRequest;
import com.devtiro.blog.domain.dtos.TagResponse;
import com.devtiro.blog.domain.entities.Tag;
import com.devtiro.blog.mappers.TagMapper;
import com.devtiro.blog.services.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

import static java.util.Arrays.stream;

@RestController
@RequestMapping(path = "/api/v1/tags")
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;
    private final TagMapper tagMapper;

    @GetMapping
    public ResponseEntity<List<TagResponse>> getAllTags() {
        List<Tag> tags = tagService.getTags();
        List<TagResponse> tagResponses = tags.stream()
                .map(tagMapper::tagResponse)
                .toList();

        return ResponseEntity.ok(tagResponses);
    }

    @PostMapping
    public ResponseEntity<List<TagResponse>> createTags(@RequestBody CreateTagRequest createTagRequest) {
        List<Tag> savedTags = tagService.createTags(createTagRequest.getNames());
//        System.out.println(savedTags);
        List<TagResponse> tagResponses =
                savedTags
                        .stream()
                        .map(tag -> tagMapper.tagResponse(tag))
                        .toList();

        return new ResponseEntity<>(
                tagResponses,
                HttpStatus.CREATED
        );
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteTag(@PathVariable UUID id){
        tagService.deleteTag(id);
        return new ResponseEntity<>(
                HttpStatus.NO_CONTENT
        );
    }
}
