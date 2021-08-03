package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.ResponseVO;
import com.example.demo.dto.UserVO;
import com.example.demo.service.BoardService;

/**
 * Handles requests for the application home page.
 */
@RestController
@RequestMapping("/api/boardList")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	private BoardService boardService;

	@GetMapping
	public ResponseVO<?> boardList() throws Exception {
		System.out.println("/** /board/list ***/");
		
		ResponseVO<List<BoardDto>> resp = new ResponseVO<>();
		
		List<BoardDto> list = boardService.getBoardList();
		System.out.println("/** list.toString()=" + list.toString());
		
		resp.setResponse(list);
		return resp;
	}

}
