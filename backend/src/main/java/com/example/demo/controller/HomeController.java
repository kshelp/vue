package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HomeController {
    
    //@RequestMapping(value="/")
	@GetMapping("/")
    public String index() {
		System.out.println("/** index.html **/");
        return "index";
    }
    
}

