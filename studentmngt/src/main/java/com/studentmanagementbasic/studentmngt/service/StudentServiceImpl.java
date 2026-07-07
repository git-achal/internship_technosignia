package com.studentmanagementbasic.studentmngt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagementbasic.studentmngt.entity.Student;
import com.studentmanagementbasic.studentmngt.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repository;

    @Override
    public Student addStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Integer id, Student student) {

        Student oldStudent = repository.findById(id).orElse(null);

        if (oldStudent != null) {

            oldStudent.setName(student.getName());
            oldStudent.setAge(student.getAge());
            oldStudent.setCourse(student.getCourse());
            oldStudent.setEmail(student.getEmail());

            return repository.save(oldStudent);
        }

        return null;
    }

    @Override
    public void deleteStudent(Integer id) {

        repository.deleteById(id);

    }

}
