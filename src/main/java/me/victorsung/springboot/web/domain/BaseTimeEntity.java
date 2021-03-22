package me.victorsung.springboot.web.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * Created by victorsung.
 * Date: 2021/03/22
 * Time: 2:47 오후
 */
@Getter
@MappedSuperclass//BaseTimeEntity을 상속할 경우 필드들도 컬럼으로 인식하도록 한다.
@EntityListeners(AuditingEntityListener.class)//Auditing기능을 포함시킨다.
public abstract class BaseTimeEntity {

    @CreatedDate//Entity가 생성되어 저장될때 시간이 자동저장
    private LocalDateTime createdDate;

    @LastModifiedDate  //Entity의 값을 변경할 때 시간이 자동저장
    private LocalDateTime modifiedDate;

}