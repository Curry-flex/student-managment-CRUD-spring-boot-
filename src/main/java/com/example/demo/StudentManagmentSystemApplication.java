package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Roles;
import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}
     @Autowired
	 private StudentRepository rep;
     
     @Autowired
     private UserRepository userrepo;
	@Override
	
	public void run(String... args) throws Exception {
		/*
	  Student stu1 = new Student("Halima","mtati","halima@gmail.com");
	  rep.save(stu1);
	  
	  Student stu2 = new Student("Tina","Anorld","tyna@gmail.com");
	  rep.save(stu2);
	  
	  Student stu3 = new Student("Issa","vikindu","bxissa@gmail.com");
	  rep.save(stu3);
	  Student stu4 = new Student("Juma","farid","juma@gmail.com");
	  rep.save(stu4);
	  
		
	
	
	
	Roles role1 = new Roles();
	role1.setRole_name("USER");
	
	
    
	List<Roles> rolelist = new ArrayList<Roles>();
	rolelist.add(role1);
	//rolelist.add(role2);
	
		
    User user2 = new User();
    user2.setUsername("tyna");
    user2.setPassword("123456");
    user2.setRole(rolelist);
    
   
	

	userrepo.save(user2);

    
    
*/
		
	}

}
