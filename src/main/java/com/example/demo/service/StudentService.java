package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	Student savestudent(Student student);
	Student findStudentByID(int id);
	Student updateStudent(Student student);
	void delete(int id);

}
