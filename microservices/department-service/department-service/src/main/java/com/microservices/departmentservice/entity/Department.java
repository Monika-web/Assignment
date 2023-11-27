package com.microservices.departmentservice.entity;

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
@Table(name = "departments")
public class Department {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String departmentName;
	    private String departmentDescription;
	    private String departmentCode;
		public Department(Object id2, Object departmentName2, Object departmentDescription2, Object departmentCode2) {
			// TODO Auto-generated constructor stub
		}
		public Object getID() {
			// TODO Auto-generated method stub
			return null;
		}
		public Object getDepartmentName() {
			// TODO Auto-generated method stub
			return null;
		}
		public Object getDepartmentDescription() {
			// TODO Auto-generated method stub
			return null;
		}
		public Object getDepartmentCode() {
			// TODO Auto-generated method stub
			return null;
		}
		

}
