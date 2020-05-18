package com.in28minutes.jpain10steps;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28minutes.jpain10steps.models.Student;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Integer> {

}
