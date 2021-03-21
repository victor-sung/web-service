package me.victorsung.springboot.web.domain.posts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by victorsung.
 * Date: 2021/03/22
 * Time: 12:25 오전
 */
@ExtendWith(SpringExtension.class)
@SpringBootApplication
class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @AfterEach  //각 @Test 마다 선처리
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    @DisplayName("test")
    void 게시글저장_불러오기(){
    	// given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("test@naver.com")
                .build());
    	// when
        List<Posts> postsList = postsRepository.findAll();
        // then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}