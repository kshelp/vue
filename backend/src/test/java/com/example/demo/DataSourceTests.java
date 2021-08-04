package com.example.demo;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DataSourceTests {

    @Autowired
    DataSource dataSource;

    @Test
    public void run() throws Exception {

    	System.out.println("/*** DBCP: " + dataSource.getClass());
    	
        Connection connection = dataSource.getConnection();
        
        System.out.println("/*** Url: " + connection.getMetaData().getURL());
        System.out.println("/*** UserName: " + connection.getMetaData().getUserName());

    }
}