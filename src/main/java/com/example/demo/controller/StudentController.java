package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
@RequestMapping("/")

public String listOfStudent(Model model) {
	model.addAttribute("student", service.getAllStudent());
	
	return "student";
	
}

@GetMapping("/student/add")

public String addNewStudent(Model model) {
	//create empty student to hold student form data
	Student student =new Student();
	
	model.addAttribute("student",student);
	return "create";
	
}
@PostMapping("/student/addNewStudent")
public String createStudent(@ModelAttribute("student") Student student) {
	service.savestudent(student);
	return "redirect:/";
	
	
}

@GetMapping("/student/edit/{id}")
public String getStudentEditForm(@PathVariable int id ,Model model) {
	
	model.addAttribute("student" ,service.findStudentByID(id));
	
	return "editStudent";
}

@GetMapping("/403")

 String errorPage() {
	
	return "403";
}

@PostMapping("/student/EditNewStudent/{id}")

public String editStudent(@PathVariable int id ,@ModelAttribute("student") Student student ,Model model) {
	
	//get student by id from databse
	Student existingstudent =service.findStudentByID(id);
	existingstudent.setId(id);
	existingstudent.setFname(student.getFname());
	existingstudent.setLname(student.getLname());
	existingstudent.setEmail(student.getEmail());
	
	//save student
	service.updateStudent(existingstudent);
	   
	return "redirect:/";
}

//Delete student
@GetMapping("/delete/{id}")

public String deleteStudent(@PathVariable int id) {
	
	service.delete(id);
	
	return "redirect:/";
}

}


