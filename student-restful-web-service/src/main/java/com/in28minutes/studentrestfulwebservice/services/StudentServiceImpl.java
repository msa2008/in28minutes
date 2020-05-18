package com.in28minutes.studentrestfulwebservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.studentrestfulwebservice.models.Student;
import com.in28minutes.studentrestfulwebservice.repository.StudentJpaRepository;
import com.in28minutes.studentrestfulwebservice.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository studentRepository;

	
	@Autowired
	StudentJpaRepository studentJpaRepository;
	
	
	@Override
	public List<Student> getAllStudents() {
		return studentJpaRepository.findAll();
		//return studentRepository.getAllStudents();
	}

	@Override
	public Student getAllById(Integer id) {
		Optional<Student> student = studentJpaRepository.findById(id);
		return student.get();
		//return studentRepository.getAllById(id);
	}

	@Override
	public void save(Student student) {
		studentJpaRepository.save(student);
		//studentRepository.save(student);
	}

	@Override
	public void delete(Integer id) {
		studentJpaRepository.deleteById(id);
		//studentRepository.delete(id);
		
	}

}
