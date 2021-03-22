# web-service

## h2 Database "http://localhost:8080"에 접속하여 JDBC URL: 입력주소는 로그확인
ex) H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:9d53407e-b4ae-4db1-9420'

## JPA Auditing
매번 DB에 삽입(insert)하기 전, 갱신(update)하기 전에 날짜 데이터를 등록/수정하는 코드가 여기저기 들어간다.
이 문제를 해결하기 위해 JPA Auditing을 사용한다.

출처 : 이동욱, 스프링부트와 AWS로 혼자 구현하는 웹 서비스
