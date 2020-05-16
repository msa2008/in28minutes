package com.in28minutes.studentrestfulwebservice.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.in28minutes.studentrestfulwebservice.models.Student;
import com.in28minutes.studentrestfulwebservice.models.Subject;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
	public static List<Student> students = new ArrayList<>();
	static List<Subject> groupA = Arrays.asList(new Subject(12, "Physics", 100), new Subject(13, "Maths", 100),
			new Subject(14, "Chemistry", 100));
	static List<Subject> groupB = Arrays.asList(new Subject(12, "Physics", 100), new Subject(15, "Biology", 100),
			new Subject(14, "Chemistry", 100));

	static {
		students.add(new Student(1, "mayur", "wagholi", new Date(), groupA));
		students.add(new Student(2, "teju", "wagholi", new Date(), groupB));
		students.add(new Student(3, "vibhav", "alephata", new Date(), groupA));
	}

	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getAllById(Integer id) {
		for (Student s : students) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;
	}

	@Override
	public void save(Student student) {
		for (Student s : students) {
			if (s.getId() == student.getId()) {
				s.setAddress(student.getAddress());
				s.setDob(student.getDob());
				s.setName(student.getName());
				s.setSubjects(student.getSubjects());
				return;
			}
		}
		students.add(student);
	}

	@Override
	public void delete(Integer id) {
		Iterator<Student> itr = students.iterator();
		while (itr.hasNext()) {
			if (itr.next().getId() == id) {
				itr.remove();
				return;
			}
		}
	}
}
