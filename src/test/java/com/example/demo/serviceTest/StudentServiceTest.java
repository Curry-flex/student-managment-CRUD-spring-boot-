package com.example.demo.serviceTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.impl.StudentServiceImp;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class StudentServiceTest {
	
	@MockBean
	private StudentRepository repo;
	
	@InjectMocks
	private StudentServiceImp service;
	
	@Test
	void testCreateStudent() {
		
		Student stu = new Student();
		  stu.setFname("Nelson");
		  stu.setLname("Edmund");
		  stu.setEmail("nelson@gmail.com");
		  
		  service.savestudent(stu);
		  
		  Student student = repo.save(stu);
		  
		  System.out.println(student);
		  //assertThat(student).isNotNull();
		
	}
	
	
}
