package me.victorsung.springboot.web.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by victorsung.
 * Date: 2021/03/22
 * Time: 12:24 오전
 */
//JpaRepository<Entity 클래스, PK타입>을 상속하면 기본적인 CRUD 메소드가 자동으로 생성된다.
//Entity 클래스와 기본 Entity Repository는 함께 위치해야한다.
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
