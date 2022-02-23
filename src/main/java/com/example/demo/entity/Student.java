package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="studentInfo")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String fname;
	
	@Column(nullable = false)
	private String lname;
	
	@Column(nullable = false)
	private String email;
	
	public Student() {
		
	}

	public Student( String fname, String lname, String email) {
		super();
		//this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	
	
	
	

}
