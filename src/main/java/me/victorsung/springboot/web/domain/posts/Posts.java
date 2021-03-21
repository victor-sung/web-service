package me.victorsung.springboot.web.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by victorsung.
 * Date: 2021/03/22
 * Time: 12:11 오전
 */
@Getter
@NoArgsConstructor  //기본생성자 자동 추가
@Entity //Entity 클래스에서는 절대 Setter를 만들지 않는다.
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 500, nullable = false)
    private String title;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder    //생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(Long id, String title, String content, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
