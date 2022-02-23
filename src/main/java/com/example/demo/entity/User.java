package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="logins")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int user_id;
 private String username;
 private String password;
 
 
 
 





@ManyToMany(
		 cascade = CascadeType.ALL,
		 fetch = FetchType.EAGER
		 )
 
 @JoinTable(
		 name="user_roles",
		 joinColumns = @JoinColumn(
				 name="user_id",
				 referencedColumnName = "user_id"
				 ),
		 inverseJoinColumns = @JoinColumn(
				 name="role_id",
				 referencedColumnName = "role_id"
				 )
				 
				
		 )
 private List<Roles> role;
 
 
 
}
