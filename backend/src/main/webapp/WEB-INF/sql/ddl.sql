--spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
--spring.datasource.url=jdbc:mysql://127.0.0.1:3306/book_ex?serverTimezone=Asia/Seoul
--spring.datasource.username=zerock
--spring.datasource.password=zerock
 
CREATE TABLE user (
  userId VARCHAR(50) NOT NULL PRIMARY KEY,
  userPw VARCHAR(50) NOT NULL,
  userName VARCHAR(50) NOT NULL,
  userGender VARCHAR(10) NOT NULL,
  userEmail VARCHAR(50) NOT NULL
);
 
CREATE TABLE board (
  num INT PRIMARY KEY AUTO_INCREMENT,
  title VARCHAR(100),
  content VARCHAR(1000),
  writer VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  writeDate VARCHAR(50) NOT NULL,
  FOREIGN KEY(writer) REFERENCES user(userId)
  ON UPDATE CASCADE
);

insert into user values ('test1', 'test1', 'test1', 'male', 'test1@naver.com');
insert into user values ('test2', 'test2', 'test2', 'female', 'test2@naver.com');
insert into user values ('test3', 'test3', 'test3', 'male', 'test3@naver.com');

select * from user;

insert into board values (1,'test1','test1','test1','test1','2021-02-16');
insert into board values (2,'test2','test2','test2','test2','2021-02-16');
insert into board values (3,'test3','test3','test3','test3','2021-02-16');

select * from board;
 
