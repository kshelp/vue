package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseVO;
import com.example.demo.dto.UserVO;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@GetMapping
	public ResponseVO<?> getUsers() {
		ResponseVO<List<UserVO>> resp = new ResponseVO<>();
		
		List<UserVO> list = new ArrayList<>();
		list.add(new UserVO("테스트", "010-111-2222"));
		list.add(new UserVO("테스트", "010-444-2222"));
		list.add(new UserVO("LSH", "010-999-2222"));
		
		resp.setResponse(list);
		return resp;
	}
	
	@GetMapping("/{id}")
	public ResponseVO<?> getUser(@PathVariable int id) {
		ResponseVO<List<UserVO>> resp = new ResponseVO<>();
		
		List<UserVO> list = new ArrayList<>();
		list.add(new UserVO("테스트", "010-111-2222"));
		list.add(new UserVO("테스트", "010-444-2222"));
		list.add(new UserVO("LSH", "010-999-2222"));
		
		List<UserVO> list1 = new ArrayList<>();
		list1.add(list.get(id));
		
		//resp.setResponse((List<UserVO>) list.get(id));
		resp.setResponse(list1);
		return resp;
	}

}
