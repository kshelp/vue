package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.BoardService;
import com.example.demo.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserService uService;
	
	@Autowired
	private BoardService bService;

	@Test
	public void boardTest() {
		BoardDto board = new BoardDto();
		board.setWriter("test1");
		board.setPassword("1234");
		board.setTitle("test1");
		board.setContent("test1");
		bService.write(board);

		for (BoardDto b : bService.getBoardList())
			System.out.println("/*** " + b);
	}

	//@Test
	public void userTest() {
		UserDto user = new UserDto();
		user.setUserId("test12");
		user.setUserPw("test12");
		user.setUserName("테스트12");
		user.setUserGender("남");
		user.setUserEmail("test12@gmail.com");
		uService.join(user);
		System.out.println(uService.getUser("test12"));
		System.out.println("로그인 결과 : " + uService.login("test12", "test12"));
	}
}
