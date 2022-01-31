package com.restapi.jdbc;

import com.restapi.jdbc.dao.OrderDetailsDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class RestapiJdbcAssignmentApplication {

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
    OrderDetailsDao dao;

	public static void main(String[] args) {
		SpringApplication.run(RestapiJdbcAssignmentApplication.class, args);
	}

}

