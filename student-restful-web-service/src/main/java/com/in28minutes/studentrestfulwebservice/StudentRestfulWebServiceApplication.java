package com.in28minutes.studentrestfulwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class StudentRestfulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRestfulWebServiceApplication.class, args);
	}

}
