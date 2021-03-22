package me.victorsung.springboot.web;

import lombok.RequiredArgsConstructor;
import me.victorsung.springboot.web.dto.PostsResponseDto;
import me.victorsung.springboot.web.dto.PostsSaveRequestDto;
import me.victorsung.springboot.web.dto.PostsUpdateRequestDto;
import me.victorsung.springboot.web.service.posts.PostsService;
import org.springframework.web.bind.annotation.*;

/**
 * Created by victorsung.
 * Date: 2021/03/22
 * Time: 11:58 오전
 */
@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long sava(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
