package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan(basePackages = "com.example.demo.dao")
@SpringBootApplication
public class ExgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExgApplication.class, args);
	}

}



