package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.BoardService;
import com.example.demo.service.UserService;

@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserService uService;
	
	@Autowired
	private BoardService bService;

	@Test
	public void userTest() {
		UserDto user = new UserDto();
		user.setUserId("test11");
		user.setUserPw("test11");
		user.setUserName("테스트11");
		user.setUserGender("남");
		user.setUserEmail("test11@gmail.com");
		uService.join(user);
		System.out.println(uService.getUser("test11"));
		System.out.println("/*** 로그인 결과 : " + uService.login("test11", "test11"));
	}
	
	@Test
	public void boardTest() {
		BoardDto board = new BoardDto();
		board.setWriter("test11");
		board.setPassword("1234");
		board.setTitle("test11");
		board.setContent("test11");
		bService.write(board);

		for (BoardDto b : bService.getBoardList())
			System.out.println("/*** " + b);
	}

	
}
