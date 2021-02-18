package com.inviilia.carsDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.inviilia.carsDemo.controller","com.inviilia.carsDemo.repository","com.inviilia.carsDemo.service"})
@EntityScan(basePackages = {"com.inviilia.carsDemo.entity"})
@EnableJpaRepositories(basePackages = {"com.inviilia.carsDemo.repository"})
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
