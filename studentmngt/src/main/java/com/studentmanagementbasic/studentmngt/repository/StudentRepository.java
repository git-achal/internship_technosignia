package com.studentmanagementbasic.studentmngt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentmanagementbasic.studentmngt.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
