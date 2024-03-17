package com.startup.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableAutoConfiguration
//@EnableJpaRepositories(basePackages = {"com.startup.io.repository"})
//@ComponentScan(basePackages = {"com.startup.io.controller","com.startup.io.service"})
//@EntityScan(basePackages = {"com.startup.io.entity"})
//@EnableEurekaClient
public class ApplicationStartUp {
	
	private final static Logger log = LoggerFactory.getLogger(ApplicationStartUp.class);

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStartUp.class, args);
		log.warn("Server Started...");
	}

}
