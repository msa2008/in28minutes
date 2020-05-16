package com.in28minutes.studentrestfulwebservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.studentrestfulwebservice.models.Student;
import com.in28minutes.studentrestfulwebservice.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.getAllStudents();
	}

	@Override
	public Student getAllById(Integer id) {
		return studentRepository.getAllById(id);
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void delete(Integer id) {
		studentRepository.delete(id);
	}

}
