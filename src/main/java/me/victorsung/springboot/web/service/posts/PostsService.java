package me.victorsung.springboot.web.service.posts;

import lombok.RequiredArgsConstructor;
import me.victorsung.springboot.web.domain.posts.Posts;
import me.victorsung.springboot.web.domain.posts.PostsRepository;
import me.victorsung.springboot.web.PostsApiController;
import me.victorsung.springboot.web.dto.PostsResponseDto;
import me.victorsung.springboot.web.dto.PostsSaveRequestDto;
import me.victorsung.springboot.web.dto.PostsUpdateRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by victorsung.
 * Date: 2021/03/22
 * Time: 12:05 오후
 */
@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    @Transactional
    public PostsResponseDto findById(Long id) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id = " + id));
        return new PostsResponseDto(posts);
    }
}
