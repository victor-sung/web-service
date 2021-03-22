package me.victorsung.springboot.web.dto;

import lombok.Getter;
import me.victorsung.springboot.web.domain.posts.Posts;

/**
 * Created by victorsung.
 * Date: 2021/03/22
 * Time: 12:37 오후
 */
@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
