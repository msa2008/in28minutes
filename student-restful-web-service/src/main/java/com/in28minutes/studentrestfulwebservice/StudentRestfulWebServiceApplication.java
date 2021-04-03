package com.in28minutes.studentrestfulwebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.in28minutes.studentrestfulwebservice.models.Student;
import com.in28minutes.studentrestfulwebservice.repository.StudentJpaRepository;

import javax.sql.DataSource;
@SpringBootApplication
@EnableJpaRepositories("com.in28minutes.studentrestfulwebservice.repository")
@EntityScan("com.in28minutes.studentrestfulwebservice.models")
public class StudentRestfulWebServiceApplication {
	
	 @Autowired
	    DataSource dataSource;
	 @Autowired
	 StudentJpaRepository studentJpaRepository;
	public static void main(String[] args) {
		SpringApplication.run(StudentRestfulWebServiceApplication.class, args);
	}
	
	
	public void run(String... args) throws Exception {
        System.out.println("Our DataSource is = " + dataSource);
        Iterable<Student> systemlist = studentJpaRepository.findAll();
        for(Student systemmodel:systemlist){
            System.out.println("Here is a system: " + systemmodel.toString());
        }
    }
}
