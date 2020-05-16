package com.in28minutes.studentrestfulwebservice.repository;

import java.util.List;

import com.in28minutes.studentrestfulwebservice.models.Subject;

public interface SubjectRepository {
	// GET /students/{id}/subjects <--get all subject by student id
	public List<Subject> getSubjectsByStudentId();
}
