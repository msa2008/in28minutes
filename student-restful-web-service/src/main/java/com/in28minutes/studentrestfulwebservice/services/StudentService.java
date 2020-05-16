package com.in28minutes.studentrestfulwebservice.services;

import java.util.List;

import com.in28minutes.studentrestfulwebservice.models.Student;

public interface StudentService {

	// GET /students <--get all list of students
	public List<Student> getAllStudents();

	// GET /students/{id} <--get single student by id
	public Student getAllById(Integer id);

	// POST /students <--add single student
	public void save(Student student);

	// DELETE /students/{id} <--delete single student by id
	public void delete(Integer id);

}
