package com.microservices.bean;

public class Student {
	
	private int id;
	private String firstname;
	private String lastname;
	
	public Student(int id, String firstname, String lastname) {
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		
	}
	
	// Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for firstname
    public String getFirstname() {
        return firstname;
    }

    // Setter for firstname
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    // Getter for lastname
    public String getLastname() {
        return lastname;
    }

    // Setter for lastname
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
