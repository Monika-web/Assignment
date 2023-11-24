package com.microservices.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.bean.Student;

@RestController
@RequestMapping("students")
public class StudentController {
	
	private int id;
	private String firstname;
	private String lastname;

	// http://localhost:8080/student
	@GetMapping("student")
	public ResponseEntity<Student> getStudent() {
		Student student = new Student(
				id= 1,
				firstname= "Lohith",
				lastname= "Ashwar"
					);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}
	
	// http://localhost:8080/students
	@GetMapping
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student(id=1, firstname="Lohith", lastname="Ashwar"));
		students.add(new Student(id=2, firstname="Ram", lastname="Kumar"));
		students.add(new Student(id=3, firstname="Sai", lastname="ram"));
		students.add(new Student(id=4, firstname="Vinod", lastname="kumar"));
		return students;
		
	}
	
	// Spring boot REST API with Path Variable
	// {id} - URI template variable
	// http://localhost:8080/students/1
	
	@GetMapping("{id}")
	public Student studentPathVariable(@PathVariable("id") int studentId) {
		return new Student(studentId, firstname="Lohith", lastname="Ashwar");
	}
	
	// Spring boot REST API with Request Param
	// http://localhost:8080/students/query?id=1
	@GetMapping("query")
	public Student studentRequestVariable(@RequestParam int id) {
		return new Student(id, firstname="Lohith", lastname="Ashwar");
	}
	
	// Spring boot REST API that handles HTTP POST Request
	// @PostMapping and @RequestBody
	
	@PostMapping("create")
	@ResponseStatus(HttpStatus.CREATED)
	public Student createStudent(@RequestBody Student student) {
		System.out.println(student.getId());
		System.out.println(student.getFirstname());
		System.out.println(student.getLastname());
		return student;
	}
	
	// Spring boot REST API that handles HTTP PUT Request -updating existing resource
	@PutMapping("{id}/update")
	public Student updateStudent(@RequestBody Student student, @PathVariable("id") int studentId) {
		System.out.println(student.getId());
		System.out.println(student.getFirstname());
		System.out.println(student.getLastname());
		return student;
	}
	
	// Spring boot REST API that handles HTTP DELETE Request
 
	@DeleteMapping("{id}/delete")
	public String deleteStudent(@PathVariable("id") int studentId) {
		System.out.println(studentId);
		return "Student deleted successfully";
	}
}
