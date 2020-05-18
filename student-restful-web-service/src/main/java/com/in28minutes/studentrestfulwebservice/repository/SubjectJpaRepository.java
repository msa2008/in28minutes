package com.in28minutes.studentrestfulwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28minutes.studentrestfulwebservice.models.Subject;

@Repository
public interface SubjectJpaRepository extends JpaRepository<Subject, Integer> {

}
