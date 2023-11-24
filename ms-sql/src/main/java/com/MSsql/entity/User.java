package com.MSsql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false, unique = true)
	private String email;
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setFirstName(Object firstName2) {
		// TODO Auto-generated method stub
		
	}
	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}
	public Object getLastName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setLastName(Object lastName2) {
		// TODO Auto-generated method stub
		
	}
	public void setId(Long userId) {
		// TODO Auto-generated method stub
		
	}

}
