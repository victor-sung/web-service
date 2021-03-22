# web-service

## JPA Auditing
매번 DB에 삽입(insert)하기 전, 갱신(update)하기 전에 날짜 데이터를 등록/수정하는 코드가 여기저기 들어간다.
ex)
```java

public void savePosts(){
  ...
  posts.setCreateDate(new LocalDate);
  postsRepository.save(poasts);
  ...
}

```
이 문제를 해결하기 위해 JPA Auditing을 사용한다.
