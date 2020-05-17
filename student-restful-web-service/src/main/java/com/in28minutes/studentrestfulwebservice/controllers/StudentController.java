package com.in28minutes.studentrestfulwebservice.controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.in28minutes.studentrestfulwebservice.exceptions.StudentNotFoundException;
import com.in28minutes.studentrestfulwebservice.models.Student;
import com.in28minutes.studentrestfulwebservice.services.StudentService;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	// GET /students <--get all list of students
	@GetMapping(value = "/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	// GET /students/{id} <--get single student by id
	@GetMapping(value = "/students/{id}")
	public Student getAllById(@PathVariable Integer id) {
		Student student = studentService.getAllById(id);
		if (student == null)
			throw new StudentNotFoundException("User not found with id:" + id);
		
	/*	Dynamic Filter code
	 * 
	 * SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.serializeAll();// .filterOutAllExcept("id");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(student);
		mapping.setFilters(filters);*/

		
		return student;
		//return mapping;
	}

	// POST /students <--add single student
	@PostMapping(value = "/students")
	public ResponseEntity<Student> save(@Valid @RequestBody Student student) {
		studentService.save(student);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(student.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	// PUT /students <--update single student by id
	@PutMapping(value = "/students")
	public ResponseEntity<Student> update(@RequestBody Student student) {
		Student std = studentService.getAllById(student.getId());
		if (student == null)
			throw new StudentNotFoundException("User not found with id:" + student.getId());
		studentService.save(student);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(student.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}

	// DELETE /students/{id} <--delete single student by id
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Student> delete(@PathVariable Integer id) {
		Student student = studentService.getAllById(id);
		if (student == null)
			throw new StudentNotFoundException("User not found with id:" + id);
		studentService.delete(id);
		return ResponseEntity.ok().build();
	}
}
