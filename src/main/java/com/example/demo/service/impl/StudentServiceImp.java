package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;


@Service
public class StudentServiceImp implements StudentService{
    
	
	private StudentRepository studentrepository;
	
	public StudentServiceImp(StudentRepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentrepository.findAll();
	}

	@Override
	public Student savestudent(Student student) {
		
		return studentrepository.save(student);
	}

	@Override
	public Student findStudentByID(int id) {
		// TODO Auto-generated method stub
		return studentrepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepository.save(student);
	}

	@Override
	public void delete(int id) {
		studentrepository.deleteById(id);
		
	}

}
