package me.victorsung.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by victorsung.
 * Date: 2021/03/21
 * Time: 10:13 오후
 */
@Getter
@RequiredArgsConstructor    //선언된 모든 final 필드가 포함된 생성자 생성해준다.
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
